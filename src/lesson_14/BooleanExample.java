package lesson_14;

public class BooleanExample {
    public static void main(String[] args) {

        //boolean bol1 = true;
        //bol1 = false;

        //System.out.println(bol1);

        int x = 10;
        int y = 5;

        // Сравнение на равенство ==

        boolean b1 = x == y; // x равен y -> 10 равно 5 -> false
        System.out.printf("%s == %s -> %s\n", x, y, b1);

        // Сравнение на не равенство !=

        b1 = x != y;  // x не равен y
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        // Больше >
        b1 = x > y; // x больше y -> 10 > 10 -> false
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        y = 10;
        b1 = x > y; // x больше чем y -> 10 > 10 -> false
        System.out.printf("%s > %s -> %s\n", x, y, b1);


        // Больше или равно >=

        System.out.printf("*******");

        b1 = x >= y; // x меньше чем y -> 7 < 10 -> true
        System.out.printf("%s >= %s -> %s\n", x, y, b1);

        // Меньше

        y = 7;
        b1 = x < y; // x меньше чем y -> 7 < 10 -> true
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        // Меньше или равно
        b1 = x <= y; // x меньше или равен y -> 7 меньше или равен 10 -> true
        System.out.printf("%s <= %s -> %s\n", x, y, b1);

        String str="Java is the best";
        // Поиск вхождения подстроки
        // contains - возвращает true если строка сод. указ.посл. символов (подстроку)

        boolean contains = str.contains("Java"); // срока str содержит последовательность символов "Java"

        System.out.println("str.contains(\"Java\"): "+ contains);
        System.out.println("str.contains(\"java\"): "+ str.contains("java"));

        //startWith(), endWith() - начинается / завершается строка на ук. подстроку

        boolean startsWith = str.startsWith("Ja"); // срока str содержит последовательность символов "Java"

        System.out.println("str.startsWith(\"Ja\"): "+ startsWith);
        System.out.println("str.startsWith(\"ava\"): "+ str.startsWith("ava"));

        // Rename - Shift + F6

        boolean endsWith  = str.endsWith("best");
        System.out.println("str.endsWith(\"best\"): "+ endsWith);
        System.out.println("str.endsWith(\"Java\"): "+ str.endsWith("Java"));


        System.out.println("\n ========================= Логические операции =======================\n");

        // Логическое НЕ (отрицание) "!"
        // Меняет значение типа boolean на противоположное
        boolean b2 = !false;
        System.out.println("!false: " +b2);

        b2 = !(4==5);
        System.out.println("!(4==5): " +b2);

        // Составные сравнения - два условия

        System.out.println("Логическое и \"&\"");
        /*
        Логическое и "&"
        Используется когда нужно, чтобы оба условия были истинными
        Возвращает true если оба true

         */

        b2 = true & true;
        System.out.println("true & true: " +b2);
        System.out.println("true & false: " +(true & false));
        System.out.println("false & false: " +(false & false));
        System.out.println("false & true: " +(false & true));

        // Входит в диапазон
        // Введите число от 0 до 100

        int input=50;
        b2 = input>=0 & input <=100;
        System.out.println("input>=0 & input <=100: " +b2);

        input=150;

        b2 = input>=0 & input <=100;
        System.out.println("input>=0 & input <=100: " +b2);

        // Логическое ИЛИ "|"
        // Когда достаточно, чтобы хотя бы одно условие было истина

        System.out.println("\nЛогическое или \"|\"");

        b2 = true | false;

        System.out.println("true | false: " +(true | false));
        System.out.println("false | true: " +(false | true));

        System.out.println("true | true: " +(true | true));
        System.out.println("false | false: " +(false | false));


        // Логическое исключающее ИЛИ

        // Возвращает true, если части выражения разные

        System.out.println("\nЛогическое исключающее или \"^\"");

        b2 = true ^ false;

        System.out.println("true ^ false: " +(true ^ false));
        System.out.println("false ^ true: " +(false ^ true));

        System.out.println("false ^ false: " +(false ^ false));
        System.out.println("true ^ true: " +(true ^ true));

        System.out.println("Логическое сокращенное \"&&\"");
        /*
        Логическое сокращенное "&&"
        Используется когда нужно, чтобы оба условия были истинными
        Возвращает true если оба true, но обрывает выполнение лишних операций

         */

        b2 = true && true;
        System.out.println("true && true: " +b2);
        System.out.println("false && true: " +(false && true));


        System.out.println("true & false: " +(true & false));
        System.out.println("false & false: " +(false & false));

        int a=10;
        int b=0;

        boolean bol = (b!=0) && a/b >2; //
        System.out.println("bol: " +bol);


        System.out.println("Логическое сокращенное \"||\"");
        /*
        Логическое сокращенное "||"
        true || ? (не важно что) -> true
         */

        b=0;

        bol = true || (a/b >2);
        //bol = true | (a/b >2);
        System.out.println("bol: "+ bol);

        System.out.println("Приоритет логических операций");

        /*

        ! - макс
        &
        ^
        |
        &&
        ||

         */

        System.out.println("true ^ true & false: " +(true ^ true & false)); // true
        System.out.println("true ^ false: " +(true ^ false)); // true
        System.out.println("true: " +(true)); // true

        System.out.println("true ^ true && false: " +(true ^ true & false)); // true
        System.out.println("false && false: " +(false && false)); // true
        System.out.println("false: " +(false)); // true







    }
}
