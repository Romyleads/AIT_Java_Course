package lesson_30.flyable;

/*** Author: Roman Romashko Date: 10.03.2025 ***/


// Множественная реализация интерфейсов
public class Duck implements Swimmable,Flyable{

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}
