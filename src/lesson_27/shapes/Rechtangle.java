package lesson_27.shapes;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Rechtangle extends Shape {
    private double width;
    private double height;



    public Rechtangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        double area = width * height;
        System.out.printf("%s площадь: %.0f\n", getName(), area);
        return area;
    }



}
