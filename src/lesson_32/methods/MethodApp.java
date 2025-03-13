package lesson_32.methods;

import java.util.Arrays;

/*** Author: Roman Romashko Date: 12.03.2025 ***/

public abstract class MethodApp {
    public static void main(String[] args) {

        Integer[] integers = {0, 1, 2, 3, 4, 5, 6};

        Utils.swap(integers, 2, 5);

        System.out.println(Arrays.toString(integers));

        String[] strings = {"Hello", "Java", "World", "JS"};

        Utils.swap(strings,  1,  2);

        System.out.println(Arrays.toString(strings));

        //int[] intArray{1, 2, 3, 4, 5, 6};

        //Utils.swap(intArray, 1,2); // массив примитивов

        MyList<Double> doubleList = new MyArrayList<>(new Double[]{1.5,2.5,3.5});

        Double firstValue = Utils.getFirstElement(doubleList);
        System.out.println("firstValue: " + firstValue);

        System.out.println("==================================");

        MyList<String> StringList = new MyArrayList<>(strings);

        String firstStringsValue = Utils.getFirstElement(StringList);
        System.out.println("firstStringsValue: " + firstStringsValue);

        System.out.println("==================================");

        //int sum = Utils.sumElements("A","B"); // Типо-безопасность от extends Number
        int sum = Utils.sumElements(1,2.99);
        System.out.println("sum: " + sum);

        System.out.println("==================================");

        double sumD = Utils.listSum(doubleList);
        System.out.println("sumD: " + sumD);

        System.out.println("==================================");

        MyList<Integer> integerList = new MyArrayList<>(integers);
        Utils.addNumbers(integerList);



    }
}
