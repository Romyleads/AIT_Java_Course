package homeworks.hw_29.Task1v2;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class Tria extends Shape {

    private double sideA, sideB, sideC;

    public Tria(double sideA, double sideB, double sideC) {

        if (sideA < 0 || sideB < 0 || sideC < 0) return;

        if (!isValidSides(sideA, sideB, sideC)) {

// Треугольник с такими сторонами составить невозможно

            return;
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    private boolean isValidSides(double sideA, double sideB, double sideC) {
        return sideA < sideB + sideC &&
                sideB < sideA + sideC &&
                sideC < sideB + sideA;
    }


    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

}
