package homeworks.hw_26.Task1;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

/*

    Task 1
    Иерархия классов “Фигуры”
    Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.

    При создании классов не забудьте о конструкторах

    Базовый класс Shape
    Создайте класс Shape.
    Добавьте поле name типа String, которое хранит название фигуры.
    Создайте метод displayInfo(), который выводит на экран значение поля name.

    Класс Rectangle (Прямоугольник)
    Создайте класс Rectangle, который наследуется от Shape.
    Добавьте поля width и height типа double, которые хранят размеры прямоугольника.
    Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height.
    Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.

    Класс Circle (Круг)
    Создайте класс Circle, который наследуется от Shape.
    Добавьте поле radius типа double, которое хранит радиус круга.
    Создайте метод setRadius(double radius), который устанавливает значение поля radius.
    Создайте метод calculateArea(), который вычисляет и выводит площадь круга.

    Класс Main
    В методе main создайте объекты классов Rectangle и Circle.
    Установите значения для их полей с помощью соответствующих методов.
    Установите имя фигуры, используя поле name, унаследованное от класса Shape.
    Вызовите метод displayInfo() и методы вычисления площади для каждого объекта, чтобы вывести информацию о фигуре и её площади.

    Дополнительное задание (по желанию):
    Добавьте в класс Shape поле color типа String и метод setColor(String color).
    Установите цвет для каждой фигуры и выведите эту информацию в методе displayInfo().

 */

// Родитель - класс Shape

class Shape {
    private String name;
    private String color;

    public Shape(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println(this);
    }
    // Все как мы любим
    public String toString() {
        return String.format("Фигура: %s, Цвет: %s", name, (color != null ? color : "не задан"));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}