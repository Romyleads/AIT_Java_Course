package lesson_29.children;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class App {
    public static void main(String[] args) {

        Parent parent = new Parent("");

        System.out.println(parent.name);

        Child child = new Child();

        System.out.println(child.name);

        System.out.println(child.age);

        System.out.println("\n===========");

        Child child2 = new Child( "Child",  100);

        System.out.println(child2.name);

        System.out.println(child2.age);


    }
}
