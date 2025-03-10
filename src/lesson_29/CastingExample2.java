package lesson_29;

import lesson_28.animals.Animal;
import lesson_28.animals.Cat;
import lesson_28.animals.Dog;
import lesson_28.animals.Hamster;

/*** Author: Roman Romashko Date: 06.03.2025 ***/

/*

Объекты могут принадлежать классу X и при этом могут быть приведены к другому типу, если между классами
есть связь наследования. Это называется кастингом (casting)/

Кастинг бывает двух видов:

- Восходящее преобразование (upcasting) - преобразование объекта дочернего класса в тип род.класса
- Нисходящее (downcasting) - преобразование объекта род. класса обратно в тип дочернего класса

 */

public class CastingExample2 {
    public static void main(String[] args) {

        // Восходящее и нисходящее преобразование

        // Восходящее образование происходит автоматически

        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal

        /*
        Тип ссылочной переменной определяет:

        1. Ссылки на объекты каких типов могут храниться в этой переменной
        2. Список методов, которые можно вызвать обращаясь к этой переменной



         */
        animal.voice();

        Animal animal1 = new Hamster();

        // Сейчас объект Hamster
        animal1.voice();

        Animal[] animals = new Animal[3];

        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        //Object obj = new Cat();
        //obj.voice();


        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }


        // Нисходящее преобразование
        Animal animal2 = new Dog();


        System.out.println("\n=============");

        int intX = 10;

        double doubleX = intX; // неявное автоматическое

        System.out.println(doubleX);

        intX = (int) doubleX; // явное преобразование

        Animal animalD = new Dog(); // Upcasting

        Dog dog = (Dog) animalD; // Downcasting


        dog.bark();

        Animal animalCat = new Cat();

        // Если попыттатться привести объект к неверному типу - будет ошибка компиляции
        //
        // Dog dog1 = (Dog) animalCat;
        // dog1.bark();


        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            animal2.voice();
            if (currentAnimal instanceof Cat  ){

                System.out.println(currentAnimal + " -> is a CAt");
                Cat catlink = (Cat) currentAnimal;
                catlink.eat();

            }

            if (currentAnimal instanceof Dog  ){

               // System.out.println(currentAnimal + " -> is a CAt");
                Dog doglink = (Dog) currentAnimal;
                doglink.bark();

            }

            System.out.println("===================");
        }











        // Восходящее преобразование




    }
}
