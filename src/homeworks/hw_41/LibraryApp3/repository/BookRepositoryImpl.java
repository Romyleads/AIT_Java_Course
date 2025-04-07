
package homeworks.hw_41.LibraryApp3.repository;
import homeworks.hw_41.LibraryApp3.model.Book;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BookRepositoryImpl implements BookRepository { // Класс-репозиторий для хранения книг

    private final Map<Integer, Book> books = new HashMap<>(); // Хранилище книг по ID
    private final AtomicInteger currentId = new AtomicInteger(1); // Счётчик ID

    public BookRepositoryImpl() {
        addStartBooks(); // Добавляем стартовые книги
    }

    private void addStartBooks() {
        addBook("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin");
        addBook("The Pragmatic Programmer: Your Journey to Mastery", "Andrew Hunt, David Thomas");
        addBook("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm");
        addBook("Python Crash Course", "Eric Matthes");
        addBook("You Don’t Know JS", "Kyle Simpson");
        addBook("Effective JavaScript", "David Herman");
        addBook("Fullstack React", "Anthony Accomazzo, Nathan Murray");
        addBook("Node.js Design Patterns", "Mario Casciaro");
        addBook("Learning React", "Alex Banks, Eve Porcello");
        addBook("Python Crash Course", "Eric Matthes");
        addBook("Head First Design Patterns", "Eric Freeman, Elisabeth Freeman");
    }

    @Override
    public void addBook(String title, String author) {
        Book book = new Book(currentId.getAndIncrement(), title, author); // Создаём книгу с ID
        books.put(book.getId(), book); // Добавляем в Map
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values()); // Возвращаем все книги
    }

    @Override
    public List<Book> searchByTitle(String query) {
        return books.values().stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList()); // Фильтрация по названию
    }

    @Override
    public List<Book> searchByAuthor(String query) {
        return books.values().stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList()); // Фильтрация по автору
    }

    @Override
    public List<Book> searchByTitleOrAuthor(String query) {
        return books.values().stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query.toLowerCase())
                        || book.getAuthor().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList()); // Поиск по названию или автору
    }

    @Override
    public List<Book> getAvailableBooks() {
        return books.values().stream()
                .filter(book -> book.isAvailable()) // Фильтрация по доступности
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getTakenBooks() {
        return books.values().stream()
                .filter(book -> !book.isAvailable()) // Фильтрация по занятости
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getSortedBooks(String sortField) {
        return books.values().stream()
                .sorted(Comparator.comparing(book -> {
                    if ("title".equalsIgnoreCase(sortField)) return book.getTitle();
                    else if ("author".equalsIgnoreCase(sortField)) return book.getAuthor();
                    else return String.valueOf(book.getId());
                }))
                .collect(Collectors.toList()); // Сортировка по полю
    }

    @Override
    public void takeBook(int id) {
        Book book = books.get(id);
        if (book != null) book.setAvailable(false); // Сделать книгу занятой
    }

    @Override
    public void returnBook(int id) {
        Book book = books.get(id);
        if (book != null) book.setAvailable(true); // Сделать книгу доступной
    }

    @Override
    public void deleteById(int id) {
        books.remove(id); // Удаление по ID
    }

    @Override
    public void editBook(int id, String newTitle, String newAuthor) {
        Book book = books.get(id);
        if (book != null) {
            book.setTitle(newTitle); // Обновляем заголовок
            book.setAuthor(newAuthor); // Обновляем автора
        }
    }
}
