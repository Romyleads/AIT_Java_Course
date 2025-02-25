package lesson_13;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();


        System.out.println("Привет, " + name);

        // Прочитать число
        System.out.println("Введите Ваш возраст:");

        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Age: " + age);

        System.out.println("Введи город: ");
        String city = scanner.nextLine();
        System.out.println("City: " + city);


        // Todo Чтение токенами чисел

        // Разделитель - пробельный символ? \s+ - ' ' пробельный символ, табуляция, перевод каретки, возврат каретки \r


        System.out.println("Введите число PI:");
        double pi=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pi: "+pi);




    }
}
