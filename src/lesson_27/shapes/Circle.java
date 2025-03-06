package lesson_27.shapes;


/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.141592653589793;


    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.printf("%s площадь: %.0f\n", getName(), area);
    }

    // Все как мы любим
    public String toString() {
        return String.format("%s, Радиус: %.0f", getName(), radius);
    }
}
