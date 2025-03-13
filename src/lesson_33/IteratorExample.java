package lesson_33;




import lesson_33.lists.MyArrayList;
import lesson_33.lists.MyList;

import java.util.Iterator;

/*** Author: Roman Romashko Date: 13.03.2025 ***/

// Есть два интерфейса Iterable и Iterator

// 1. Iterable<T> означает, что объекты этого класса можно последовательно перебирать (итерироваться по ним)
//    Один абстрактный метод

// 2.  Iterator собственно итератор, который позволяем обходить коллекцию.
//    - boolean hasNext() - есть ли следующий элемент;
//    - T next() - возвращает следующий элемент
//    - void remove - удаляет последний возвращенный элемент (не обязателен для переопределения)

public class IteratorExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();
        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {

            String strCurrent = iterator.next();
            System.out.println(strCurrent);

        }

        // Цикл for-each

        /*
        for (Имя переменной : коллеекция)
         // действие с переменной
         */

        System.out.println("\n======================");

        for (String strCurrent : list){
            System.out.println(strCurrent);
        }


        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1,2,3);

        System.out.println("\n======================");

        for (Integer strCurrent : integers){
            System.out.println(strCurrent);
        }

        // Вывести все элементы массива циклом
        int[] array = {10,20,30,40,50};

        System.out.println("\n======================");

        for (Integer strCurrent : array){
            System.out.println(strCurrent);
        }



    }

}







