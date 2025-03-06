package lesson_28.animals;

/*** Author: Roman Romashko Date: 06.03.2025 ***/

/*

Объекты могут принадлежать классу X и при этом могут быть приведены к другому типу, если между классами
есть связь наследования. Это называется кастингом (casting)/

Кастинг бывает двух видов:

- Восходящее преобразование (upcasting) - преобразование объекта дочернего класса в тип род.класса
- Нисходящее (downcasting) - преобразование объекта род. класса обратно в тип дочернего класса

 */

public class CastingExample {
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






    }
}
