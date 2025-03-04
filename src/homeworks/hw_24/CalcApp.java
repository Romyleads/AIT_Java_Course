package homeworks.hw_24;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

public class CalcApp {
    public static void main(String[] args) {

        double a = 10;
        double b = 5;

        // Вычисление арифметических операций:
        System.out.printf("Сумма %.0f и %.0f равна %.0f%n",a,b, Calc.plus(a,b));
        System.out.printf("Вычитание %.0f и %.0f равно %.0f%n",a,b, Calc.minus(a,b));
        System.out.printf("Умножение %.0f и %.0f равно %.0f%n",a,b, Calc.mult(a,b));
        System.out.printf("Деление %.0f на %.0f равно %.0f%n",a,b, Calc.div(a,b));

        // Если b = 0
        b = 0;

        // Вычисление арифметических операций:
        System.out.printf("Сумма %.0f и %.0f равна %.0f%n",a,b, Calc.plus(a,b));
        System.out.printf("Вычитание %.0f и %.0f равно %.0f%n",a,b, Calc.minus(a,b));
        System.out.printf("Умножение %.0f и %.0f равно %.0f%n",a,b, Calc.mult(a,b));
        System.out.printf("Деление %.0f на %.0f равно %.0f%n",a,b, Calc.div(a,b));

        System.out.println("===================================");

        // Вычисляем круг по радиусу
        double rad = 8.0;

        System.out.printf("Если радиус: %.0f, тогда длина окружности: %.2f%n", rad, Calc.circleLong(rad));
        System.out.printf("Если радиус: %.0f, тогда площадь круга: %.2f%n", rad, Calc.circleArea(rad));


    }
}
