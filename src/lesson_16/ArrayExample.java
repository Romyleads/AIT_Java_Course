package lesson_16;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.02.2025
 */

public class ArrayExample {
    public static void main(String[] args) {

        int x;
        x = 10;

        int[] array; // Объявление массива целых чисел
        //int array1[]; // Альтернативный способ объявления. НЕ РЕККОМЕНДУЮТСЯ использовать
        String[] strings; // Объявляем массив строк

        array = new int[4]; // создали (инициализировали) массив типа int с 4 ячейками
        strings = new String[10]; // Создали массив строк на 10 ячеек

        int[] array2 = new int[8]; // Объявление и инициализация массива int с 8 ячейками
        boolean[] bools = new boolean[3];

        /*
        Значения по умолчанию для типа данных.
        1. Для всех числовых типов (в том числе тип char) это будет 0 (0.0)
        2. Для boolean - false
        3. Для всех ссылочных типов данных - null. (null - ничто)
         */

        // Получить из массива значение, находящееся в ячейке с индексом 0
        int value = array2[0]; // получение значения по индексу
        System.out.println("array2[0]: " + value); // 0
        System.out.println("array2[7]: " + array2[7]); // 0

        System.out.println("bools[1]: " + bools[1]); // false

        System.out.println("strings[9]: " + strings[9]); // null

        System.out.println("x: " + x);

        // Распечатать все значения в массиве так не получится
        System.out.println(array2); // Получим ссылку на адрес я ячейке памяти Heap (где хранятся значения)

        // Явная инициализация массива значениями
        int[] numbers = new int[]{45, 56, -16, 0, 159}; // Будет создан массив размером = кол-ву элементов в {} скобках
        int[] ints = {-10, 54, 32333, 444}; // короткая форма явной инициализации.

        int val = numbers[0];
        System.out.println("numbers[0]: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100; // Присвоение нового значения в 2 ячейку
        int len = numbers.length; // длина массива (кол-во ячеек в массиве)
        System.out.println("numbers.length: " + len);

        // Перебрать индексы от 0 lj len -1
        System.out.println("Вывести все значения массива");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();

        // Создать массив на 10 элементов и заполнить его случайными числами от 0 до 100 включительно

        Random random = new Random();

        int[] num = new int[10];
        i = 0;
        System.out.print("[");
        while (i < num.length) {
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]");
        System.out.println("С новой строки");

        // Найти минимальное значение в массиве

        int min = num[0];
        i = 0;
        while (i < num.length) {
            if (num[i] < min) {
                min = num[i];
            }
            i++;
        }

        System.out.println("Минимальное значение в массиве: " + min);


    }
}
