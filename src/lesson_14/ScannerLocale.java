package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {
    public static void main(String[] args) {



        String data ="3,14 42,7";

        Scanner sc = new Scanner(data);
        sc.useLocale(Locale.GERMANY);

        // Locale - используется локаль вашей системы для определения формата чисел.
        // В том числе каким знаком отделяется дробная часть числа

        //Locale.US - дробная часть отделяется точкой (.)
        //locale.GERMANY - дробная часть отделяется запятой (,)

        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());
        System.out.println(Locale.getDefault());

        String text="42,Java,3.14,Hello";
        Scanner scanner = new Scanner(text);
        scanner.useLocale(Locale.US); // Устанавливаем для сканера локаль
        scanner.useDelimiter("[;]"); // Разделитель  ; или |
        scanner.useDelimiter("[;|,]"); // Разделитель  ; или |



        String java = scanner.next();
        System.out.println(java);
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());





    }
}
