package lesson_12;

public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;
        int result;

        result = 15 + 6;
        System.out.println("result: " + result);

        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);


        // Целочисленное деление / (между двумя целыми числами)
        // 20/7 -> 2 целые и 6 в остатке (2.85)
        result = var1 / var2;
        System.out.println("var1 / var2 = " + result);

        // Взятие остатка от деления
        result = var1 % var2;
        System.out.println("var1 % var2 = " + result);



        System.out.println("5 / 10 = " + (5 / 10));
        System.out.println("5 % 10 = " + (5 % 10));

        System.out.println("====================");

        double doubleVar = 20.0;
        int doubleVar2 = 7;


        //double doubleRes = doubleVar / doubleVar2;
        System.out.println("doubleRes = " + (doubleVar- doubleVar2));











    }
}
