package homeworks.hw_24;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

    /*
    Task 1
    Класс "Калькулятор"
    Создайте класс Calculator, который будет предоставлять
    базовые арифметические операции: сложение, вычитание, умножение и деление
    Класс должен содержать:
    Статические методы для каждой математической операции,
    принимающие два аргумента и возвращающие результат операции.
 */

public class Calc {

    // Можно не создавать объекты
    private Calc() {
    }

    // Статический метод сложения
    public static double plus(double a, double b) {
        return a + b;
    }

    // Статический метод вычитания
    public static double minus(double a, double b) {
        return a - b;
    }

    // Статический метод умножения
    public static double mult(double a, double b) {
        return a * b;
    }

    // Статический метод деления
    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка!");
            return Double.NaN;
        } else {
            return a / b;
        }
    }


}
