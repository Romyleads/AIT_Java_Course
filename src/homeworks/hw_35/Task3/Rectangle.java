package homeworks.hw_35.Task3;

import homeworks.hw_35.Task3.lists.MyList;

import java.util.Iterator;
import java.util.List;

/*** Author: Roman Romashko Date: 18.03.2025 ***/

/*
        Начало в таск 1 и таск 2.
        Task 3. Опционально задание
        Удаление дубликатов из списка объектов “Rectangle”
        Создайте метод, который:
        - принимает список объектов Rectangle и объект Rectangle,
        - удаляет из списка все объекты, которые равны переданному объекту (по значению полей length и width).

        Требования:
        Метод удаления дубликатов:
        Реализуйте метод removeDuplicates, который принимает список List и объект Rectangle.

        Метод должен удалить из списка все объекты, которые равны переданному объекту (используя переопределённый метод equals()).

        Метод main():
        Создайте список MyList и добавьте в него несколько объектов, включая дубликаты.

        Вызовите метод removeDuplicates, передав ему список и объект Rectangle, дубликаты которого нужно удалить.
        Выведите на экран список до и после удаления дубликатов.
        Важно!
        Будьте внимательны при удалении элементов из списка во время перебора в цикле.
        Если вы удаляете элементы из списка, по которому в данный момент итерируетесь, это может привести к ошибкам или пропуску элементов.
        Подумайте, как можно правильно организовать цикл, чтобы корректно удалить необходимые элементы без возникновения проблем.
        Пример использования в main():

        public class RectangleTest {
        public static void main(String[] args) {
        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

                System.out.println("Список до удаления дубликатов:");
                for (Rectangle rect : rectangles) {
                    System.out.println(rect);
                }

                Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
                RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

                System.out.println("\nСписок после удаления дубликатов:");
                for (Rectangle rect : rectangles) {
                    System.out.println(rect);
                }
            }
        }

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

    // На основании текущих данных переопределяем equals


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Rectangle rectangle)) return false;

        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(length);
        result = 31 * result + Double.hashCode(width);
        return result;
    }


}
