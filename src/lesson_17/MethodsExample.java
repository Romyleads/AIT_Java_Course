package lesson_17;

public class MethodsExample {
    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();

        int ch = 65;
        int anotherInt = 66;

        BlaBlaBla(ch);
        BlaBlaBla(anotherInt);

        int[] array = {5,6,7,8,6,4,3,4,5,777,0};
        int[] array2 = {333,6,472,826,34,3,4,5,777,0};
        printArray(array);
        printArray(array2);

        array[3]=1000;
        array[0]=-100_000;

        printArray(array);

        String[] strings = {"Hello", "Java", "Test", "Worlds"};
        printArray(strings);

        Boolean[] bool = {true, false, true, true};
        printArray(bool);

        Character[] chars = {'A', 'B', 'C', 'D'};
        printArray(chars);

        testParameterOrder(1,"Hello");
        testParameterOrder("Hello", 1);

    } // Method area (место написания методов)

    /*

    ПЕРЕГРУЗКА методов

    */

    // Метод "красиво" выводящий все элементы массива строк

    public static void testParameterOrder(int x, String str) {

        System.out.println("INT+ STRING:"+ x+ "|" + str);

    }


    public static void testParameterOrder(String str,int x ) {

        System.out.println("INT+ STRING:"+ x+ "|" + str);

    }

    public static void printArray(Character[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print((i == 0 ? "[" : "") + array[i] + (i < array.length - 1 ? ", " : "]\n"));
        }
    }

    public static void printArray(Boolean[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print((i == 0 ? "[" : "") + array[i] + (i < array.length - 1 ? ", " : "]\n"));
        }
    }

    public static void printArray(String[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print((i == 0 ? "[" : "") + array[i] + (i < array.length - 1 ? ", " : "]\n"));
        }
    }





    public static void printArray(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
        System.out.print((i == 0 ? "[" : "") + array[i] + (i < array.length - 1 ? ", " : "]\n"));
        }
    }

    public static void BlaBlaBla(int ch1) {
        System.out.println((char) ch1);

    }

    public static void sayHello(){
        // Тело метода
        System.out.println("Hello World!");

    }

}


