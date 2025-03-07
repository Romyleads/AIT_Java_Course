package homeworks.hw_28.Task3;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class FigureApp {
    public static void main(String[] args) {

        // Создаем массив фигур
        Figure[] figures = {

                new Circle("круг",5),
                new Square("квадрат", 4),
                new Triangle("треумольник",6, 3)
        };

        // Проходим массив фигур по циклу и запускаем метод вывода площади фигуры
        for (int i = 0; i < figures.length; i++) {

            System.out.printf("Площадь фигуры %s равна: %.0f%n",
                    figures[i].getName(),
                    figures[i].calculateArea());
        }

    }
}
