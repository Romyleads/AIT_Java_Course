package lesson_25;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

public class ConstantApp {
    public static void main(String[] args) {

        // Невозможно изменить
        // ConstantDemo.PI=555;

        System.out.println("ConstantDemo.PI"+ConstantDemo.PI);
        System.out.println("ConstantDemo.doublePiSqrt()"+ConstantDemo.doublePiSqrt());


        // Ошибка компиляции - лишний символ ";" :
        /*
        int sum=0;
        for (int i = 0; i < 5; i++); {
            sum+=i;
        }
        System.out.println(sum);
        */


        String result = "Java" + " fub!";

        StringBuilder sb = new StringBuilder();

        // TODO показать на след. уроке


    }
}
