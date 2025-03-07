package homeworks.hw_28.Task3;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

/*
    Task 3 опционально
    Фигуры и их площади.

    Создайте класс Фигура с методом рассчитатьПлощадь().

    Реализуйте классы различных геометрических фигур (например, Круг, Квадрат, Треугольник).

    В главном классе создайте список фигур и вычислите площадь каждой из них.
 */
public class Figure {

    String name;

    public Figure(String name) {
        this.name = name;
    }
    // базовая фигура ничего не считает, пустой метод по-умолчанию
    public double calculateArea() {
        return 0;
    }

    public String getName() {
        return name;
    }


}
