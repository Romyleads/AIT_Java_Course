package lesson_32;

/*** Author: Roman Romashko Date: 12.03.2025 ***/

public class TypeErasure<E> {
    private Object value;

    public TypeErasure(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        TypeErasure<Integer> t = new TypeErasure<>(5);
    }

    public Integer getValue() {
        return (Integer) value;
    }

    // Нельзя сделать перегруженный метод, отличающийся только типами параметров

    public void setValue(Object value) {
        this.value = value;
    }

    // public void method (TypeErasure<String> tErasure) {
    // System.out.println(tErasure);
    // }

    public void method(TypeErasure<Integer> typeErasure) {
        System.out.println(typeErasure);
    }
}
