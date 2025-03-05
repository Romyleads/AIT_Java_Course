package homeworks.hw_25.dogs;

import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

/*
- Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80
- Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
- Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
- Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке

 */

public class DogsApp {
    public static void main(String[] args) {

        // Случайные значения прыжка от 30 до 80
        Random rand = new Random();

        // Создаем 5 объектов
        Dog[] dogs = new Dog[5];

        for (int i = 0; i < 5; i++) {
            int jump = rand.nextInt(51) + 30;
            dogs[i] = new Dog("Dog_" + (i + 1), jump);

        }

        System.out.println(Arrays.toString(dogs));

        int[] barriers = new int[7];
        for (int i = 0; i < barriers.length; i++) {
            int jump = rand.nextInt(51) + 30;
            barriers[i] = rand.nextInt(101) + 70;

        }

        System.out.println("Барьеры: " + Arrays.toString(barriers));

        // Перебираем собак

        for (int i = 0; i < dogs.length; i++) {
            Dog currentDog = dogs[i];

            // Перебираем барьеры

            int count = 0; // количество успехов
            for (int j = 0; j < barriers.length; j++) {
                int currentBarrier = barriers[j];

                currentDog.jumpBarrier(currentBarrier);
                if (currentDog.isSuccess()) count++;
            }

            System.out.println("Собака: " + currentDog.getName() + " преодолела барьеров: " + count);
        }

    }
}
