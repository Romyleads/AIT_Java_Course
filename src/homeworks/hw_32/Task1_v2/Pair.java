package homeworks.hw_32.Task1_v2;

/*** Author: Roman Romashko Date: 13.03.2025 ***/

public class Pair <E>{
    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    // Метод для замены местами двух элементов E
    public void swap() {
        E temp = first;
        first = second;
        second = temp;
    }

    public static void main(String[] args) {

        Pair pair = new Pair<>("Hallo","Java");



        System.out.println(pair.toString());

        pair.swap();
        System.out.println(pair.toString());

        pair.setFirst("New First");
        pair.setSecond("New Second");

        System.out.println("======================");

        System.out.println(pair.toString());


    }


}
