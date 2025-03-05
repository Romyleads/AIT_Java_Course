package homeworks.hw_26.Task1;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

// Дочерний класс - прямоугольник

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        double area = width * height;
        System.out.printf("%s площадь: %.0f\n", getName(), area);
    }

    // Все как мы любим
    public String toString() {
        return String.format("%s, Ширина: %.0f, Высота: %.0f", getName(), width, height);
    }
}
