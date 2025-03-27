package lesson_37.enums;

/*** Author: Roman Romashko Date: 19.03.2025 ***/

public class TrafficLight {
    private String serialNumber;
    private String location;

    // Red, Yellow, Green
    private Colors Light;


    public TrafficLight(String serialNumber, String location, Colors light) {
        this.serialNumber = serialNumber;
        this.location = location;
        this.Light = light;
    }


    @Override
    public String toString() {
        return "TrafficLight{" +
                "serialNumber='" + serialNumber + '\'' +
                ", location='" + location + '\'' +
                ", Light='" + Light + '\'' +
                '}';
    }
}
