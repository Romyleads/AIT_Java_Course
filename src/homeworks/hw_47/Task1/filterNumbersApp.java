package homeworks.hw_47.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*** Author: Roman Romashko Date: 03.04.2025 ***/

/*
    Task 1
    Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
    В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100
    Для фильтрации используйте Stream API
 */

public class filterNumbersApp {
    public static void main(String[] args) {

        // список чисел
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 20, 30, -100, null, 0, 999));

        // смотрим
        System.out.println("list: "+list);
        System.out.println("filterNumbers(list): "+filterNumbers(list));

    }

    private static List<Integer> filterNumbers(List<Integer> numbers){

        return numbers.stream()
                .filter(Objects::nonNull) // фильтр на null
                .filter(a -> a%2 == 0) // фильтр на четность
                .filter(a -> a > 10) // больше 10
                .filter(a -> a < 100) // меньше 100
                .collect(Collectors.toList()); // сборка

    }
}
