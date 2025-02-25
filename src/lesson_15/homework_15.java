package lesson_15;

import java.util.Random;
import java.util.Scanner;

public class homework_15 {
    public static void main(String[] args) {

        /*
        Task 1
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
Copy
Task 2
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7. Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".

Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

- Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
- Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
Copy
Task 4 * (Опционально)
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.

         */

        /////////////////////////////////////////////////////////////////////
        System.out.println("\nЗадание 1.");

        Random random = new Random();

        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);

        int maxVar = var1;

        if (var2 > maxVar) maxVar = var2;
        if (var3 > maxVar) maxVar = var3;
        if (var4 > maxVar) maxVar = var4;

        System.out.println("Максимальное число: " + maxVar);


        /////////////////////////////////////////////////////////////////////
        System.out.println("\nЗадание 2.\n");

        System.out.println("Введите число от 1 до 7");

        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
        scanner.nextLine();

        switch (answer) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }


        /////////////////////////////////////////////////////////////////////
        System.out.println("\nЗадание 3.\n");


        System.out.println("Введите четырехзначное число");

        Scanner scanner2 = new Scanner(System.in);

        String input = scanner2.nextLine();

        String inputClean = input.trim();

        // Вариант решения 1.
        // Не знаем ничего про код строки и его быстрое преобразование в инт

        // Чтобы понять, что перед нами четырехзначное число, нам нужно проверить каждый из 4 введенных символов
        // Для начала определим целочисленный диапазон стринговых цифр 0-9, с помощью конструкции:

        /*
        System.out.println("Цифра 0 имеет код: " + (int)'0'); // -> 48
        System.out.println("Цифра 9 имеет код: " + (int)'9'); // -> 57
        */
        // Итак, одна цифра, записанная в виде строки имеет целочисленный код от 48 до 57 включительно
        // Проверим каждый символ на вхождение в этот диапазон и выполним одновременную проверку их всех
        // При этом как мы видим чтобы из кода цифры строки получить его число - нужно отнять 48.
        //

        // Решение через сведение к int

        if (inputClean.length() == 4
                && (int) inputClean.charAt(0) >= 48 && (int) inputClean.charAt(0) <= 57
                && (int) inputClean.charAt(1) >= 48 && (int) inputClean.charAt(1) <= 57
                && (int) inputClean.charAt(2) >= 48 && (int) inputClean.charAt(2) <= 57
                && (int) inputClean.charAt(3) >= 48 && (int) inputClean.charAt(3) <= 57
        ) {
            System.out.println("Введено четырехзначное число: " + inputClean);

            if (inputClean.charAt(0) + inputClean.charAt(1) == inputClean.charAt(2) + inputClean.charAt(3)) {
                System.out.println((inputClean.charAt(0) - 48) + (inputClean.charAt(1) - 48) + " равно " + ((inputClean.charAt(2) - 48) + (inputClean.charAt(3) - 48)) + " - число счастливое");
            } else {
                System.out.println((inputClean.charAt(0) - 48) + (inputClean.charAt(1) - 48) + " не равно " + ((inputClean.charAt(2) - 48) + (inputClean.charAt(3) - 48)) + " - число не является счастливым");
            }

        } else {

            System.out.println("Ошибка! Не введено четырехзначное число, повторите еще раз!");
        }

        // Вариант решения 2.
        // Мы видим, что строка преобразуется в инт, с сохранением числа по следующему принципу:

        // символ.charAt(0)-"0", пример:

        // Конвертация 8 из строкового представления в числовое челочисленное:

        System.out.println("\n/////////////// Вариант решения 2 //////////////////\n");


        /*
        int num = "8".charAt(0)-'0'; // 55 - 48
        System.out.println("\"8\".charAt(0)-'0' = " + num);

        // Что аналогично ParseInt("8")
        System.out.println("Integer.parseInt(\"8\") = " + Integer.parseInt("8"));
        */

        // Решение через сведение к char

        // Проверяем на 4 символа и каждый символ через
        if (inputClean.length() == 4 &&
                inputClean.charAt(0) >= '0' && inputClean.charAt(0) <= '9' &&
                inputClean.charAt(1) >= '0' && inputClean.charAt(1) <= '9' &&
                inputClean.charAt(2) >= '0' && inputClean.charAt(2) <= '9' &&
                inputClean.charAt(3) >= '0' && inputClean.charAt(3) <= '9') {

            // Все символы цифры
            System.out.println("Введено число из 4 цифр: " + inputClean);

            // Проверка на счастливое число
            if (inputClean.charAt(0) + inputClean.charAt(1) == inputClean.charAt(2) + inputClean.charAt(3)) {
                System.out.println(
                        (inputClean.charAt(0) - '0') + (inputClean.charAt(1) - '0') +
                                " равно " + ((inputClean.charAt(2) - '0') + (inputClean.charAt(3) - '0')) +
                                " - число счастливое"
                );
            } else {
                System.out.println(
                        (inputClean.charAt(0) - '0') + (inputClean.charAt(1) - '0') +
                                " не равно " + ((inputClean.charAt(2) - '0') + (inputClean.charAt(3) - '0')) +
                                " - число не является счастливым"
                );
            }


        } else {
            // Не все цифры
            System.out.println("Это не число из 4 цифр. Повторите ввод немного позже.");
        }


        /////////////////////////////////////////////////////////////////////
        System.out.println("\nЗадание 4.\n");

        Random random2 = new Random();

        int note; // генерация случайного числа от 0 до 12 включительно

        int minForKind = 45;


        note = random2.nextInt(13); //

        System.out.println("Ребенок сегодня получил оценку: " + note);

        switch (note) {

            case 12:
            case 11:
            case 10:
                minForKind += 60;
                System.out.println("Мы очень рады!");
                break;
            case 9:
            case 8:
            case 7:
                minForKind += 45;
                System.out.println("Молодец!");
                break;
            case 6:
            case 5:
            case 4:
                minForKind += 15;
                System.out.println("Понятно.");
                break;
            case 3:
                minForKind -= 30;
                System.out.println("Печалька!");
                break;
            case 2:
            case 1:
            case 0:
                minForKind = 0;
                System.out.println("Сегодня никакого телевизора!");

        }

        if (minForKind<60){

            System.out.println("Сегодня ребенок может смотреть телевизор " + minForKind + " минут");
        } else System.out.println("Бинго! Ребенок может еще час смотреть телевизор!");

        String myDigFromSting = "8";
        int mydig=Integer.parseInt(myDigFromSting);
        // Что аналогично ParseInt("8")
        System.out.println("Integer.parseInt(\"8\") = " + mydig);



        }
    }
