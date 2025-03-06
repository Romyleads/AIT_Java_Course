package lesson_28.animals;

/*** Author: Roman Romashko Date: 06.03.2025 ***/


/*
Переопределение позволяет подклассам изменять поведение методов родительского класса.
Оно происходит когда наследник (подскласс) предоставляет специфицескую реализацию метода, который уже определен в родительском классе (суперклассе)

 */

public class Animal {
    public void voice(){
        System.out.println("Animal say something");

    }

    public String toString(){
        return "Animal toString";

    }
}
