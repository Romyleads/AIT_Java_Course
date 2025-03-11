package homeworks.hw_29.Task1v2;

import homeworks.hw_28.Task3.Triangle;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class ShapesApp {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(-10);
        shapes[1] = new Rect(10, 20);
        shapes[2] = new Tria(3, 4, 5);

        double sumArea = 0;
        double sumPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].area();
            double perimeter = shapes[i].perimeter();

            System.out.printf("%s площадь: %.2f; периметр: %.2f\n",
                    shapes[i].getClass().getSimpleName(), area, perimeter);

            sumArea += area;
            sumPerimeter += perimeter;
        }

        System.out.printf("Сумма площадей: %.2f\n", sumArea);
        System.out.printf("Сумма периметров: %.2f\n", sumPerimeter);

        System.out.println("========================");
        CircleSingleTone single = CircleSingleTone.getCircle(-5);

        System.out.println(single != null ? single : "Фигура не создана (радиус меньше 0)");




    }
}
