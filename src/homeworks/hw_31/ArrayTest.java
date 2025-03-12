package homeworks.hw_31;


import java.util.Arrays;

/*** Author: Roman Romashko Date: 12.03.2025 ***/

public class ArrayTest {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();

        Integer[] arr = list.toArray(); // вернет null
        System.out.println(Arrays.toString(arr));

        System.out.println(list);


        list.addAll(10, 20, 50);
        System.out.println(list);

        // Происходит потеря типов данных на этапе компиляции, когда компилятор не знает какие типы данных будут
        Integer[] array = list.toArray();
        System.out.println(Arrays.toString(array));

    }
}
