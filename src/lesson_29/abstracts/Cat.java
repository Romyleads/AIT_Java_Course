package lesson_29.abstracts;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Cat extends Animal{

    @Override
    void move() {
        System.out.println("Двигается!");
    }

    @Override
    void eat() {
        System.out.println("Кушает!");
    }
}
