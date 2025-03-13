package homeworks.hw_32.Task3;

/*** Author: Roman Romashko Date: 13.03.2025 ***/

/*
    Task 3: Обобщенный класс с ограничениями типов
    Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

    Требования:

    Класс должен иметь конструктор для инициализации двух чисел.
    Метод double sum() возвращает сумму этих чисел.
    Пример использования:
    NumericPair<Integer> intPair = new NumericPair<>(10, 20);
    System.out.println(intPair.sum()); // Вывод: 30.0

    NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
    System.out.println(doublePair.sum()); // Вывод: 10.0
 */


public class MainApp {
    public static void main(String[] args) {


        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // 30.0

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // 10.0


    }
}
