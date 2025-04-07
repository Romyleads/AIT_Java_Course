package homeworks.hw_41.LibraryApp.repository;

import homeworks.hw_41.LibraryApp.model.Book;
import homeworks.hw_41.LibraryApp.utils.MyList;

public interface BookRepository {

    void addBook(String title, String author);

    MyList<Book> getAllBooks();

    MyList<Book> searchByTitle(String query);
    MyList<Book> searchByAuthor(String query);

    MyList<Book> searchByTitleOrAuthor(String query);
    MyList<Book> getAvailableBooks();
    MyList<Book> getTakenBooks();
    MyList<Book> getSortedBooks(String sortField); // Отсортированный список

    void takeBook(int id);
    void returnBook(int id);
    void deleteById(int id);
    void editBook(int id, String newTitle, String newAuthor);


}
