package homeworks.hw_29.Task1;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

class CircleSingleTone extends Shape {
    private double radius;
    private static final double PI = 3.141592653589793;

    public CircleSingleTone(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
