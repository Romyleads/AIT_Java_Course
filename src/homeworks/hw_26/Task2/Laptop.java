package homeworks.hw_26.Task2;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Laptop extends Device {
    private double screenSize;

    public Laptop(String brand, String model, double screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }

    public String toString() {
        return String.format("%s, Экран: %.0f", super.toString(), screenSize);
    }
}
