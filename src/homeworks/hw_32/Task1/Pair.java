package homeworks.hw_32.Task1;

/*** Author: Roman Romashko Date: 13.03.2025 ***/

/*
    Task 1
    Создайте обобщенный класс Pair, который хранит две переменные одного типа.

    Требования:

    Класс должен иметь конструктор, принимающий два параметра типа T.
    Методы:
    T getFirst() — возвращает первый элемент.
    T getSecond() — возвращает второй элемент.
    void setFirst(T value) — устанавливает значение первого элемента.
    void setSecond(T value) — устанавливает значение второго элемента.
    void swap() — меняет местами первый и второй элементы.
 */

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    // Метод для замены местами двух элементов Т
    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }

}
