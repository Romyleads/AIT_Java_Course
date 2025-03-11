package lesson_30.interfaces;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class Application {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита", "М. Булгаков");
        book.print();

        book.defaultMethod();

        Journal journal = new Journal("Cosmopolitan", 154);
        journal.print();

        // Использование интерфейса
        Printable printable = journal; // Приведение типа к интерфейсу
        printable.print();

        Printable printable2 = new Book("Философия Java", "Б. Эккель");
        printable2.print();

        System.out.println("\n============");

        Printable.testStaticMethod("Hello!");

        System.out.println("\n============");

        ColorPrintable presentation = new Presentation(
                "Inheritance",
               "Noname",
                "Inheritance in 00P");

        presentation.print();
        presentation.defaultMethod();
        presentation.colorPrint();
    }
}




