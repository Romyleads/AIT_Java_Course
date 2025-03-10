package lesson_29.abstracts;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Application {
    public static void main(String[] args) {

        // Нельзя создать объект абстрактного класса
        // Animal animal = new Animal();

        Cat cat = new Cat();

        cat.eat();
        cat.sayHello();


    }
}
