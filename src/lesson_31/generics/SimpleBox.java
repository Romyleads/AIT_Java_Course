package lesson_31.generics;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public class SimpleBox {
    private Object value;

    public SimpleBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleBox{" + "value=" + value + '}';
    }
}
