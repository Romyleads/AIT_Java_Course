package lesson_32;

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

        // .valueOf() - преобразует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf(127);
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf(154.5);
        System.out.println("dbl:" + dbl);

        Boolean b1 = Boolean.valueOf("true");
        System.out.println("b1:"+ b1);

        System.out.println("=======================");

        //double dblP= Double.parseDouble("456");

        // parseXXX() преобразует строку в соответсвующий примитив

        double dblP = Double.parseDouble("456"); // возвращает примитив

        Double dblD = Double.valueOf("456"); // возвращает ссылочный тип

        System.out.println(dblP +" | " + dblD);

        System.out.println(Integer.parseInt("123"));

        // toString - переопределен метод, который возвращает строковое представление числа
        // equals - сравнивает два объекта по значению

        Integer i1 =127;
        Integer i2 =127;

        System.out.println(i1 > i2);

        // compareTo - сравнивает текущий объект с другим объектом. Кто больше?
        // Возвращаемое значение int

        System.out.println("i1.compareTo(i2): "+i1.compareTo(i2));
        System.out.println("i2.compareTo(i1): "+i2.compareTo(i1));

        System.out.println("\n=====================");

        // xxxValue() возвращает значение объекта как примитивный тип

        Double d2 = 125.67; // Автоупаковка

        d2 = Double.valueOf(125.67); // Явная / принудительная упаковка

        double dPrimitive = d2; // Автораспаковка

        dPrimitive = d2.doubleValue(); // Явная / принудительная распаковка

        System.out.println("\n=====================");

        /*
        Абстрактный класс Number. Все числовые обертки наследуются от абстр. класса Number
        Byte, Short, Integer, Long, Float , Double

         */

        /*
        byteValue()
        shortValue()

         */


        Integer integer = 31844;

        double dVal = integer.doubleValue();

        System.out.println(dVal);



        System.out.println(integer.floatValue());

        Double dWrapper = 245.78;

        int iVal = dWrapper.intValue();

        System.out.println(iVal);

        System.out.println("dWrapper.byteValue(): "+dWrapper.byteValue());

        System.out.println("dWrapper.intValue(): "+dWrapper.intValue());


    }


}
