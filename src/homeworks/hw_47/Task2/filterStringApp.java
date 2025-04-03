package homeworks.hw_47.Task2;

/*** Author: Roman Romashko Date: 03.04.2025 ***/

import java.util.List;
import java.util.stream.Collectors;

/*
    Task 2
    Дан список строк.
    Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.
    Результат сохраните в новый список строк.
*/
public class filterStringApp {
    public static void main(String[] args) {

        // список строк
        List<String> list = List.of("Avocado", "Banana", "Apple", "Cherry");

        // смотрим
        System.out.println("list: " + list);

        // фильтруем
        List<String> result = filterAndSortStrings(list, "A");

        // смотрим
        System.out.println("result: " + result);

        // теория

        String test = "Hello";
        System.out.println(test.substring(0, 1));
        // проверяет, заканчивается ли строка на другую строку
        System.out.println(test.endsWith("lle"));
        System.out.println(test.endsWith("ll"));
        // проверяет, начинаться ли строка на другую строку
        System.out.println(test.startsWith("H"));


        System.out.println(test.startsWith("ell"));

        // проверяет, содержит ли строка другую строку
        System.out.println(test.contains("ells"));

    }

    private static List<String> filterAndSortStrings(List<String> strings, String startsWith) {
        return strings.stream()
                //.filter(a -> a.charAt(0) == 'A') // фильтр по символу 0
                //.filter(a->a.substring(0,1).equalsIgnoreCase("A")) // по сабстроке
                //.filter(a->a.toUpperCase().startsWith("A")) - по первой букве А с любым регистром

                .filter(a -> a.startsWith(startsWith)) // фильтр на первую А
                .sorted()// по алфавиту
                .collect(Collectors.toList() // сборка
                );
    }
}
