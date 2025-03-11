package lesson_30.interfaces;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public interface Printable{

    public static final String color = "block";


    void print();

    default void defaultMethod(){
        System.out.println("Default method");
    }

    // Начиная с JDK 8 доступны статистические методы
    static void testStaticMethod(String str){
        System.out.println("Static method:" + str);


    }

    // с JDK 9 появились приватные методы (статические и нестатические)
    // Переопределить в классе невозможно


}
