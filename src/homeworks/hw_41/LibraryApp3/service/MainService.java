package homeworks.hw_41.LibraryApp3.service;

import homeworks.hw_41.LibraryApp3.model.Book;
import homeworks.hw_41.LibraryApp3.model.User;
import java.util.List;

/*** Author: Roman Romashko Date: 17.03.2025 ***/

public interface MainService {

    User registerUser(String email, String password); // Регистрация нового пользователя

    boolean loginUser(String email, String password); // Авторизация пользователя

    void logout(); // Выход пользователя из системы

    void addBook(String title, String author); // Добавить новую книгу

    List<Book> getAllBooks(); // Получить список всех книг

    List<Book> getBooksByTitle(String title); // Найти книги по названию

    List<Book> getAvailableBooks(); // Получить список доступных книг

    void deleteBook(int bookId); // Удалить книгу по её ID

    List<Book> getTakenBooks();

    void takeBook(int id); // Взять книгу

    void returnBook(int id); // Отдать книгу

    void editBook(int id, String newTitle, String newAuthor); // Редактировать книгу

    //void logoutUser(); // Разлогинивание пользователя

    void logoutUser();

    User getActiveUser(); // Получить текущего авторизованного пользователя

    List<User> getAllUsers(); // Вывод всех пользователей через слой сервис

    List<Book> searchByTitle(String title);

    List<Book> searchByAuthor(String author);

    List<Book> searchByTitleOrAuthor(String titleSearch);
    User getUserByEmail(String email);

    boolean deleteUser(String email);

    boolean updatePassword(String email, String newPassword); // обновление данных пользователя

    List<Book> getSortedBooks(String sortField); // Отсортированный список

}