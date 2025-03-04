package homeworks.hw_25;

/*** Author: Roman Romashko Date: 04.03.2025 ***/

/*
    Task 3
    Неизменяемый объект
    Создайте класс ImmutablePoint:

    •	Объявите final поля x и y типа int.
    •	Инициализируйте их через конструктор.
    •	Попытайтесь создать методы-сеттеры для изменения значений x и y.
    •	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */

public class ImmutablePoint {

    // Объявляем неизменяемые (final) поля x и y
    public final int x;
    public final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // В оболочке Intellij IDEA даже не появляется возможность способа генерации сеттеров класса
    // Попытка вызвать сеттеры для установки неизменяемых переменных приводит к ошибке: cannot assign a value to final variable x

    // public int setX(int x) {
    //    this.x = x;
    // }

    // cannot assign a value to final variable y

    // public int setY(int y) {
    //     this.y = y;
    //}

    // public static void main(String[] args) {
    // ImmutablePoint ipoint = new ImmutablePoint(5, 10);

    // }

}

