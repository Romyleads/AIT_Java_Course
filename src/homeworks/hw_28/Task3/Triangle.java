package homeworks.hw_28.Task3;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Triangle extends Figure{

    // Основание
    private double base;

    // Высота
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

}
