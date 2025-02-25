package lesson_16;

import java.util.Random;
import java.util.Scanner;

public class homework_16 {
    public static void main(String[] args) {

        /*
        Циклы
        Task 1
        Найдите произведение всех чисел от 1 до 15 включительно.

        Результат выведите на экран

        Task 2
        Используйте цикл while для решения задачи:

        Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".

        Task 3 *(Опционально)
        Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит правильное слово, программа благодарит его и завершает работу. Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.

        Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.

        Task 4 * (Опционально)
        Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.

        Пример:

        567432 -> 5+6+7+4+3+2 -> 27
        Copy
        Массивы
        Task 5
        Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

        Вывести на экран:

        Минимальное значение в массиве
        Максимальное значение в массиве
        Среднее арифметическое всех значений в массиве
        Task 6
        Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

        Пример:

        { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }

         */



        System.out.println("\nЗадание 1. ///////////////////////////////////////////////////////////////////// \n");

        // Объявляем две переменных
        int i = 1;
        double pro = 1;

        // Создаем цикл из 15 повторений
        while (i <= 15) {
//          System.out.println(i);
            pro *= i++;
        }
        System.out.printf("Proизведение чисел от 1 до 15: %.0f%n" , pro);

        System.out.println("\nЗадание 2. ///////////////////////////////////////////////////////////////////// \n");

        i = 1;
        while (i <= 10) {
            System.out.print("\"Task"+i+"\""+((i<10)?",":""));
            i++;
        }
        System.out.println();

        System.out.println("\nЗадание 3. ///////////////////////////////////////////////////////////////////// \n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово hello: ");
        String inputStr = scanner.nextLine().trim().toLowerCase();
        i = 1;

        // Пока не то, что нужно - повторяем запрос

        while (!inputStr.equals("hello")) {
            System.out.println("Введите слово hello: ");
            inputStr = scanner.nextLine().trim().toLowerCase();
            i++;

        }
        System.out.println("Спасибо, вы ввели: " + inputStr +", количество попыток: "+ i);

        System.out.println("\nЗадание 4. ///////////////////////////////////////////////////////////////////// \n");

        scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Введите число: ");
        int inputForSum= scanner.nextInt();
        scanner.nextLine();

        // На консультации мы разобрали новый способ перебора цифр, используем его

        while (inputForSum > 0) {
            sum += inputForSum % 10; // Берем последнюю цифру числа и суммируем с общей суммой
            inputForSum /= 10;       // Убираем последнюю цифру и записываем в inputForSum
        }

        System.out.printf("Сумма цифр: %.0f" , sum);

        System.out.println("\nЗадание 5. ///////////////////////////////////////////////////////////////////// \n");

        Random random = new Random();

        int[] num = new int[random.nextInt(5,16)];

        i = 0;
        System.out.print("[");

        while (i < num.length) {
            num[i] = random.nextInt(-50,51);
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]\n");

        // Минимальное, максимальное и суммарное значение в массиве

        int min = num[0];
        int max = num[0];
        double zum = 0;

        i = 0;
        while (i < num.length) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
            zum+=num[i];
            i++;
        }

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Среднее арифметическое значение в массиве: " + zum/num.length);

        System.out.println("\nЗадание 6. ///////////////////////////////////////////////////////////////////// \n");

        // возьмем уже сгенерированный массив num из 5 задания так как он нам подходит для дальнейших действий

        // Инициализируем минимум и максимум элементами массива
        int minimum = num[0];
        int maximum = num[0];

        // Инициализируем порядковые индексы элементов массива
        int minIndex = 0;
        int maxIndex = 0;

        i = 0;  // Индекс для цикла while
        while (i < num.length) {
            if (num[i] < minimum) {  // Если текущий элемент меньше минимума - обновляем минимум
                minimum = num[i];
                minIndex = i;  // Запоминаем индекс
            }
            if (num[i] > maximum) {  // Если текущий элемент больше максимума - обновляем максимум
                maximum = num[i];
                maxIndex = i;  // Запоминаем индекс
            }
            i++;  // Увеличиваем индекс для следующей итерации
        }

        // Меняем местами минимум и максимум

            num[minIndex] = maximum;
            num[maxIndex] = minimum;


        // Выводим результат
        i=0;
        System.out.print("[");

        while (i < num.length) {
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]\n");



    }
}
