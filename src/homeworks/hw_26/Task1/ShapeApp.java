package homeworks.hw_26.Task1;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class ShapeApp {
    public static void main(String[] args) {

        // Создаем объект класса Rectangle и задаем имя
        Rectangle rectangle = new Rectangle("Прямоугольник");

        // Или
        // Rectangle rectangle = new Rectangle();
        // rectangle.setName("Прямоугольник");

        // Устанавливаем значение полей
        rectangle.setDimensions(5, 7);
        rectangle.setColor("Красный");

        // Создаем объект класса Circle и задаем имя
        Circle circle = new Circle("Круг");

        // Устанавливаем значения полей
        circle.setRadius(3);
        circle.setColor("Синий");


        // Выводим информацию о прямоугольнике
        rectangle.displayInfo();
        rectangle.calculateArea();

        // Выводим информацию о круге
        circle.displayInfo();
        circle.calculateArea();


    }
}
