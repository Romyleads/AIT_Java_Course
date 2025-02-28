package homeworks.hw_23;

import java.util.Arrays;

/*** Author: Roman Romashko Date: 26.02.2025 ***/

public class MagicArrayEncaps {
    private int[] array;
    private int cursor; // по умолчанию 0

    // Методы, расширяющие функционал массива

    public MagicArrayEncaps() {
        this.array = new int[10];
        this.cursor = 0;
    }

    public MagicArrayEncaps(int[] array) {
        //Todo Homework

        //this.array=array;
        //cursor=this.array.length;

        if (array == null || array.length == 0) {
            this.array = new int[10]; // Создаем пустой массив на 10 элементов
            this.cursor = 0; // Массив пуст, курсор в начало
        } else {

            this.array = new int[array.length * 2]; //
            add(array);

            /*
            // Скопируем переданный массив по порядку
            this.array = new int[array.length]; // Инициализируем новый массив нужного размера
            for (int i = 0; i < array.length; i++) {
                this.array[i] = array[i];// Копируем элементы
            }
             */
            // this.cursor = array.length*2; // Ставим курсор на последний свободный индекс
        }


    }

    // Добавление в массив одного элемента
    private void add(int value) {

        // Проверка! Есть ли свободное место во внутреннем массиве, а если нет, то добавить место

        if (cursor == array.length) {
            // Расширить внутренний массив перед добавлением нового значения
            expandArray();
        }
        array[cursor] = value;
        cursor++;

    }

    private void expandArray() {

        System.out.println("Расширяем внутренний массив! Курсор равен " + cursor);

        /*
        1. Создать новый массив
        2. Перезаписать в новый массив из старого до курсора
        3. Перебросить ссылку
         */

        // 1.
        int[] newArray = new int[array.length * 2];

        // 2.
        for (int i = 0; i < cursor; i++) {

            newArray[i] = array[i];
        }

        // 3. Перебрасываем ссылку
        array = newArray;

    }

    void add(int... numbers) {
        //c numbers я могу общаться точно также как со ссылкой на массив int
        //System.out.println("Принял несколько int: "+ numbers.length);
        //System.out.println(Arrays.toString(numbers));
        //System.out.println("У каждого есть свой индекс: "+ numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }

    // Возвращает строковое представление массива

    public String toString() {

        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }
        //result+="]";
        return result;
    }

    // 5. Текущее кол-то элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {

        if (index >= 0 && index < cursor) {
            return array[index];
        }


        // Fixme Указать место в коде с ошибкой / проблемой
        //
        // Код, если индекс не корректный
        // Нет хорошего варианта решения
        return -2_147_483_647;
        // TODO Поправить обработку некорректного индекса
    }

    // Удалить элемент по индексу. Вернуть старое значение

    int remove(int index) {

        /*
        1. Проверка индекса на валидность (что он не выходит за границы)
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть удаленное значение
         */

        if (index >= 0 && index < cursor) {

            // Логика удаления
            int value = array[index]; // запоминаем старое значение

            // FixmeDn cursor -1

            for (int i = index; i < cursor - 1; i++) { // сдвигаем все влево
                array[i] = array[i + 1];
            }
            // уменьшаем курсор
            cursor--;

            // Создаем новый массив уменьшенного размера и копируем в него данные
            int[] newArray = new int[cursor];
            for (int i = 0; i < cursor; i++) {
                newArray[i] = array[i];
            }

            array = newArray; // Переключаем ссылку

            return value; // вернуть старое значение

        } else {

            return -2_147_483_647;
        }


    }

    // 9. Поиск по значению
    // {1,100,5,24,0} --> indexOf(100) =1; indexOf(50) = -1;

    int indexOf(int value) {

        // Перебираем все элементы,
        // Если элемент равен искомому - вернуть индекс такого элемента
        // Если ничего - вернуть -1

        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {

                return i;
            }
        }

        // Если ничего не совпало
        return -1;
    }

    // Возврат последнего вхождения
    // Логика необходимой работы: {1,100,5,100,24,100} - lastIndexOf(100) -> 5
    int lastIndexOf(int value) {
        // Todo Homework
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i; // Возвращаем индекс последнего вхождения
            }
        }
        // Возвращаем -1 если ничего не нашли
        return -1;
    }

    // Удалить первый элемент массива по заданному значению и вернуть true при успешном выполнении и false при отсутствии.
    // Так как на предыдущих этапах мы уже делали похожие процедуры, разумнее будет использовать их.
    boolean removeByValue(int value) {
        //Todo Homework

        //1. Есть ли элемент с таким
        //2. Если есть - ничего не пытаться удалить - вернуть false
        //3. Если найден - удалить и затем вернуть true


        int index = indexOf(value); // Определяем индекс первого вхождения

        if (index < 0) return false;

        // В эту строчку кода попадем только при index = 0 или больше
        remove(index);
        return true;

        //или как было дома:

        /*
        if (index != -1) {
            remove(index); // Вызываем remove
            return true;
        }
        return false;
        */


    }


    public int[] toArray() {
        int[] result = new int[cursor];

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        return result;
    }

    void test() {
        System.out.println(Arrays.toString(array));
    }
}

// [5,20]

/*
1. Добавлять в массив элемент (не думаю об индексах, размере массива)
2. Динамическое изменение размеров внутреннего массива
3. Возвратить строковое представление массива (все элементы массива в одной строке)
3. Вывести на экран все элементы массива (какие элементы там есть)
4. Добавить в массив сразу несколько значений ++
5. Текущее кол-то элементов в массиве
6. Возвращает значение по индексу
7. Удалить элемент по индексу (есть индекс - удалить элемент из массива)
8. Удалению элемента по значению. Чтобы возвращал boolean, Если удалил - вернул true, иначе false
9. Поиск по значению. Возвращает индекс первого вхождения элемента
10. Индекс последнего вхождения
11. Конструктор, принимающий обычный массив. Создать магический массив с элементами из этого массива
12. Написать метод, который вернет массив, состоящий из элементов магического массива.
 */
