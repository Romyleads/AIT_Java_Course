package homeworks.hw_29.Task1;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

/*
    Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
    Реализуйте классы-наследники Circle, Rectangle, и Triangle.
    Убедитесь, что все классы правильно вычисляют площадь и периметр.
    Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
*/

// Абстрактный класс Shape

public abstract class Shape {

    abstract double calculateArea();
    abstract double calculatePerimeter();
}

