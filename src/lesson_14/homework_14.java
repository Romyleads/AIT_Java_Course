package lesson_14;

import java.util.Scanner;

public class homework_14 {
    public static void main(String[] args) {

        /*
        Task 1
Дан текст Programming is fun.

Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.

Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

равны ли переменные,

не равны ли они,

больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран.

Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
Task 4
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }
}
Copy
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.


         */

        System.out.println("\nЗадание 1.");

        String fun = new String("Programming is fun");

        //Инициализация переменной согласно задания, содержащей проверку строки на наличие подстроки
        boolean prog = fun.contains("fun");

        // Вывод результата в консоль
        System.out.println("Содержит ли строка в задании \"fun\": " + prog);

        System.out.println("\nЗадание 2.");

        // Инициализация и ввод случайных значений в заданных диапазонах
        int a = 5;
        int b = -20;

        // Выведем им для удобства в консоль
        System.out.println("a: " + a + "\nb: " + b);

        // Осуществляем проверки согласно задания и выводим результат
        System.out.println("равны ли переменные: " + (a == b));
        System.out.println("не равны ли переменные: " + (a != b));
        System.out.println("a больше b: " + (a > b));
        System.out.println("b меньше a: " + (b < a));

        System.out.println("\nЗадание 3.");

        Scanner scanner = new Scanner(System.in);

        //Число: 6 четное: true; кратно 3: true; четное и кратное 3: true

        // Запрашиваем у пользователя целое число
        System.out.println("Введите целое число:");

        // По заданию пользователь должен ввести правильное число, но мы хотим защиту от дурака

        // Проверяем, является ли ввод целым числом
        while (!scanner.hasNextInt()) {
            System.out.println("Введите целое число!");
            scanner.next();  // переходим к новому числу, пока не увидим целое
        }

        int num = scanner.nextInt();
        //scanner.nextLine();

        //Выводим результат на экран
        System.out.println("Число: " + num + " четное: " + (num % 2 == 0) + "; кратно 3: " + (num % 3 == 0) + "; четное и кратное 3: " + ((num % 2 == 0) && (num % 3 == 0)));

        System.out.println("\nЗадание 4.");

        /*

        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);

         */

        // В этой программе в консоли будут выводиться по порядку строки от Result 1 до Result 5
        // с результатом проверки различных условий с арифм. операциями над числами a и b,
        // значение результата которых записано в булевую переменную result

        // Скорее всего там будет такое:

        /*
        Result 1: true
        Result 2: true
        Result 3: false
        Result 4: true
        Result 5: false
         */

        // Объяснение

        // для Result 1 будет выполнение в начале сложение 8 + 3, потом это будет сравнено с 10, так как 11 > 10 - будет true
        // для Result 5 будет выполнение в начале проверка остатка от деления 8 на 3, и если оно равно 2, а так и есть,
        // то инвертирование из true даст false
    }
}
