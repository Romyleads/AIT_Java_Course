package homeworks.hw_42.Task3;

import java.util.Comparator;

/*** Author: Roman Romashko Date: 27.03.2025 ***/

public class MyComparator2 implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b) {
        if ((a % 2 == 0) && (b % 2 != 0)) return -1; // четные раньше
        if ((a % 2 != 0) && (b % 2 == 0)) return 1;  // нечетные позже
        if (a % 2 == 0) return a - b;               // четные по возрастанию
        return b - a;                               // нечетные по убыванию
    }
}
