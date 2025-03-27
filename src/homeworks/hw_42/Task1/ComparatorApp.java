package homeworks.hw_42.Task1;

import java.util.Arrays;
import java.util.Comparator;

/*** Author: Roman Romashko Date: 27.03.2025 ***/

public class ComparatorApp {

    public static void main(String[] args) {
        Sportsman[] sportsmen = {
                new Sportsman("Tom", 25, 90),
                new Sportsman("Anna", 30, 95),
                new Sportsman("Bob", 22, 85),
                new Sportsman("Diana", 27, 90),
                new Sportsman("Chris", 22, 75)
        };

        // Сортировка по имени (естественный порядок)
        Arrays.sort(sportsmen);
        System.out.println("\nСортировка по имени (Comparable):");
        printSportsmen(sportsmen);

        // Сортировка по рейтингу (score) с использованием внешнего компаратора
        Arrays.sort(sportsmen, new SportsmanScoreComparator());
        System.out.println("Сортировка по рейтингу (score):");
        printSportsmen(sportsmen);

        // Сортировка по возрасту (age), анонимный класс
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        System.out.println("Сортировка по возрасту, анонимный класс):");
        printSportsmen(sportsmen);

    }

    // Вывод результатов
    public static void printSportsmen(Sportsman[] array) {
        for (Sportsman s : array) {
            System.out.println(s);
        }
        System.out.println();
    }

}
