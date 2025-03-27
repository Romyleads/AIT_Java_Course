package homeworks.hw_42.Task2;

import java.util.Arrays;
import java.util.Comparator;

/*** Author: Roman Romashko Date: 27.03.2025 ***/

/*
    Task 2 * ОПЦИОНАЛЬНО
    Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:

    Четные целые числа должны идти перед нечетными числами
    Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
    // Сортировка массива с использованием компаратора
    [2, 4, 6, 8, 1, 3, 5, 7, 7, 9]
 */

public class ComparatorApp {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, new MyComparator());
        System.out.println("\nTask 2: Четные перед нечетными:");
        printIntegers(integers);


    }

    public static void printIntegers(Integer[] array) {
        for (Integer s : array) {
            System.out.printf("%d,",s);
        }
        //System.out.print();
    }

}
