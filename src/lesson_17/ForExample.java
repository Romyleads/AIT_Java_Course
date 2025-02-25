package lesson_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        /*j

        for (<Блок инициализация> ; <Блок проверок / условие выхода> ; <Блок изменений>)

        // Тело цикла

         */

        // вывести все числа от 0 до 10
        int j = 0;

        while (j < 10) {
            System.out.println(j + ",");
            j++;

        }
        System.out.println();
        System.out.println("Состояние j после цикла: " + j);


        for (int i = 0; i < 10; i++) {
            System.out.print(i + ",");

        }

        System.out.println();
        System.out.println("После цикла for");

        // Запустится бесконечный цикл. Для цикла ни один из блоков не является обязательной
        //
        // for ( ; ; ){
        //    System.out.println("Hello, World!");
        // }

        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 10000) {
            System.out.print(i1 + ", ");
        }
        System.out.println();
        System.out.println("Состояние переменной i1: " + i1);

        // Мы можем инициализировать и изменять любое количество переменных

        int z = 1;
        int k = 14;

        int v = 15, u = 20;

        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {

            System.out.println(k + " : " + a + " : " + f);

        }

        System.out.println("Состояние переменной i1: " + i1);


        // Создать массив целых числе случ дл от 5 до 15
        // Заполнить массив случ знач от  - 50 до 50 включительно


        Random random = new Random();

        int[] ints = new int[random.nextInt(5, 16)];


        for (int i = 0; i < ints.length; i++) {

            ints[i] = random.nextInt(101) - 50; // [-50...50]

            System.out.print((i == 0 ? "[ " : "") + ints[i] + (i < ints.length - 1 ? ", " : "]\n"));


        }

        int min = ints[0];
        int max = ints[0];

        for (int i = 0; i < ints.length; i++) {

            //System.out.print((i == 0 ? "[ " : "") + ints[i] + (i < ints.length - 1 ? ", " : "]\n"));

            if (ints[i] < min) min = ints[i];
            if (ints[i] > max) max = ints[i];

        }

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);

        min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) min = ints[i];
        }
        System.out.println("Min:"+min);


        System.out.println("\n///////////////////////////////////\n");


        for (int i = 0; i < 7; i++) {
            //if (i == 3) continue; // прервать тек операцию
            if (i == 3) break; // оборвать цикл
            System.out.print(i + ", ");

        }



    }
}
