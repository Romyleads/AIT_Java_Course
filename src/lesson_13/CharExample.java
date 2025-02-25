package lesson_13;

public class CharExample {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // буква А через символ, соответствующий коду 65 в десятичной СС
        char a2 = 0x41; // 16-ричный формат, который соответствует букве А
        char a3 = '\u0041'; // Еще один способ задать код в 16-ом формате

        char x = '\u15EE';


        System.out.println("a: " + a); // А - лат. алфавита
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);

        System.out.println("x: " + x);
        System.out.println("x1: " + '\u15EF');

        System.out.println("\n============================\n");

        char letter = 'A';
        letter++; // увеличение кода символа
        System.out.println("letter: " + letter);

        char digit = 48; // коду 49 соответствует символ 0
        System.out.println("digit: " + digit);

        digit += 5; // digit = digit + 5
        System.out.println("digit: " + digit);

        /*
        0.....9 -> 48...57
        a.....z -> 97....122
        A.....Z -> 65....90

         */

        digit = (char) (digit + 3);
        byte b1 = 120;
        b1 = (byte) (b1 + 1);

        //Чтобы получить код символа в 10-ти СС нужно привести тип char к типу int
        System.out.println("int из char: "+ (int) digit);
        System.out.println(0 + digit);


        char x1=12853;
        System.out.println("x1: "+x1);










    }
}
