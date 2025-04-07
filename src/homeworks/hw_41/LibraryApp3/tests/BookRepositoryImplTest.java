package homeworks.hw_41.LibraryApp3.tests;

import homeworks.hw_41.LibraryApp3.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import homeworks.hw_41.LibraryApp3.repository.BookRepositoryImpl;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookRepositoryImplTest {

    private BookRepositoryImpl bookRepository;

    @BeforeEach
    public void setUp() {
        bookRepository = new BookRepositoryImpl();
    }

    @Test
    public void addBook() {
        int initialSize = bookRepository.getAllBooks().size();
        bookRepository.addBook("New book", "Some Author");
        assertEquals(initialSize + 1, bookRepository.getAllBooks().size());
    }

    @Test
    public void testGetAllBooks() {
        List<Book> books = bookRepository.getAllBooks();
        assertNotNull(books);
        assertFalse(books.isEmpty());
    }

    @Test
    public void testSearchByTitle() {
        List<Book> result = bookRepository.searchByTitle("Чистый код");
        assertFalse(result.isEmpty());
        assertEquals("Чистый код. Создание, анализ и рефакторинг", result.get(0).getTitle());
    }

    @Test
    public void testSearchByAuthor() {
        List<Book> result = bookRepository.searchByAuthor("Роберт Мартин");
        assertFalse(result.isEmpty());
        assertEquals("Чистый код. Создание, анализ и рефакторинг", result.get(0).getTitle());
    }

    @Test
    public void testSearchByTitleOrAuthor() {
        List<Book> result = bookRepository.searchByTitleOrAuthor("Паттерны");
        assertFalse(result.isEmpty());
    }

    @Test
    public void testGetAvailableBooks() {
        List<Book> availableBooks = bookRepository.getAvailableBooks();
        assertNotNull(availableBooks);
    }

    @Test
    public void testTakeBook() {
        Book book = bookRepository.getAllBooks().get(0);
        bookRepository.takeBook(book.getId());
        assertTrue(book.isTaken());
    }

    @Test
    public void testReturnBook() {
        Book book = bookRepository.getAllBooks().get(0);
        bookRepository.takeBook(book.getId());
        bookRepository.returnBook(book.getId());
        assertFalse(book.isTaken());
    }

    @Test
    public void testEditBook() {
        Book book = bookRepository.getAllBooks().get(0);
        bookRepository.editBook(book.getId(), "Новое название", "Новый автор");
        assertEquals("Новое название", book.getTitle());
        assertEquals("Новый автор", book.getAuthor());
    }

    @Test
    public void testDeleteById() {
        Book book = bookRepository.getAllBooks().get(0);
        int initialSize = bookRepository.getAllBooks().size();
        bookRepository.deleteById(book.getId());
        assertEquals(initialSize - 1, bookRepository.getAllBooks().size());
    }

    @Test
    public void testGetSortedBooksByTitle() {
        List<Book> sortedBooks = bookRepository.getSortedBooks("title");
        assertTrue(sortedBooks.get(0).getTitle().compareTo(sortedBooks.get(1).getTitle()) <= 0);
    }

    @Test
    public void testGetSortedBooksByAuthor() {
        List<Book> sortedBooks = bookRepository.getSortedBooks("author");
        assertTrue(sortedBooks.get(0).getAuthor().compareTo(sortedBooks.get(1).getAuthor()) <= 0);
    }
}