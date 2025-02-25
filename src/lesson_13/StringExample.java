package lesson_13;

public class StringExample {
    public static void main(String[] args) {

        String greeting = "Hello World!";

        String string1= new String(("Hello!"));

        System.out.println(greeting);
        System.out.println(string1);

        // Метод length() - получить кол-во символов в строке
        int length = greeting.length(); // подсчет кол-ва символов
        System.out.println("length:" + length);
        System.out.println("Hello:".length());


        System.out.println(greeting.toUpperCase());

        System.out.println("greeting:" + greeting); // строка не изменилась

        String greetings2 = greeting.toLowerCase();

        System.out.println("greeting2:" + greetings2);

        greeting = greeting.toUpperCase();
        System.out.println("greeting:" + greeting);

        //String иммутабельна (неизменна) к методам

        System.out.println("\n==============================\n");
        // Варианты конкатенации:

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

                String concatStr= str1+str2+str3;
        System.out.println("concatStr: " + concatStr);

        System.out.println("\n==============================\n");

        System.out.println(1+3);
        System.out.println(1+3 + ":" + 2+3);
        System.out.println(1+3 + ":" + (2+3));


        System.out.println("\n==============================\n");


        // Конкатенация 2
        String concatStr2 = str1.concat(str2);

        System.out.println("concatStr2: " + concatStr2);

        concatStr2 = concatStr2.concat(str3);

        System.out.println("concatStr2: " + concatStr2);

        //тоже самое в цепочке методов

        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!");

        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация 3
        // Склеить несколько строк , вставляя пробел

        String concatStr5 = String.join(" ","Hello","World", "Test");



        System.out.println("concatStr5: " + concatStr5);

        System.out.println("\n==============================\n");

        String digits = "0123456789";

        System.out.println("digits.length() = "+ digits.length());

        // chartAt(index) - взять индекс по его индексу:

        char symbol = digits.charAt(4);
        System.out.println("symbol: "+ symbol);

        // Первый символ всегда имеет индекс 0. Последний (самый правый) - индекс ВСЕГДА равен (длина - 1)


        char first = digits.charAt(0);
        char last = digits.charAt(digits.length()-1);

        System.out.println("first: "+ first);
        System.out.println("last: "+ last);

        //Выделение подстроки

        String subString = digits.substring(2);
        System.out.println("subString = " + subString);

        System.out.println("digits = "+ digits);

        String subString2= digits.substring(2,7);
        System.out.println("subString2 = " + subString2);

        System.out.println("\n==============================\n");

        //Замена частей строки

        //replace(), replaceFirst(), replaceAll()


        String string=" One World One";
        String replStr=string.replace("One", "Papa");

        System.out.println("replStr = " + replStr);

        // replaceFirst() - замена только первого совпадения

        replStr=string.replaceFirst("One", "Papa");
        System.out.println("replStr = " + replStr);

        // Поддерживает регулярные выражения

        replStr=string.replaceAll("One", "Papa");
        System.out.println("replStr = " + replStr);

        String stringReg ="One World One Onix O";
        replStr = stringReg.replaceAll("\\bO\\w*","REPLACED");
        System.out.println("replStr = " + replStr);










    }
}
