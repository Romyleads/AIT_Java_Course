package homeworks.hw_41.LibraryApp3.repository;

import homeworks.hw_41.LibraryApp3.model.Book;
import java.util.List;

public interface BookRepository {

    void addBook(String title, String author);

    List<Book> getAllBooks();

    List<Book> searchByTitle(String query);
    List<Book> searchByAuthor(String query);

    List<Book> searchByTitleOrAuthor(String query);
    List<Book> getAvailableBooks();
    List<Book> getTakenBooks();
    List<Book> getSortedBooks(String sortField); // Отсортированный список

    void takeBook(int id);
    void returnBook(int id);
    void deleteById(int id);
    void editBook(int id, String newTitle, String newAuthor);


}
