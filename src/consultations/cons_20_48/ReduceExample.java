package consultations.cons_20_48;

import java.util.List;
import java.util.Optional;

/*** Author: Roman Romashko Date: 03.04.2025 ***/

public class ReduceExample {

    /*




     */


    public static void main(String[] args) {

        //task1();
        //task2();
        task3();

    }


    private static void task3() {

// Можно использовать для нахождения максимума. Происходить не накопление, а замена значения переменно

        List<String> strings = List.of("Java", "longestString", "Kotlin", "Python");

        Optional<String> longest = strings.stream()

        .reduce((String s1, String s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println(longest);

    }

    private static void task2() {

        List<String> strings = List.of("Java", "Kotlin", "Python");

        Optional<String> concat = strings.stream()
        .reduce((String s1, String s2) -> s1 + " " + s2);

        System.out.println(concat);

        String concat2 = strings.stream()
        .reduce("", (String s1, String s2) -> s1 + " " + s2);
        System.out.println(concat2);


    }
    private static void task1() {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // посчитать сумму всех элементов, которые кратные трем
        // res - 0
        // 3, 6, 9, 12, 15

        Optional<Integer> sum = integers.stream()
                .filter(i -> i % 3 == 0)
                .peek(System.out::println)
                .reduce((i1, i2) ->i1+i2);
                System.out.println(sum);

        Integer sum2 = integers.stream()

                .filter( i->i % 3 == 0)
                .reduce(0, (Integer i1, Integer i2) -> i2);

    }

}
