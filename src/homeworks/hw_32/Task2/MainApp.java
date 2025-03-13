package homeworks.hw_32.Task2;

/*** Author: Roman Romashko Date: 13.03.2025 ***/

import homeworks.hw_32.Task0.MyArrayList;

public class MainApp {
    public static void main(String[] args) {

        // Создаем стринговый дженерик объект 1 и добавляем в него элементы
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // Создаем целочисленный дженерик объект 2 и добавляем в него элементы
        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        // Выводим на экран
        Utils.printTwoLists(names, scores);


    }
}

