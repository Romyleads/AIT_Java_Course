package homeworks.hw_26.Task2;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

/*
    Task 2
    Придумать и написать как минимум одну иерархию классов в которой будет один родительский клас
    и два наследника, расширяющих его функционал

    У родительского класса должен быть метод создающий строку с информацией об объекте
    (метод String toString())


 */

public class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return String.format("Устройство: %s %s", brand, model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
