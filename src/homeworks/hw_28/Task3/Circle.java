package homeworks.hw_28.Task3;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Circle extends Figure{

    private double radius;
    private static final double PI = 3.141592653589793;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

}
