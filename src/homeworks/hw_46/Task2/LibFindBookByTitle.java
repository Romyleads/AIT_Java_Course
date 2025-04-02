package homeworks.hw_46.Task2;

import java.util.Optional;

/*** Author: Roman Romashko Date: 02.04.2025 ***/

/*
Task 2
    Поиск книги в библиотеке
    Создайте класс Library, в котором хранится список книг.
    У каждой книги есть название (title) и автор (author).

    Реализуйте метод:
    Optional<Book> findBookByTitle(String title)

    Он должен возвращать Optional — книгу, если она найдена, или Optional.empty(), если такой книги нет.

    Что нужно сделать:
    Создайте класс Book с полями title и author, и сделайте для них геттеры.
    Создайте класс Library, в котором будет список книг.
    Реализуйте метод findBookByTitle, который ищет книгу по названию.

    В main() методе попробуйте:
    Найти книгу, которая точно есть.
    Найти книгу, которой нет.
    Вывести информацию о книге, если она найдена.
    Вывести "Книга не найдена", если её нет.
 */

public class LibFindBookByTitle {
    public static void main(String[] args) {

        // Создаём библиотеку
        Library library = new Library();

        // Добавляем книги
        library.addBook(new Book("Name of Book1", "Author1"));
        library.addBook(new Book("Name of Book2", "Author2"));
        library.addBook(new Book("Name of Book3", "Author3"));

        // Распечатаем библиотеку
        System.out.println("library.toString(): " + library.toString());

        String find = "Name of Book1";
        System.out.println("to find: " + find);

        // Пробуем найти книгу, которая есть
        Optional<Book> bookOpt = library.findBookByTitle(find);

        // Выводим информацию
        // Проверка на наличие значения
        if (bookOpt.isPresent()) {

            // Достаем книгу
            Book book = bookOpt.get();

            // Распечатываем по ней информацию
            System.out.println("Книга найдена!");
            System.out.println("Название: " + book.getTitle());
            System.out.println("Автор: " + book.getAuthor());
        } else {
            System.out.println("Книга не найдена!");
        }

        System.out.println("=======================================");

        find = "Java для начинающих";
        System.out.println("to find: " + find);


        // Пробуем найти книгу, которой нет
        Optional<Book> missing = library.findBookByTitle(find);

        // Выводим информацию
        if (missing.isPresent()) {
            Book book = missing.get();
            System.out.println("Книга найдена!");
            System.out.println("Название: " + book.getTitle());
            System.out.println("Автор: " + book.getAuthor());
        } else {
            System.out.println("Книга не найдена!");
        }
    }
}
