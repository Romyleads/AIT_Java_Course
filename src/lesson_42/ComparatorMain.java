package lesson_42;

import java.util.Arrays;
import java.util.Comparator;

/*** Author: Roman Romashko Date: 26.03.2025 ***/

public class ComparatorMain {
    public static void main(String[] args) {

        int[] ints = new int[]{9,5,5,5,6};

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[5];

        cars[0] = new Car("Alfa", 2021,120);
        cars[1] = new Car("BMW", 2020,190);
        cars[2] = new Car("Citroen", 2018,190);
        cars[3] = new Car("VW", 2021,250);
        cars[4] = new Car("Ferrari", 2025,300);
        //cars[5] = new Car("FerrariX", 2025,Integer.MIN_VALUE);


        ///Car2[] cars2 = new Car2[5];

        //cars2[0] = new Car("Alfa", 2021,120);
        //cars2[1] = new Car("BMW", 2020,190);
        //cars2[2] = new Car("Citroen", 2018,190);
        //cars2[3] = new Car("VW", 2021,250);
        //cars2[4] = new Car("Ferrari", 2025,300);




         Car2[] cars2 = new Car2[5];

        cars2[0] = new Car2(120);
        cars2[1] = new Car2(190);
        cars2[2] = new Car2(190);
        cars2[3] = new Car2(250);
        cars2[4] = new Car2(300);

        //System.out.println(Arrays.toString(cars));
        printCars(cars);

        //printCars(cars2);

        Arrays.sort(cars);

        //Arrays.sort(cars2);


        // Интерфейс Comparable (с англ. можно перевести как "сравнимый")
        // Интерфейс Comparable

        printCars(cars);


        System.out.println("--------Сортирую по Скорости-------------");

        CarSpeedComparator speedComparator = new CarSpeedComparator();

        Arrays.sort(cars, speedComparator);

        printCars(cars);

        System.out.println("=====================");

        // Анонимный класс

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getModel().compareTo(c2.getModel());
            }
        });


        //System.out.println("--------Сортирую по модели-------------");

        //Arrays.sort(cars, new CarModelComparator());

        printCars(cars);

        // Отсортировать машины по году выпуска в обратном порядке
        Arrays.sort(cars, new Comparator<Car>() {
            @Override

            // мы хотим чтобы сначала шло 10,5,1

            public int compare(Car c1, Car c2) {
                // return ((c1.getYear()-c2.getYear()) * -1); // обратный порядок
                return c2.getYear()-c1.getYear(); // обратный порядок
            }
        });

        // Сравнить машины в начале по году выпуску в порядке возрастания,
        // а потом если год совпадает - сравнить по модели в порядке убывания

Arrays.sort(cars, new Comparator<Car>() {
    @Override
    public int compare(Car c1, Car c2) {

        int yearCompare = c1.getYear() - c2.getYear();

        if (yearCompare!=0){
            return yearCompare;

        }
        // если годы равны, то дальше сравнить обратный порядок по модели
        return c2.getModel().compareTo(c1.getModel());

    }
});


        System.out.println("--------Сортирую по году в обратном через Лямбду-------------");

        // Функциональный интерфейс - интерфейс, который имеет только 1 абстрактный метод
        // Интерфейс Comparator - функциональный интерфейс

        /*

        Лямбда выражения - это краткий способ реализации анонимных функций (методов) в Java
        Компактный синтаксис для реализации методов функциональных интерфейсов

        (parameters) -> expression

        или

        (parameters) -> {statement;}

        Лямбда-выражения во многих случаях могут реализовывать на лету функциональные интерфейсы


         */

        // По году в обратном порядке

        Arrays.sort(cars,(Car car1, Car car2) -> {

            return car2.getYear()-car1.getYear();
        } );



        printCars(cars);


        // То же самое, но еще проще
        Arrays.sort(cars, (Car car1, Car car2) -> car2.getYear() - car1.getYear());


        // Отсортировать машины по макс. скорости в порядке убывания
        // Если скорость совпадает - то отсортировать по году в порядке возрастания (от младшей к старшей)


        System.out.println("--------Сортирую по скорости через компаратор-------------");

        Comparator<Car> carComparator = (Car c1, Car c2) -> {



        int speedCompare = c1.getMaxSpeed() - c2.getMaxSpeed();

        if (speedCompare==0) {
            return  c1.getYear() - c2.getYear();
        }

            return speedCompare;
        };



        Arrays.sort(cars,carComparator);
        printCars(cars);

        // Comparator - имеет набор статических и дефолтных методов,
        // облегчающих написание сложных / составных компараторов


        // Отсортировать машины по модели в естественном порядке
        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars, byModel);

        printCars(cars);

        // Cсылка на метод - это сокращенная запись лямбды
        Arrays.sort(cars, Comparator.comparing(Car::getModel));
        printCars(cars);

        // Ссылка на метод — это сокращенная лямбда-запись


        // Специальные версии метода для сравнения примитивов. Избежать авто-упаковки/распаковки
        // сравнениеInt, сравнениеLong, сравнениеDouble
        // Отсортировать по году выпуска в порядке убывания
        // .reversed() - отсортировать все в обратном порядке - удобно использовать в конце



        Arrays.sort(cars, Comparator.comparing (Car::getModel).thenComparing (Car::getYear, Comparator.reverseOrder()));

        // Отсортировать по году выпуска, и по модели в обратном порядке
        Arrays.sort(cars, Comparator.comparing (Car::getYear).thenComparing (Car::getModel, Comparator.reverseOrder()));
        printCars(cars);

        // Отсортировать по году выпуска в обратном порядке, и по скорости в прямом
        Arrays.sort(cars, Comparator.comparing (Car::getYear).thenComparing (Car::getModel, Comparator.reverseOrder()));
        printCars(cars);

        Arrays.sort(cars, Comparator
                .comparing(Car::getYear, Comparator.reverseOrder()) // сначала по году в обратном порядке
                .thenComparing(Car::getModel)// потом по модели
                .thenComparing(Car::getMaxSpeed)); // потом по скорости


        printCars(cars);


    }

    public static void printCars(Car[] cars){
        System.out.println("=====================");
        for (Car car:cars){
            System.out.println(car);
        }

        System.out.println("=====================");

    }
}


