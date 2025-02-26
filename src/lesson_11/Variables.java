package lesson_11;

public class Variables {

    public static void main(String[] args) {
    // Java - строго типизированный язык222 программирования,
        // а Пайтон - динамически типизированный язык222
        /*

        Каждая переменная должна иметь определенный тип данный, который не может измениться
        Тип данных определяет какие значения могут храниться в переменных и какие операции можно выполнить со
        значением этой переменной

        Объявляя переменную мы должны указать тип данных и выбрать уникальное имя
        Имена переменных ВСЕГДа пишутся с маленькой буквы и в camelCase нотации

         */
        int myFirstVariable; // декларация переменной типа int
        myFirstVariable = 1; // Инициализация значения - присвоение переменной

        int mySecondVariable = 25;

        System.out.println(mySecondVariable);

        mySecondVariable = 50; //

        System.out.println("mySecondVar:" + mySecondVariable);

        byte byteVar = 125; // Объявление и инициализация переменной типа byte
        byteVar = 0;
        System.out.println("Значение переменной byteVar:" + byteVar);

        short shortVar; // Объявление и инициализация переменной типа byte
        shortVar = 3100;
        System.out.println("Значение переменной shortVar:" + shortVar);

        long longVariable = 2_100_000_000_000L; // Объявление и инициализация переменной типа byte
        System.out.println("Значение переменной longVariable:" + longVariable);

        double doubleVariable = 10.5421; // Объявление и инициализация переменной типа byte
        System.out.println("Значение переменной doubleVariable:" + doubleVariable);


        double x = 0.1;
        double y = 0.2;
        double z = x + y;
        System.out.println(z);


    }
}
