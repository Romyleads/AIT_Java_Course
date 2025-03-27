package lesson_42;

import java.util.Arrays;
import java.util.Comparator;

/*** Author: Roman Romashko Date: 27.03.2025 ***/

public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = new int[] {9, 5, 1, 2, 4, 11, 0};                             // массив целых чисел

        // apple < banana
        // Zebra < apple
        // Apple < apple

        Arrays.sort(ints);                                                        // сортировка массива по возрастанию
        System.out.println(Arrays.toString(ints));                                // печать отсортированного массива

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021, 250);

        printCars(cars);                                                          // вывод начального массива машин

        Arrays.sort(cars);                                                        // сортировка по натуральному порядку (Comparable)

        // Интерфейс Comparable<T> (с английского можно перевести как "сравнимый")
        // Интерфейс Comparator<T>

        printCars(cars);                                                          // печать после сортировки

        CarSpeedComparator speedComparator = new CarSpeedComparator();
        Arrays.sort(cars, speedComparator);                                       // сортировка с использованием внешнего компаратора по скорости
        printCars(cars);

        System.out.println("==========\n");
        Arrays.sort(cars, new CarModelComparator());                              // сортировка по модели с использованием внешнего компаратора
        printCars(cars);

        System.out.println("==========================\n");

        // Анонимный класс - это класс, для создания объекта на лету - без явного объявления нового класса.
        // Используются когда необходим одноразовый объект

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getModel().compareTo(c2.getModel());                    // сортировка по модели
            }
        });
        printCars(cars);

        // Отсортировать машины по году выпуска в обратном порядке
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c2.getYear() - c1.getYear();                               // обратный порядок по году
            }
        });
        printCars(cars);

        // Сравнить машин по году выпуска в порядке возрастания,
        // если год совпадает - тогда такие машины сравнить по модели в порядке убывания
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare != 0) return yearCompare;                         // сначала по году
                return c2.getModel().compareTo(c1.getModel());                    // затем по модели в обратном порядке
            }
        });
        printCars(cars);

        // Функциональный интерфейс - это интерфейс, который имеет РОВНО ОДИН абстрактный метод. (метод который нужно реализовать)
        // Интерфейс Comparator - функциональный интерфейс

        /*
        Лямбда-выражения это краткий способ реализаций анонимныx функций (методов) в Java
        Компактный синтаксис для реализации методов функциональных интерфейсов

        (parameters) -> expression
        или
        (parameters) -> {statements;}

        Лямбда-выражения во многих случаях могут заменить анонимные классы и
        реализовывать на лету функциональные интерфейсы
        */

        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());       // сортировка по году в обратном порядке через лямбду
        printCars(cars);

        // Отсортировать машины по максимальной скорости в порядке убывания.
        // Если скорость совпадает - отсортировать по году - естественный порядок (от младшей к старшей)
        Comparator<Car> carComparator = (c1, c2) -> {
            int speedCompare = Integer.compare(c1.getMaxSpeed(), c2.getMaxSpeed());
            if (speedCompare == 0) return Integer.compare(c1.getYear(), c2.getYear());
            return speedCompare;
        };
        Arrays.sort(cars, carComparator);
        printCars(cars);

        // Comparator - имеет набор статических и дефолтных метод,
        // облегчающих написание сложных / составных компараторов

        // comparing - позволяет сортировать объекты по ключу
        // Функция-ключ - это способ вытащить из объекта то значение, по которому мы хотим сравнивать два объекта
        // car -> car.getYear()
        // Car::getModel

        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());   // сортировка по модели
        Arrays.sort(cars, byModel);
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getModel));                   // то же самое через ссылку на метод
        printCars(cars);

        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));                // сортировка по году с оптимизацией под int

        /*
        Второй параметр метода comparing
        Comparator.naturalOrder() - определяет естественный порядок сортировки
        Comparator.reverseOrder() - обратный порядок
        Comparator.nullsFirst - null значения первыми
        thenComparing - продолжение сравнения по другому полю
        */

        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder())); // год в обратном порядке
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));  // null сначала
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.reverseOrder()))); // null в конце
        printCars(cars);

        System.out.println("========================\n");

        Arrays.sort(cars, Comparator.comparing(Car::getModel)                     // модель по возрастанию
                .thenComparing(Car::getYear, Comparator.reverseOrder())); // год по убыванию
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getYear)                      // год по возрастанию
                .thenComparing(Car::getModel, Comparator.reverseOrder())); // модель по убыванию
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder())
                .thenComparing(car -> car.getMaxSpeed()));  // год по убыванию, скорость по возрастанию
        printCars(cars);
    }






    public static void printCars(Car[] cars) {
        System.out.println("====================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("=====================\n");
    }
}
