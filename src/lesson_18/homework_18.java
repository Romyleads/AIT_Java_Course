package lesson_18;

import java.util.Arrays;

public class homework_18 {
    public static void main(String[] args) {

    /*
    Task 1
    Написать метод со следующим функционалом:

    На вход метод принимает массив целых чисел и число - длину нового массива.
    Метод должен создать и распечатать массив заданной в параметрах длинны.
    В начало массива должны быть скопированы элементы из входящего массива:

    {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
    Copy
    {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
    Copy
    Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода

    Task 2
    Написать метод, принимающий на вход массив строк.
    Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.

    Task 3 * (Опционально)
    Написать метод, принимающий на вход массив целых чисел.
    Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

    вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
     */

        System.out.println("Task1. ////////////////////////////////");

        int[] test = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        copyOfArray(test, 10);

        System.out.println("\nTask2. ////////////////////////////////");
        String[] strings = {null, "Pyton", null, "Hello", "JS"};
        String[] result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\nTask3. ////////////////////////////////");

        int[] newarr = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] result2 = primeNumbers(newarr);

        System.out.println(Arrays.toString(result2));

    }// Methods area

    public static void copyOfArray(int[] array, int newLength) {
        if (newLength < 0) {
            System.out.println("[]");
            return;
        }

        int[] result = new int[newLength]; // [0,0,0]
        // String elements = Arrays.toString(result);
        // System.out.println(elements);

        for (int i = 0; i < newLength && i < array.length; i++) {
            result[i] = array[i];
        }

        System.out.println(Arrays.toString(result));

    }

    // Поиск малой и большой строки
    public static String[] getArrayWithSmallestStrings(String[] strings) {

        // Important checkout on null
        if (strings == null || strings.length == 0) {
            return new String[0]; // []
        }

        String notNullValue = findFirstNotNullValueInArray(strings);
        //System.out.println("notNullValue: "+ notNullValue);


        // String smallest = strings[0];
        // String biggest = strings[0];

        if (notNullValue == null) {

            // ВСЕ СТРОКИ МАССИВА НУЛЛ
            return new String[0]; // []
        }

        String smallest = notNullValue;
        String biggest = notNullValue;

        for (int i = 0; i < strings.length; i++) {

            //System.out.println("Текущий:"+strings[i]+", ");

            //if (strings[i]!=null) continue;
            if (strings[i] != null && strings[i].length() < smallest.length()) {
                smallest = strings[i];

            }

            if (strings[i] != null && strings[i].length() > biggest.length()) {
                biggest = strings[i];

            }

        }
        return new String[]{smallest, biggest};
    }

    // Поиск первого не нулл значения строки
    public static String findFirstNotNullValueInArray(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) return strings[i];
        }
        // не нашли ни одного нулл
        return null;
    }

    // Task 3.
    public static int[] primeNumbers(int[] numbers) {

        int[] newarr = new int[0];

        // Check if empty
        if (numbers == null || numbers.length == 0) {
            return new int[]{}; // []
        }

        int ind = 0;
        // Iterate array
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isSimple(num)) ind++;
        }

        if (ind > 0) {
            newarr = new int[ind];
            int j = 0;

            for (int i = 0; i < numbers.length; i++) {
                int num = numbers[i];
                if (isSimple(num)) newarr[j++] = num;

            }
        }

        return newarr;

    }

    // Метод для проверки, простое ли число
    public static boolean isSimple(int num) {
        if (num < 2) return false;  // not Simple
        if (num == 2) return true; // 2 - единственное четное простое
        if (num % 2 == 0) return false; // четные не простые (кроме 2)

        for (int j = 3; j < num; j += 2) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;

    }


}
