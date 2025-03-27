package homeworks.hw_42.Task2;

import java.util.Comparator;

/*** Author: Roman Romashko Date: 27.03.2025 ***/

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {

        // Сначала сортируем по чётности / нечетности
        if ((a % 2) != (b % 2)) {
            return (a % 2) - (b % 2); // сортировка: чётные идут первыми
        }
        // Если одинаковы — по возрастанию
        return a - b;
    }

}
