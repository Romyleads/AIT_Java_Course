package homeworks.hw_42.Task1_v2;

import java.util.Arrays;

/*** Author: Roman Romashko Date: 27.03.2025 ***/


    public class SportsmanApp {
        public static void main(String[] args) {

            Sportsman[] sportsmen = {
                    new Sportsman("Tom", 25, 90),
                    new Sportsman("Anna", 30, 95),
                    new Sportsman("Bob", 22, 85),
                    new Sportsman("Diana", 27, 90.75),
                    new Sportsman("Chris", 22, 75.50)
            };

            // Сортировка по имени (естественный порядок)
            Arrays.sort(sportsmen);
            System.out.println("Сортировка по имени:");
            printSportsmen(sportsmen);

            // Сортировка по рейтингу (score) с использованием внешнего компаратора
            Arrays.sort(sportsmen, new SportsmanScoreComparator());
            System.out.println("Сортировка по рейтингу (score):");
            printSportsmen(sportsmen);
        }

    // красивый вывод
        public static void printSportsmen(Sportsman[] array) {
            for (Sportsman s : array) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
