package homeworks.hw_29.Task1;

import homeworks.hw_28.Task3.Triangle;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class ShapeApp {
    public static void main(String[] args) {

        // Создадим общие переменные сумм площадей и периметров
        double totalArea = 0;
        double totalPerimeter = 0;
        String myshape = "";

        // Создадим массив дочерних объектов класса Shape и запишем в него фигуры со значениями полей
        Shape[] shapes = {new Circle(5), new Rect(4,6), new Tria(3,4,5)};

        // Выводим массив и считаем необходимые значения
        for (int i = 0; i < shapes.length; i++) {

            // Проверяем тип объекта с помощью instanceof
            if (shapes[i] instanceof Circle) {
                myshape = "Круг";
            } else if (shapes[i] instanceof Rect) {
                myshape = "Прямоугольник";
            } else if (shapes[i] instanceof Tria) {
                myshape = "Треугольник";
            } else {
                myshape = "Неизвестная фигура";
            }

            System.out.println(String.format("Площадь фигуры %s равна %.0f", myshape, shapes[i].calculateArea()));
            System.out.println(String.format("Периметр фигуры %s равен %.0f", myshape, shapes[i].calculatePerimeter()));

            totalArea += shapes[i].calculateArea();
            totalPerimeter += shapes[i].calculatePerimeter();

        }

        System.out.println(String.format("Общая площадь фигур равна %.0f", totalArea));
        System.out.println(String.format("Общий периметр фигур равен %.0f", totalPerimeter));






    }
}
