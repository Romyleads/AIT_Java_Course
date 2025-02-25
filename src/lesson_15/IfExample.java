package lesson_15;

import java.util.Random;

// Удалить серые неиспользуемые импорты - Ctrl + Alt + o

public class IfExample {
    public static void main(String[] args) {

        // Условный оператор if - позволяет выборочно выполнять отдельные части программы (блоки кода)
        // if (условие) оператор;
        /*


        if (условие) {
        // Код при условие = True
        } esle if (условие 2) {


        } else {

        }


         */

        int age = 10;

        if (age > 18) System.out.println("Вы совершеннолетний");
        else System.out.println("Вам меньше 18");

        System.out.println("Продолжение программы");

        if (age > 11){
            System.out.println("Блок IF");
            System.out.println("Вы уже не ребенок");
        } else {

            // Блок кода else (когда условие вБлок IFыдаст false)
            System.out.println("Блок ELSE");
            System.out.println("Сейчас нам = " + age + " лет");
        }
        Random rand = new Random();


        //int score =80;
        int score = rand.nextInt(101); // Получить случайное число в диапазоне от 0 до 100

        if (score >= 90) System.out.println("Супер!" + score);
        else if (score >= 75) System.out.println("Хорошо!"+ score);
        else if (score >= 50) System.out.println("Удовлетворительно"+ score);
        else System.out.println("Плохо!"+ score);


        System.out.println("Продолжение программы");

        // Нахождение мин из неск чисел

        int v1 = rand.nextInt(51); // 0 -50
        int v2 = rand.nextInt(51) - 25; // -25 - 25
        int v3 = rand.nextInt(51);

        // -25 до +25


        // -20 до 80

        int r4 = rand.nextInt(101) - 20;
        // Java 17 or high
        // r4 = rand.nextInt (10,70);
        System.out.println("r4: "+ r4);

        System.out.println("v1: "+ v1);
        System.out.println("v2: "+ v2);
        System.out.println("v3: "+ v3);


        int min = v1;

        if (v2 < min) min = v2;
        if (v3 < min) min = v3;

        System.out.println("min: "+ min);




    }
}
