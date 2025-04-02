package homeworks.hw_46.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*** Author: Roman Romashko Date: 02.04.2025 ***/

public class Library {

    // Создаем список книг библиотеки
    private List<Book> books = new ArrayList<>();

    // Создаем метод добавления книги
    public void addBook(Book book){
        books.add(book);

    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    // Создаем поиск по названию по заданию с возвратом Optional<Book>
    public Optional<Book> findBookByTitle(String title){

        Book result = null;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result = book;
            }
        }
        return Optional.ofNullable(result); // если result == null - вернёт Optional.empty()

        }
    }
