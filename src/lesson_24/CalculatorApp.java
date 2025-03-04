package lesson_24;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

public class CalculatorApp {
    public static void main(String[] args) {

        int x1=10;
        int x2=5;
        int result;

        result = x1/x2;
        System.out.println("10//5:"+result);

        result = Calculator.devide(10,0);
        System.out.println("result calc: "+result);

        double d1=10.0;
        double resultD= d1/0;

        System.out.println("10.0//00: "+resultD);

        // Infinity - бесконечность

        double inf1 = 1.0 / 0;
        double inf2 = 1000.0 / 0;

        System.out.println(inf1==inf2);
        System.out.println(inf1 > inf2);

        System.out.println(10.0/10.0);
        double res2 = inf1/inf2;
        System.out.println("inf1 / inf2: "+ res2);

        System.out.println("inf1 - inf2: "+ (inf1-inf2));

        System.out.println("inf1 + 10: "+ (inf1+10));

        System.out.println("inf1 * (-1): "+ (inf1*-1));

        // Сравнение
        System.out.println(inf1==Double.POSITIVE_INFINITY);

        int x =10;
        double dVar =10; // -> 10.0



    }
}
