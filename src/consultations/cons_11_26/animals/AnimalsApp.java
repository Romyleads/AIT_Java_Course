package consultations.cons_11_26.animals;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class AnimalsApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik");
        dog.eat(); // унаследован от Animal
        System.out.println(dog.getName());
        System.out.println(dog.toString());

        System.out.println("\n===========================");

        dog.bark(); // метод класса Dog

        Cat cat = new Cat("Catty");

      //  cat.setName("Мурка"); // метод получен в наследство от Animal
        System.out.println(cat.toString());
        cat.eat();
    }
}
