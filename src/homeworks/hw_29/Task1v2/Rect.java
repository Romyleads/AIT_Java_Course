package homeworks.hw_29.Task1v2;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class Rect extends Shape{
    private double sideA;
    private double sideB;


    public Rect(double sideA, double sideB) {

        if (sideA<0 || sideB<0) return;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }
}
