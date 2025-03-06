package lesson_28.animals;

/*** Author: Roman Romashko Date: 06.03.2025 ***/

public class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eat!");

    }

    // переопределение род.метода
    // Анотация

    @Override
    public void voice(){
        System.out.println("Cat say MEOW!");

    }

}
