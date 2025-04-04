package lesson_49.validator;

/*** Author: Roman Romashko Date: 04.04.2025 ***/

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("john@gmail.com", "qwerty");

        System.out.println(person);

        Person person1 = new Person("john.gmail.com","qwerty");

        System.out.println(person1);

    }
}
