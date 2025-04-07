package homeworks.hw_41.LibraryApp3.view;

import homeworks.hw_41.LibraryApp3.model.Book;
import homeworks.hw_41.LibraryApp3.model.Role;
import homeworks.hw_41.LibraryApp3.model.User;
import homeworks.hw_41.LibraryApp3.service.MainService;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import static homeworks.hw_41.LibraryApp3.view.RainbowConsole.*;

public class Menu {

    private final MainService service;
    private final Scanner scanner = new Scanner(System.in);

    public Menu(MainService service) {
        this.service = service;
    }

    public void start() {
        while (true) {
            User activeUser = service.getActiveUser(); // получаем активного пользователя
            Role role = (activeUser != null) ? activeUser.getRole() : Role.GUEST; // определяем его роль
            showMenu(role, activeUser);  // передаем role и activeUser

            // проверка строки ввода на целое число, защита от ошибки
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера ввода
                handleMenuChoice(choice, role);
            } else {
                // Если ввели не число, выводим предупреждение и очищаем ввод
                prnt("\n   [!] Invalid input. Please enter a number from the menu list!", 4);
                scanner.nextLine();
                waitRead();
            }
        }
    }

    private void showMenu(Role role, User activeUser) {
        prnt("\n== 📚 Welcome to 'Century Knowledge Library' ==", 1);
        prnt("1. All books", 0);
        prnt("2. Available books", 0);
        prnt("3. Books sorted by author", 0);
        prnt("4. Books sorted by title", 0);
        prnt("5. Search by title", 0);
        prnt("6. Search by author", 0);

        if (role == Role.USER || role == Role.ADMIN) {
            prnt("-----------------------------", 1);
            prnt("7. Borrow a book", 0);
            prnt("8. Return a book", 0);
            prnt("9. " + ACCENT + "❤" + RESET + " My borrowed books", 0);
        }

        if (role == Role.ADMIN) {
            prnt("--------------------------------", 1);
            prnt("10. Add a book", 1);
            prnt("11. Edit a book", 1);
            prnt("12. Delete a book", 1);
            prnt("13. Books currently borrowed", 1);
            prnt("14. User management", 2);
        }

        if (role == Role.GUEST) {
            prnt("15. Register", 2);
            prnt("16. Login", 2);
        }

        if (role == Role.USER || role == Role.ADMIN) {
            String username = activeUser.getEmail();
            String roleName = activeUser.getRole().name();
            prnt("--------------------------------", 1);
            prnt("17. Logout (" + username + ")", 3);
        }

        prnt("0. Exit", 3);
        prnt("==============================", 1);
        System.out.print("  👉 Select menu option: ");
    }

    private void handleMenuChoice(int choice, Role role) {
        if (choice == 1) {
            /*
            1. Получаем список всех книг
            2. Если книг нет - выводим сообщение - список книг пуст.
            3. Если книги есть - выводим список книг
            4. Ставим задержку - даем просмотреть список
            */
            prnt("\n   = All books in the library ===", 1);
            //System.out.println();
            List<Book> books = service.getAllBooks();
            if (books == null || books.isEmpty()) {
                prnt("No books in our library yet.", 3);
            } else {
                for (Book book : books) {
                    prnt(""
                            + WARNING + book.getId() + ". "+ RESET
                            + "" + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }
            waitRead();

        } else if (choice == 2) { // Выводим список доступных книг
            prnt("\n   = Available books ===", 1);
            //System.out.println();
            List<Book> availableBooks = service.getAvailableBooks();
            if (availableBooks == null || availableBooks.isEmpty()) {
                prnt("No available books at the moment.", 3);
            } else {
                for (Book book : availableBooks) {
                    prnt(""
                            + WARNING + book.getId() + ". "+ RESET
                            + "" + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }
            waitRead();
        } else if (choice == 3) {
            prnt("\n   = List of books sorted by author ===", 1);
            //System.out.println();
            List<Book> sortedBooks = service.getSortedBooks("author");
            if (sortedBooks == null || sortedBooks.isEmpty()) {
                prnt("No books yet.", 3);
            } else {
                for (Book book : sortedBooks) {
                    prnt(WARNING + book.getId() + ". " + RESET
                            + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }
            waitRead();

        } else if (choice == 4) {
            prnt("\n   = List of books sorted by title ===", 1);
            //System.out.println();
            List<Book> sortedBooks = service.getSortedBooks("title");
            if (sortedBooks == null || sortedBooks.isEmpty()) {
                prnt("No books yet.", 3);
            } else {
                for (Book book : sortedBooks) {
                    prnt(WARNING + book.getId() + ". " + RESET
                            + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }
            waitRead();

        } else if (choice == 5) {
            prnt("\n   = Search books by title ===", 1);
            // Search by title (поиск без уточнения авторства)
            System.out.print("    Enter book title or part of it: ");
            String titleSearch = scanner.nextLine();

            // Получаем список книг, убедившись, что он не null
            List<Book> booksByTitleSearch = service.searchByTitleOrAuthor(titleSearch);

            // Если метод вернул null, инициализируем пустым списком
            if (booksByTitleSearch == null) {
                booksByTitleSearch = new ArrayList<>();
            }

            if (booksByTitleSearch.isEmpty()) {
                prnt("   Books with title containing '" + titleSearch + "', not found.", 3);
            } else {
                System.out.println();
                for (Book book : booksByTitleSearch) {
                    prnt(WARNING + book.getId() + ". " + RESET
                            + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }
            waitRead();

        } else if (choice == 6) {
            prnt("\n   = Search books by author ===", 1);
            // Search by author (поиск без уточнения названия)
            System.out.print("    Enter author name: ");
            String authorSearch = scanner.nextLine();
            List<Book> booksByAuthorSearch = service.searchByTitleOrAuthor(authorSearch);

            // Проверяем, что booksByAuthorSearch не равен null
            if (booksByAuthorSearch == null || booksByAuthorSearch.isEmpty()) {
                prnt("   Books by author '" + authorSearch + "' not found.", 3);
            } else {
                System.out.println();
                for (Book book : booksByAuthorSearch) {
                    prnt(WARNING + book.getId() + ". " + RESET
                            + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }
            waitRead();

        } else if (choice == 7 && (role == Role.USER || role == Role.ADMIN)) {

            prnt("\n   = Borrow a book ===\n", 1);

            List<Book> availableBooks = service.getAvailableBooks();
            if (availableBooks == null || availableBooks.isEmpty()) {
                prnt("No available books at the moment.", 3);
            } else {
                for (Book book : availableBooks) {
                    prnt(""
                            + WARNING + book.getId() + ". "+ RESET
                            + "" + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }

            System.out.print("\n"+PRIMARY+"   Enter book id: "+RESET);
            int id = scanner.nextInt();
            scanner.nextLine();

            // Получаем книгу по id из общего списка
            List<Book> allBooks = service.getAllBooks();
            Book selectedBook = null;
            for (Book book : allBooks) {
                if (book.getId() == id) {
                    selectedBook = book;
                    break;
                }
            }

            if (selectedBook == null) {
                prnt("\n   Book with this ID not found.", 4);
            } else if (selectedBook.isTaken()) {
                prnt("\n   Sorry, this book is already taken.", 4);
            } else {
                // Вызываем сервис для взятия книги
                service.takeBook(id);
                // Добавляем книгу в список книг активного пользователя
                service.getActiveUser().getUserBooks().add(selectedBook);
                prnt("\n   You have successfully borrowed the book: \"" + selectedBook.getTitle() + "\"", 2);
            }
            waitRead();

        } else if (choice == 8 && (role == Role.USER || role == Role.ADMIN)) {

            prnt("\n   = List of books to return ===", 1);
            //System.out.println();
            User activeUser = service.getActiveUser();
            List<Book> myBooks = activeUser.getUserBooks();
            if (myBooks == null || myBooks.isEmpty()) {
                prnt("You have no borrowed books.", 3);
            } else {
                for (Book book : myBooks) {
                    prnt(WARNING + book.getId() + ". " + RESET
                            + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }

                System.out.print("\n    Enter book id to return: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                Book selectedBook = null;
                List<Book> userBooks = activeUser.getUserBooks();
                for (Book book : userBooks) {
                    if (book.getId() == id) { // Ищем книгу в списке книг пользователя
                        selectedBook = book;
                        break;
                    }
                }

                if (selectedBook == null) {
                    prnt("\n     You do not have a book with this ID.", 4);
                } else {
                    // Вызываем сервис для возврата книги
                    service.returnBook(id);
                    // Удаляем книгу из списка книг активного пользователя
                    // (Предполагается, что MyList имеет метод remove(T value))
                    userBooks.remove(selectedBook);
                    prnt("\n    Book successfully returned!", 2);
                }

            }
            waitRead();

        } else if (choice == 9 && (role == Role.USER || role == Role.ADMIN)) {

            prnt("\n   = My borrowed books ===", 1);
            //System.out.println();
            User activeUser = service.getActiveUser();
            List<Book> myBooks = activeUser.getUserBooks();
            if (myBooks == null || myBooks.isEmpty()) {
                prnt("You have no borrowed books.", 3);
            } else {
                for (Book book : myBooks) {
                    prnt(WARNING + book.getId() + ". " + RESET
                            + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }
            waitRead();

        } else if (choice == 10 && role == Role.ADMIN) {

            prnt("\n  = Add book to library ===", 1);
            //System.out.println();

            System.out.print("    Enter book title: ");
            String title = scanner.nextLine().trim();

            System.out.print("    Enter author name: ");
            String author = scanner.nextLine().trim();

            if (title.isEmpty() || author.isEmpty()) {
                prnt("\n Error: title and author cannot be empty.", 4);
            } else {
                service.addBook(title, author);
                prnt("\n    Book successfully added!", 2);
            }
            waitRead();

        } else if (choice == 11 && role == Role.ADMIN) {
            prnt("\n   = Edit book ===", 1);

            // Вывод списка книг для выбора
            List<Book> availableBooks = service.getAvailableBooks();
            if (availableBooks == null || availableBooks.isEmpty()) {
                prnt("No available books at the moment.", 3);
            } else {
                for (Book book : availableBooks) {
                    prnt(""
                            + WARNING + book.getId() + ". "+ RESET
                            + "" + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }

            System.out.print("\n"+PRIMARY+"   Enter book id: "+RESET);
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("\n   Enter new book title: ");
            String newTitle = scanner.nextLine().trim();

            System.out.print("    Enter new author: ");
            String newAuthor = scanner.nextLine().trim();

            if (newTitle.isEmpty() || newAuthor.isEmpty()) {
                prnt("\n    Ошибка: title and author cannot be empty.", 4);
            } else {
                service.editBook(id, newTitle, newAuthor);
                prnt("\n   Book successfully updated!", 2);
            }
            waitRead();

        } else if (choice == 12 && role == Role.ADMIN) {
            prnt("\n   = Delete book from library ===", 1);
            // Вывод списка книг для выбора
            List<Book> availableBooks = service.getAvailableBooks();
            if (availableBooks == null || availableBooks.isEmpty()) {
                prnt("No available books at the moment.", 3);
            } else {
                for (Book book : availableBooks) {
                    prnt(""
                            + WARNING + book.getId() + ". "+ RESET
                            + "" + book.getTitle() + " " + WARNING
                            + "Author: " + RESET + book.getAuthor(), 3);
                }
            }

            System.out.print("\n"+PRIMARY+"   Enter book id: "+RESET);
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                scanner.nextLine();
                if (id <= 0) {
                    prnt("\n   Error: invalid book number.", 4);
                } else {

                    // Получаем книгу по id из общего списка
                    List<Book> allBooks = service.getAllBooks();
                    Book selectedBook = null;
                    for (Book book : allBooks) {
                        if (book.getId() == id) {
                            selectedBook = book;
                            break;
                        }
                    }

                    service.deleteBook(id);
                    prnt("\n   Book " + selectedBook.getTitle() + " successfully deleted!", 2);
                }
            } else {
                prnt("\n   Error: please enter a valid number.", 4);
                scanner.nextLine(); // очистка
            }
            waitRead();

        } else if (choice == 13 && role == Role.ADMIN) {
            prnt("\n   = Books currently borrowed ===", 1);
            //System.out.println();
            // Получаем список всех пользователей
            List<User> users = service.getAllUsers();
            boolean found = false;
            for (User user : users) {
                List<Book> userBooks = user.getUserBooks();
                if (userBooks != null && !userBooks.isEmpty()) {
                    found = true;
                    for (Book book : userBooks) {
                        prnt(WARNING + book.getId() + ". " + RESET
                                + book.getTitle() + " " + WARNING
                                + "Author: " + RESET + book.getAuthor()
                                + PRIMARY + "  - " + ACCENT + " borrowed by: " + PRIMARY + user.getEmail() + RESET + " (xx days)", 3);
                    }
                }
            }
            if (!found) {
                prnt("\n    No books currently borrowed.", 3);
            }
            waitRead();

        } else if (choice == 14 && role == Role.ADMIN) {
            showUserManagementMenu();
        } else if (choice == 15) {
            addUser("Register");
        } else if (choice == 16) {
            loginUser();
        } else if (choice == 17 && (role == Role.USER || role == Role.ADMIN)) {
            service.logout();
            prnt("\n   You have logged out!", 2);
            waitRead();
        } else if (choice == 0) {
            prnt("\n   Goodbye! Come again!!", 2);
            System.exit(0);
        } else {
            prnt("\n   Invalid input. Please try again.", 4);
            waitRead();
        }
    }

    private void showUserManagementMenu() {
        while (true) {
            prnt("=== User management ===", 1);
            prnt("1. View all users", 2);
            prnt("2. Find user and their books", 2);
            prnt("3. Add user", 2);
            prnt("4. Edit user", 2);
            prnt("5. Delete user", 2);
            prnt("0. Back", 3);
            prnt("==============================", 1);
            System.out.print("  👉 Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера ввода

            if (choice == 1) {
                /*
                1. Получаем список всех пользователей
                2. Если пользователей нет - выводим сообщение - список пуст
                3. Если есть - выводим список
                4. Ставим паузу
                */
                List<User> users = service.getAllUsers();

                if (users.isEmpty()) {
                    prnt("\n User list is empty.", 3);
                } else {

                    // Вывод информации о пользователе
                    prnt("\n = List of users ===\n", 1);
                    int i=0;
                    for (User user : users) {
                        i++;
                        prnt("" + i + ": "
                                + "Email: " + user.getEmail() + ", "
                                + "Role: " + user.getRole() + ", "
                                + "Books: " + user.getUserBooks().toString(), 3);
                    }
                }
                waitRead();

            } else if (choice == 0) {
                break;
            } else if (choice == 2) {

                // Вывод информации о пользователе
                prnt("\n   = Search user ===", 1);
                System.out.print("     Enter email: ");

                String email = scanner.nextLine();
                User userByEmail = service.getUserByEmail(email);

                if (userByEmail == null) {
                    prnt("\n   User with email " + email + " not found.", 3);
                } else {
                    prnt("  User found: "
                            + "Email: " + userByEmail.getEmail() + ", "
                            + "Role: " + userByEmail.getRole() + ", "
                            + "Books: " + userByEmail.getUserBooks().toString(), 3);
                }
                waitRead();
            } else if (choice == 3) {
                addUser("Add");
            } else if (choice == 4){
                editUser();
            } else if (choice == 5) {
                deleteUser();
                waitRead();
            }
            else {
                prnt("\n   Invalid input. Попробуйте снова.", 4);
                waitRead();
            }
        }
    }

    private void waitRead() {
        System.out.println("\n   Press Enter to continue...");
        scanner.nextLine(); // Waiting for Enter key press
    }

    private void loginUser() {
        prnt("\n   = User Login ===", 1);
        System.out.print("     Enter email: ");
        String email = scanner.nextLine();

        System.out.print("     Enter password: ");
        String password = scanner.nextLine();

        boolean loggedIn = service.loginUser(email, password);

        if (loggedIn) {
            prnt("\n   [+] Welcome, "+ email + "!\n", 2);
            //waitRead();
        } else {
            prnt("\n   [!] Invalid email or password!", 4);
            waitRead();
        }
    }

    private void addUser(String action) {

        // Register
        /*
         1. Запросить у пользователя email и пароль
         2. Передать полученные данные в СЕРВИСНЫЙ слой
         3. Получить ответ от сервисного слоя -
         4. Сообщить результат пользователю
         */

        prnt("\n   = " + action + " user ===", 1);
        System.out.print("     Enter email: ");
        String email = scanner.nextLine();
        System.out.print("     Enter password: ");
        String password = scanner.nextLine();

        User user = service.registerUser(email, password);

        if (user == null) {
            prnt("  [!] Operation cancelled", 4);
        } else {
            prnt("\n    [+] User registered", 2);
        }

        waitRead();
    }
    private void deleteUser() {
        prnt("\n = Delete user ===", 1);
        System.out.print("   Enter user's email: ");
        String email = scanner.nextLine();

        if (!service.deleteUser(email)) {
            // Проверяем, существует ли пользователь
            if (service.getUserByEmail(email) == null) {
                prnt("\n  User not found.", 4);
            } else {
                prnt("\n   Cannot delete user because they have borrowed books!", 4);
            }
        } else {
            prnt("\n   User was successfully deleted.", 2);
        }

    }

    private void editUser() {
        prnt("\n = Edit user ===", 1);
        System.out.print("   Enter email пользователя: ");
        String email = scanner.nextLine();

        // Проверяем, существует ли такой пользователь
        User user = service.getUserByEmail(email);
        if (user == null) {
            prnt("User not found.", 4);
            waitRead();
            return;
        }

        System.out.print("   Enter new password: ");
        String newPassword = scanner.nextLine();

        boolean result = service.updatePassword(email, newPassword);
        if (result) {
            prnt("\n  User updated successfully.", 2);
        } else {
            prnt("\n  Validation failed! Update cancelled.", 4);
        }

        waitRead();
    }
}