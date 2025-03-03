package lesson_24;

/*** Author: Roman Romashko Date: 28.02.2025 ***/

public class Car {
    // Статическое свойство существует в единсвенном экземляре, доступно всем объектам класса
    static int totalCars;
    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;

        totalCars++; // При создании нового объекта - мы увеличиваем общее кол-во созданных автомобилей
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Определение метода toString()
    public String toString() {
        return String.format("Auto: model %s, power: %d, totalCars: %d ", model, power, totalCars);


    }


}
