package lesson_12;

public class PrintFormat {


    public static void main(String[] args) {

        double result = 20.0 / 7;
        int age  = 25;
        String name = "Alice";

        /*
        %d - целое число
        %f - float
        %s - text
        %n - как вариант перенос строки
        %.3f -

        // sout - println
        // souf= printf

         */
        System.out.println("Name: " + name + ", Age: " + age+1 + ", score: " + result);

        System.out.printf("Name: %s, Age: %d, score: %f\n",name,100+1,result);
        System.out.printf("Name: %s, Age: %d, score: %.3f",name,100+1,result);

    }
}
