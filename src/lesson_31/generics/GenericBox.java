package lesson_31.generics;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

// Создаем универсальный класс. Тип данных определяется на этапе создания объекта

// Дженерики работают только с объектами, т.е. со ссылочными типами данных и соответственно не работают с примитивными типами

public class GenericBox <G>{ // символ заполнитель, T - от слова тип

    // <T> - означает, что вместо Т при создании объекта будет вставлен конкретный тип данных
    private G value;

    public GenericBox(G value) {
        this.value = value;

    }

    public G getValue() {
        return value;

    }

    public void setValue(G value) {
        this.value = value;

    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
