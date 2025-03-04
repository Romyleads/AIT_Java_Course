package lesson_24;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

public class Calculator {

    public static int add(int a,int b){
        return a+b;

    }
    public static int substract(int a,int b){
        return a-b;

    }
    public static int multiply(int a,int b){
        return a*b;

    }

    public static int devide(int a,int b){
        if (b==0) return Integer.MAX_VALUE;
        return a/b;
    }



}
