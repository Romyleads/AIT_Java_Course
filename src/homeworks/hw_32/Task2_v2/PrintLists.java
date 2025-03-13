package homeworks.hw_32.Task2_v2;

import homeworks.hw_32.Task0.MyArrayList;

/*** Author: Roman Romashko Date: 13.03.2025 ***/

public class PrintLists {


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
        printTwoLists(names, scores);

    }

    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }
}
