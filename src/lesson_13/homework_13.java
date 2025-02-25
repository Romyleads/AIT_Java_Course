package lesson_13;

import java.util.Scanner;

public class homework_13 {
    public static void main(String[] args) {

/*
*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
Task 2.2
Замените в результирующей строке слово "powerful" на "super".
Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.

Пример программы:

public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        // Ваш код
    }
}
Copy
Output:

HANNA
Copy
Пояснение
Переменные ch1, ch2, ch3, ch4 и ch5 должны быть преобразованы из нижнего регистра в верхний с использованием только арифметических операций.
Вывод результата должен быть в виде строки с именем в верхнем регистре.
* */


        System.out.printf("\nЗадание 1.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        char first = name.charAt(0);
        char last = name.charAt(name.length()-1);

        System.out.println("В вашем имени: "+name.length()+" символов");

        //Чтобы получить код символа в 10-ти СС нужно привести тип char к типу int

        System.out.println("Первый символ вашего имени в десятичной системе: "+ (int)first +", последний символ: "+ (int)last);


        System.out.println("*******************************");
        System.out.printf("\nЗадание 2.\n");

        String lang="Java";
        String is="is";
        String a="a";
        String wie="powerful";
        String langDes="language";

        // Вариант объединения через +
        String Concat1= lang+" "+is+" "+a+" "+wie+" "+langDes;

        // Вариант объединения через метод join
        String Concat2= String.join(" ",lang,is,a,wie,langDes);

        System.out.println("Склеивание 1: "+Concat1+" Длина строки: "+Concat1.length());
        System.out.println("Склеивание 2: "+Concat2+" Длина строки: "+Concat2.length());

        System.out.println("*******************************");
        System.out.printf("\nЗадание 2.2\n");

        //Как вариант результирующей строки берем Concat1
        //Выполняем задание

        String replStr=Concat1.replace("powerful", "super");

        System.out.println("Строка после замены powerful->super: " + replStr);


        boolean containsAge = Concat1.contains("age");

        System.out.println("Содержит ли строка подстроку age: " + containsAge);



        System.out.println("*******************************");
        System.out.printf("\nЗадание 3\n");

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Введите строку четной длинны: ");
        String myString = scanner2.nextLine();

        // Чтобы найти первый средний символ - нужно общее количество символов и поделить на два и отнять один

        // Определяем индексы первого и второго среднего символа
        int centralleSymInd1 = myString.length() / 2-1;
        int centralleSymInd2 = myString.length() / 2;

        // Определяем символы
        char centralSym1 = myString.charAt(centralleSymInd1);
        char centralSym2 = myString.charAt(centralleSymInd2);

        // Выводи результат
        System.out.println("Для строки "+myString+" два средних символа строки "+centralSym1+centralSym2);



        System.out.println("*******************************");
        System.out.printf("\nЗадание 4\n");

        char ch1 = 'r';
        char ch2 = 'o';
        char ch3 = 'm';
        char ch4 = 'a';
        char ch5 = 'n';

        // Ваш код
        // Смотрю таблицу символов и замечаю, что все буквы идут по порядку и при этом маленькие и большие по алфавиту.
        // Исходя из этого предполагаю, что большие и маленькие буквы находятся на равноудалении друг от друга.


        // Попробуем определить дистанции между соответствующими буквами в общей таблице символов

        char ch6 = 'R';
        System.out.println(ch6-ch1);

        // Мы видим, что результат -32, это значит, что для того, чтобы из маленькой буквы получить большую - нужно отнять 32.
        // Проверяем, получим ли мы большую букву после вычитания от кода символа числа 32:

        System.out.println((char)(ch1-32));

        // Все верно, итак, зная, что верхние буквы находятся раньше на 32 знака, напишем решение:


        System.out.println(""+(char)(ch1-32)+(char)(ch2-32)+(char)(ch3-32)+(char)(ch4-32)+(char)(ch5-32));

        // Теперь все выводится большими буквами, бинго


    }
}
