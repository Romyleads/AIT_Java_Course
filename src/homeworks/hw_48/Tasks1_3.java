package homeworks.hw_48;

import java.util.*;
import java.util.stream.Collectors;

/*** Author: Roman Romashko Date: 04.04.2025 ***/

/*
Task 1
Из списка целых чисел выделите те значения,
которые больше 10; отсортируйте эти значения
по значению последней цифры в числе и выведите результат на экране

Task 2
Имеется список строк.
Используя Stream API, найдите строку с минимальной длиной.

Task 3
Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список
 */

public class Tasks1_3 {
    public static void main(String[] args) {

        task1();
        task2();
        task3();


    }

    private static void task1() {

        List<Integer> integers = new ArrayList<>(Arrays.asList(10, 28, null, -20, 33, -50, 0, -25));

        List<Integer> result = integers.stream()
                .filter(Objects::nonNull) // фильтр на null
                .filter(n ->  n > 10)
                .sorted((a, b) -> Integer.compare(a % 10, b % 10)) // сравниваем последнюю цифру
                .collect(Collectors.toList());

        System.out.println("=========Task1==========");
        System.out.println("Input: "+integers);
        System.out.println("Output: "+result);

    }

    private static void task2() {

        // список строк
        List<String> list = Arrays.asList("Avocado", null, "Banana", "Apple", "Cherry");

        Optional<String> minString = list.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));

        System.out.println("=========Task2==========");
        System.out.println("Input: "+list);
        System.out.println("Output: "+minString.get());

    }

    private static void task3() {

        List<Integer> integers = new ArrayList<>(Arrays.asList(10, 28, null, -20, 33, -50, 0, -25));

        List<Integer> doubleNumbers =integers.stream()
                .filter(n -> n != null && n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("=========Task3==========");
        System.out.println("Input: "+integers);
        System.out.println("Output: "+doubleNumbers);

    }
}
