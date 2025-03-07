package homeworks.hw_28.Task0.animals;

/*** Author: Roman Romashko Date: 06.03.2025 ***/




public class ZooApp {
    public static void main(String[] args) {

        Cat cat =new Cat();

        cat.voice();
        System.out.println(cat.toString());

        cat.eat();

        System.out.println("\n=====================");

        Dog dog=new Dog();
        dog.voice(); // если в потомке не определен метод voice - будет определена реализация родителя

        System.out.println(dog.toString());

        System.out.println("\n=====================");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("\n=====================");


        //Object object=new Object();
        //System.out.println(object.toString());



    }
}
