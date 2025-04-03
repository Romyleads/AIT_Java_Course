package homeworks.hw_47.Task2;

/*** Author: Roman Romashko Date: 03.04.2025 ***/

import org.apiguardian.api.API;

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
        System.out.println("list: "+list);

        // фильтруем
        List<String> result = filterAndSortStrings(list,"A");

        // смотрим
        System.out.println("result: "+result);

    }

    private static List<String> filterAndSortStrings(List<String> strings, String startsWith) {
        return strings.stream()
                .filter(a -> a.startsWith(startsWith)) // фильтр на первую А
                .sorted()// по алфавиту
                .collect(Collectors.toList() // сборка
                );
    }
}
