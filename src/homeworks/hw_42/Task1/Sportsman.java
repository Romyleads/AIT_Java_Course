package homeworks.hw_42.Task1;

import java.util.Comparator;

/*** Author: Roman Romashko Date: 27.03.2025 ***/


    /*
    Task 1
    Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).
    Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.
    Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию,
    например, по score.

    В методе main создайте массив из нескольких объектов Sportsman.

    Отсортируйте его с использованием:

    естественного порядка, определенного в Comparable,
    данного класса Comparator,
    анонимного класса Comparator для сортировки по третьему полю (например, age).
    Выведите каждый вариант отсортированного массива в консоль.
    */

class Sportsman implements Comparable<Sportsman> {

    private String name;
    private int age;
    private int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getScore() { return score; }

    @Override
    public int compareTo(Sportsman other) {
        return this.name.compareTo(other.name); // по имени
    }

    @Override
    public String toString() {
        return name + " (age: " + age + ", score: " + score + ")";
    }
}