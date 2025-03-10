package homeworks.hw_29.Task1;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

class Tria extends Shape {
    private double a, b, c;

    public Tria(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}
