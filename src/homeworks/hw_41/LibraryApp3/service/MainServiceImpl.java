package homeworks.hw_41.LibraryApp3.service;

import homeworks.hw_41.LibraryApp3.model.Book;
import homeworks.hw_41.LibraryApp3.model.User;
import homeworks.hw_41.LibraryApp3.repository.BookRepository;
import homeworks.hw_41.LibraryApp3.repository.UserRepository;
import java.util.List;
import homeworks.hw_41.LibraryApp3.utils.UserValidation;
import static homeworks.hw_41.LibraryApp3.view.RainbowConsole.*;

/*** Author: Roman Romashko Date: 18.03.2025 ***/

public class MainServiceImpl implements MainService {

    private final BookRepository bookRepository; // Хранилище книг
    private final UserRepository userRepository; // Хранилище пользователей

    private User activeUser; // Текущий авторизованный пользователь

    public MainServiceImpl(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(String email, String password) { // Регистрация пользователя

        if (!UserValidation.isEmailValid(email)) { // Проверка email
            prnt("Email is not valid!", 4);
            return null;
        }

        if (!UserValidation.isPasswordValid(password)) { // Проверка пароля
            prnt("Password is not valid!", 4);
            return null;
        }

        if (userRepository.isEmailExist(email)) { // Проверка уникальности email
            prnt("User already exists with this email!", 4);
            return null;
        }

        return userRepository.addUser(email, password); // Добавление пользователя
    }

    @Override
    public boolean loginUser(String email, String password) { // Авторизация пользователя

        User user = userRepository.getUserByEmail(email); // Получение пользователя
        if (user == null) return false; // Если пользователя нет — false

        if (user.getPassword().equals(password)) { // Проверка пароля
            activeUser = user; // Установка активного пользователя
            return true;
        }

        return false;
    }

    @Override
    public void logout() {
        activeUser = null; // Выход пользователя
    }



    @Override
    public void addBook(String title, String author) {
        bookRepository.addBook(title, author);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        return null; // Заглушка
    }

    @Override
    public List<Book> getAvailableBooks() {
        return bookRepository.getAvailableBooks();
    }

    @Override
    public List<Book> getTakenBooks() {
       return bookRepository.getTakenBooks();
    }

    @Override
    public void deleteBook(int bookId) {
        bookRepository.deleteById(bookId);
    }

    @Override
    public void takeBook(int id) {
        bookRepository.takeBook(id);

    }

    @Override
    public void returnBook(int id) {
        bookRepository.returnBook(id);
    }

    @Override
    public void editBook(int id, String newTitle, String newAuthor) {
        bookRepository.editBook(id, newTitle, newAuthor);
    }

    @Override
    public void logoutUser() {
        // Заглушка
    }

    public User getActiveUser() {
        return activeUser; // Получение текущего пользователя
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> searchByTitleOrAuthor(String query) {
        return bookRepository.searchByTitleOrAuthor(query);
    }

    public User getUserByEmail(String email) { // получение пользователя по емейл
        if (email == null || email.trim().isEmpty()) { // проверка на пустую строку и нул
            return null;
        }
        return userRepository.getUserByEmail(email);
    }

    @Override
    public boolean deleteUser(String email) {
        User user = userRepository.getUserByEmail(email);
        if (user == null) {
            return false;
        }
        if (!user.getUserBooks().isEmpty()) {
            return false;
        }
        return userRepository.deleteUser(email);
    }

    @Override
    public boolean updatePassword(String email, String newPassword) {
        // Проверяем, что вообще за пароль
        if (!UserValidation.isPasswordValid(newPassword)) {
            return false; // пароль не прошел валидацию
        }
        return userRepository.updatePassword(email, newPassword); // обновление пароля
    }
    @Override
    public List<Book> getSortedBooks(String sortField) {
        return bookRepository.getSortedBooks(sortField);
    }
}