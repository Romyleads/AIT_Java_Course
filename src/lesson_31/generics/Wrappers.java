package lesson_31.generics;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public class Wrappers {

    // Классы - обертки используются для представления примитивных типов как объектов (как ссылочных)

    /*

    Byte - обертка byte

    Short - обертка short

    Integer - обертка int

    Long - обертка long

    Float - обертка float

    Double - обертка double

    Character- обертка char

    Boolean - обертка boolean

*/

    public static void main(String[] args) {


        Integer maxValue = Integer.MAX_VALUE;

        System.out.println("max: " + maxValue);

        System.out.println("min: " + Integer.MIN_VALUE);

        // Поддержка null
        // int x = null; // примитив null не поддерживал
        maxValue = null;

        Integer wrapperInt =5 ; // Автоупаковка int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt;// Автораспаковка. Из инт авт. преобразование в примитив инт

        System.out.println(primitiveInt);


        System.out.println("=======================");


        Integer a = 127; // создан объект с адресом памяти @2aaa2
        Integer b = 127; // объект с таким значением уже есть, новый не создается, выдается ссылка на сущ.объект

        System.out.println("127 == 127: " + (a == b)); // true
        System.out.println("127 equals 127: " + (a.equals(b)));

        Integer c = 128; // создан новый объект с адресом @3bbb3
        Integer d = 128;

        System.out.println("128 == 128: " + (c == d)); // false
        System.out.println("128 equals 128: " + (c.equals(d)));





    }


}
