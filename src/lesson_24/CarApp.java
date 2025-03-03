package lesson_24;

/*** Author: Roman Romashko Date: 28.02.2025 ***/

public class CarApp {
    public static void main(String[] args) {

        System.out.println("static field Car.totalCars: " + Car.totalCars);


        Car bmw = new Car("BMW", 200);
        System.out.println(bmw.toString());

        Car vw = new Car("VW", 300);
        System.out.println(vw.toString());

        System.out.println("Static variable: " + Car.totalCars);

        // Можно обратиться к статике от имени конкретного объекта, но это плохая практика

        // System.out.println(vw.totalCars); - такое следует избегать, нужно обращаться от имени класса:

        System.out.println(Car.totalCars);

        // Применим только к полям и методам класса
        // static int x;


    }
}
