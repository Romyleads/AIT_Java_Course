package lesson_30.interfaces;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class Book implements Printable{

    String name;
    String number;

    public Book(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.printf("Book %s #%s\n", name, number);
    }


    @Override
    public void defaultMethod() {
        System.out.println("Overriding default method");
    }
}
