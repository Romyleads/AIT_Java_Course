package homeworks.hw_29.Task1;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

class Rect extends Shape {
    private double width, height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}
