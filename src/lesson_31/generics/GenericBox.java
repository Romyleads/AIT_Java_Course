package lesson_31.generics;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

// Создаем универсальный класс. Тип данных определяется на этапе создания объекта

// Дженерики работают только с объектами, т.е. со ссылочными типами данных и соотвественно не работают с примитивными типами

public class GenericBox <T>{ // символ заполнитель, T - от слова тип

    // <T> - означает, что вместо Т при создании объекта будет вставлен конкретный тип данных
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
