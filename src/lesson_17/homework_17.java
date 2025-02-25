package lesson_17;

import java.util.Random;

public class homework_17 {
    public static void main(String[] args) {

    /*
    Task 1
    Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.

    Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)

    Task 2
    Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

    {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
    Copy
    Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

    {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
    Copy
    Task 3
    Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло

    Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

    класс Math для нахождения степени числа использовать нельзя ;)

    P.S. А почему вы решили, что число может прийти только положительное? ;)

    Task 4 * (Опционально)
    Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.

    Простое число - число, которое делится на цело только на 1 и само себя.

    Пример простых чисел: 3, 5, 7, 11, 13 и т.д.

    Task 5 * (Опционально)
    Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

    Пример:

    { "One", "Two", "Twenty" } ->

    T
    w
    e
    n
    t
    y
     */

    System.out.println("\nЗадание 1. ///////////////////////////////////////////////////////////////////// \n");

    String hi = "Hello!";
    stringCharsCalc(hi);

    System.out.println("\nЗадание 2. ///////////////////////////////////////////////////////////////////// \n");

    int[] arr = {333,6,472,826,34,3,4,5,777,0};
    printArray(arr);

    int startToInverseInd=3;
    printArray(arr,startToInverseInd);

    System.out.println("\nЗадание 3. ///////////////////////////////////////////////////////////////////// \n");

    int myExp=-13;
    power(myExp);

    System.out.println("\n\nЗадание 4. ///////////////////////////////////////////////////////////////////// \n");

    Random random = new Random();

    int[] ints = new int[50];
    int sumSimple = 0;

    for (int i = 0; i < ints.length; i++) {
        ints[i] = random.nextInt(100) + 1; // [1...100]
        System.out.print((i == 0 ? "[" : "") + ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        if (isSimple(ints[i])) sumSimple++;
    }

    System.out.println("Простых чисел: " + sumSimple);


    System.out.println("\nЗадание 5. ///////////////////////////////////////////////////////////////////// \n");

    String[] strings = { "One", "Two", "Twenty"};
    printArray(strings);


    } // Method area (место написания методов)

    // Подсчет символов строки
    public static void stringCharsCalc(String str) {
        System.out.println("В переданной строке: \""+ str + "\" " + str.length() + " символ(ов)");

    }
    // Вывод элемента целочисленного массива в инверсии
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print((i == 0 ? "{" : "") + array[i] + (i < array.length - 1 ? ", " : "} --> "));
        }

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print((i == array.length-1 ? "[" : "") + array[i] + (i == 0 ? "] " : ", "));
        }
        System.out.println();
    }

    // Вывод элемента целочисленного массива в инверсии c заданного индекса x
    public static void printArray(int[] array,int x) {

        for (int i = 0; i < array.length; i++) {
            System.out.print((i == 0 ? "{" : "") + array[i] + (i < array.length - 1 ? ", " : "} + индекс "+ x + " --> "));
        }

        if (x>=0 && x<array.length) {
            for (int i = 0; i < x; i++) {
                System.out.print((i == 0 ? "[" : "") + array[i] + (i < array.length - 1 ? ", " : "]"));
            }

            for (int i = array.length-1; i >= x; i--) {
                System.out.print((x==0 && i == array.length-1 ? "[" : "")+array[i] + (i == x ? "] " : ", "));
            }
        } else {

            // Массив не имеет элемента с заданным индексом
            for (int i = 0; i < array.length; i++) {
                System.out.print((i == 0 ? "[" : "") + array[i] + (i < array.length - 1 ? ", " : "] : "));
            }
            System.out.println("стартовый элемент переданного массива не определен");
        }

        System.out.println();
    }

    // Возведение 2 в степень
    public static void power(int exponent) {

        double result = 1;
        int exp = (exponent < 0) ? -exponent : exponent;
        for (int i = 0; i < exp; i++) {
            result *= 2;
        }

        if (exponent<0) result = 1.0/result;

        // Не сильно удобно смотреть на E, поэтому приведем к обычному формату через String.format как на математике

        System.out.printf("2 в степени "+exponent+" равно "+ (result < 1 ? String.format("%.10f", result) : (int)result+"" ));

    }

    // Метод для проверки, простое ли число
    public static boolean isSimple(int number) {
        if (number <= 1) {
            return false; // <= 1 - не простое
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // делится без остатка - значит не простое
            }
        }
        return true; // не делится - значит простое
    }

    // Определение самого длинного элемента массива строк и распечатываем его посимвольно
    public static void printArray(String[] array) {
        int i;
        int maxIndex = 0;

        // Определяем самый длинный элемент массива строк
        for (i = 0; i < array.length; i++) {
            System.out.print((i == 0 ? "{" : "") + array[i] + (i < array.length - 1 ? ", " : "} --> \n"));
            if (array[i].length()>array[maxIndex].length()) maxIndex=i;

        }
        // Выводим посимвольно самый длинный элемент массива строк
        String longStringInArray=array[maxIndex];
        for (i = 0; i < longStringInArray.length(); i++) {
            System.out.print("" + longStringInArray.charAt(i) + "\n");

        }

    }

}
