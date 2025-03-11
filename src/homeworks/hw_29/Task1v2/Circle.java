package homeworks.hw_29.Task1v2;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class Circle extends Shape{
    private double radius;


    public Circle(double radius) {
        if (radius<0) {this.radius =(-1.0*radius);} else this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
        }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
