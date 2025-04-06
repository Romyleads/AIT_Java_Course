package homeworks.hw_49.validator;

/*** Author: Roman Romashko Date: 04.04.2025 ***/

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("john@gmail.com", "Qwerty123!");
        System.out.println(person);

        System.out.println("===========================");

        Person person1 = new Person("john.gmail.com","qwerty");
        System.out.println(person1);

    }
}
