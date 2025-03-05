package homeworks.hw_26.Task2;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Phone extends Device {
    private String os;

    public Phone(String brand, String model, String os) {
        super(brand, model);
        this.os = os;
    }

    public String toString() {
        return String.format("%s, ОС: %s", super.toString(), os);
    }
}
