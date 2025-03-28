package homeworks.hw_43.Task2;

import lesson_34.persons.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*** Author: Roman Romashko Date: 28.03.2025 ***/

/*
    Task 2 (* Опционально)
    Создайте два списка: ArrayList и LinkedList.

    Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
    Создайте 4 метода, принимающий реализацию интерфейса List.

    В первом методе - получение всех значений элементов списка по его индексу
    Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
    Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)

    Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
    Сравните для каждого из списка время выполнения каждого метода.
    И сравните время последовательного выполнения всех методов для каждой реализации List-а.

 */

public class ListsAndPerformancesApp {

    public static void main(String[] args) {

    // Создаем ArrayList и LinkedList, заполняем их 5000 случайными числами от 0 до 1000
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 150_000; i++) {
            int val = random.nextInt(5000);
            arrayList.add(val);
            linkedList.add(val);
        }

        // Тестируем методы на ArrayList
        List<Integer> arr1 = new ArrayList<>(arrayList);
        long start = System.currentTimeMillis();
        long t1 = getAllByIndex(arr1);
        long t2 = insertRandom(arr1);
        long t3 = removeByIndex(arr1);
        long t4 = removeByValue(arr1);
        long end = System.currentTimeMillis();

        System.out.println("\n===== ArrayList =====");
        System.out.println("По индексу: " + t1 + " мс");
        System.out.println("Вставка:    " + t2 + " мс");
        System.out.println("Удаление по индексу: " + t3 + " мс");
        System.out.println("Удаление по значению: " + t4 + " мс");
        System.out.println("Сумма 4 методов: " + (t1 + t2 + t3 + t4) + " мс");
        System.out.println("Общее время выполнения методов ArrayList: " + (end - start) + " мс");
        double totalArray = end - start;

        // Тестируем методы на LinkedList
        List<Integer> link1 = new LinkedList<>(linkedList);
        start = System.currentTimeMillis();
        t1 = getAllByIndex(link1);
        t2 = insertRandom(link1);
        t3 = removeByIndex(link1);
        t4 = removeByValue(link1);
        end = System.currentTimeMillis();

        System.out.println("\n===== LinkedList =====");
        System.out.println("По индексу: " + t1 + " мс");
        System.out.println("Вставка:    " + t2 + " мс");
        System.out.println("Удаление по индексу: " + t3 + " мс");
        System.out.println("Удаление по значению: " + t4 + " мс");
        System.out.println("Сумма 4 методов: " + (t1 + t2 + t3 + t4) + " мс");
        System.out.println("Общее время выполнения методов LinkedList: " + (end - start) + " мс");
        double totalLinked = end - start;

        // ================== Сравниваем результаты ==================
        double percent = ((double)(totalLinked - totalArray) / totalLinked) * 100;
        System.out.printf("\nArrayList быстрее LinkedList на %.2f%%\n", percent);



    }

    // 1 метод - получение значений по индексу
    public static long getAllByIndex(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        return System.currentTimeMillis() - start;
    }

    // 2 метод - вставка 2000 значений по случайному индексу
    public static long insertRandom(List<Integer> list) {
        Random rand = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            int index = rand.nextInt(list.size());
            list.add(index, rand.nextInt(1000));
        }
        return System.currentTimeMillis() - start;
    }

    // 3 метод - удаление 1000 значений по случайному индексу
    public static long removeByIndex(List<Integer> list) {
        Random rand = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000 ; i++) {
            int index = rand.nextInt(list.size());
            list.remove(index);
        }
        return System.currentTimeMillis() - start;
    }

    // 4 метод - удаление 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
    public static long removeByValue(List<Integer> list) {
        Random rand = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(Integer.valueOf(rand.nextInt(10000)));
        }
        return System.currentTimeMillis() - start;
    }

}
