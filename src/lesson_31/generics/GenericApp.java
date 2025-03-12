package lesson_31.generics;

import lesson_28.animals.Cat;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hallo");
        String value = box.getValue();
        System.out.println(value.toUpperCase());

        System.out.println(box.getValue().length());

        box.setValue("Ura");

        System.out.println(box);


        System.out.println("====================");

        GenericBox<Cat> catBox = new GenericBox<>(new Cat());

        System.out.println(catBox.getValue());

        // Нельзя поместить другой тип данных
        //catBox.setValue("String");
        // GenericBox<int> intBox = new GenericBox<int>(5);

        // Классы обертки, для хранения примитивов

        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);

        System.out.println(intBox);

        int sum = intBox.getValue() + intBox2.getValue();

        System.out.println(sum);
        // За счет автоупаковки я не беспокоюсь о примитивах

    }
}
