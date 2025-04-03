package homeworks.hw_47.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*** Author: Roman Romashko Date: 03.04.2025 ***/

/*
    Task 3
    Дан список Person с полями name, age, city.
    Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
    Например, старше 25 лет и проживающих в городе "Berlin"
 */

public class filterPeople {
    public static void main(String[] args) {

        // создаем список персон
        List<Person> personList = Arrays.asList(
                new Person("Alisa", 22, null),
                new Person("Bob", 22, "Berlin"),
                new Person("Charlie", 28, "Hamburg"),
                new Person("Diana", 35, "Berlin"),
                new Person("Eva", 24, "Stuttgart")
        );

        // смотрим
        System.out.println("personList: "+personList.toString());

        // фильтруем
        List<Person> filtered = filterPeople(personList, 25, "Berlin");

        // смотрим
        System.out.println("filtered: "+filtered.toString());

    }

    private static List<Person> filterPeople(List<Person> people, int minAge, String city) {
        return people.stream()
                .filter(Objects::nonNull) // фильтр на null
                // по красоте
                .filter(p -> Objects.nonNull(p.getCity())) // город не null
                .filter(p -> Objects.nonNull(p.getAge())) // возраст не null

                .filter(p -> p.getAge() > minAge) // фильтр по возрасту
                .filter(p -> city.equals(p.getCity())) // фильтр по городу
                .collect(Collectors.toList()); // сборка
    }
}
