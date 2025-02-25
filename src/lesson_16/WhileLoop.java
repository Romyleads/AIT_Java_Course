package lesson_16;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.02.2025
 */

public class WhileLoop {
    public static void main(String[] args) {

        /*
        while (условие) {
            // Тело цикла
            // Код, который будет повторяться
        }
        - условие - выражение, которое возвращает true или false
        - Блок кода внутри {} (тело цикла) выполняется пока условие истинно.

        Предикат - условие вычисляется перед каждой итерацией цикла
         */

        // Вывести на экран числа от 1 жл 5 включительно

        int number = 1; // Инициализация переменной счетчика цикла

        while (number <= 5) {
            System.out.print(number + ", ");
            number++; // number = number + 1
        }

        System.out.println();

        System.out.println("Цикл закончен");

        /*
        number = 1;
        while (number <= 5) {
            System.out.print(number + ", ");
//            number++; Если мы забудем обновить значение переменной счетчика-цикла, то рискуем получить
            // бесконечный цикл
        }
         */

        // Бесконечный цикл
//        while (true) {
//            System.out.print("Hello! ");
//        }

        // Распечатать числа от 100 до 90 включительно в порядке убывания
        int i = 100;

        while (i >= 90) {
            System.out.print(i-- + ", ");
//            i--;
        }
        System.out.println();

        // Задача. Найти сумму чисел от 1 до 100

        /*
        1. Перебрать числа от 1 до 100
        2. Каждое число добавить в какую-то аккумулирующую (накапливающую сумму чисел) переменную
        3. После вывести значение переменной-акку
         */

        i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i++;
//            i++;
        }

        System.out.println("Сумма чисел от 1 до 100: " + sum);

        System.out.println("\n====================\n");

        //вывести на экран все четные числа в диапазоне от 1 до 21

        /*
        Запустить перебор чисел от 1 до 21.
        Проверить каждое (текущее в цикле) число на четность
            Если четное - распечатать
            Иначе - никаких действий не требуется.
        Взять следующее число из списка (новая итерация цикла)
         */

        i = 1;

        while (i <= 21){
//            System.out.println("Число, которое проверяем: " + i);
            // проверяем число на четность
            if (i % 2 == 0) { // число четное
                System.out.println(i++ + ", ");
            }
            i++;
        }
        System.out.println();

        System.out.println("\n ================================= \n");
        String str = "Hello!";

        // Распечатать каждый символ этой строки в отдельной строчке

        /*
        1. Нужно перебрать все индексы символов в этой строке.
        2. Минимальный индекс 0, максимальный индекс len - 1;
        3. Взять символ по текущему индексу. Вывести в консоль
        4. Повторить со следующим индексом
         */

        i = 0;
//        while ( i <= str.length() - 1) {
        while ( i < str.length()) {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }

        System.out.println("\n====== Opt 2 =======\n");

        i = 0;
        while (i < str.length()) {
            System.out.println(str.charAt(i++));
        }

        System.out.println("\n====================\n");

        // Пользователь ввел число больше 0.
        // и пока он не введет положительное число - выполнение программы не продолжится

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число: ");
        int input= scanner.nextInt();
        scanner.nextLine();

        // Цикл с предусловием
        while (input <= 0) {
            System.out.println("Введите положительное число: ");
            input = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Спасибо, вы ввели: " + input);

        // DRY - принцип - Не повторяй себя!

        // Цикл с постусловием
        // Цикл do-while - всегда выполняется тело цикла хотя бы один раз, независимо от того,
        // истинно условие или ложно

        /*
        do {
            // Тело цикла
        } while (условие)
         */

        int num;

        do {
            System.out.println("Введите число больше 0: ");
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num <= 0);

        System.out.println("Спасибо, вы ввели: " + num);



    }
}
