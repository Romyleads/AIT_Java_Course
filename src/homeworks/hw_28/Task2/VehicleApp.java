package homeworks.hw_28.Task2;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class VehicleApp {
    public static void main(String[] args) {

        Vehicle[] vehicles = { new Car(), new Bicycle(), new Moto() };

        for (int i = 0; i < vehicles.length; i++) {

            // Запускаем мотор путем вызова метода каждого дочернего объекта
            vehicles[i].startEngine();
        }

    }
}
