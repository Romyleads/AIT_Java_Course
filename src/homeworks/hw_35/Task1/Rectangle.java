package homeworks.hw_35.Task1;

/*** Author: Roman Romashko Date: 18.03.2025 ***/

/*
    Task 1: Создание класса “Rectangle”
    Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

    length (длина) — тип double
    width (ширина) — тип double


    Конструкторы:
    Создайте конструктор, который инициализирует оба поля класса.
    Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.

    Методы:
    Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
    Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в формате: "Прямоугольник [длина=..., ширина=...]".

    Метод main():
    В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().

 */


public class Rectangle {

    private double length;
    private double width;

    // Конструктор по заданию
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник [длина=" + length + ", ширина=" + width + "]";
    }

    /*
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    */
    public static void main(String[] args) {

        // Инициация
        Rectangle rect1 = new Rectangle(5.0, 3.5);
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle(10.2, 4.8);

        // Вывод
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);

    }

}
