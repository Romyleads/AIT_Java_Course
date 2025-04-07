
package homeworks.hw_41.LibraryApp3.model;

import homeworks.hw_41.LibraryApp3.utils.EmailValidateException;
import homeworks.hw_41.LibraryApp3.utils.PasswordValidateException;
import homeworks.hw_41.LibraryApp3.utils.UserValidator;
import static homeworks.hw_41.LibraryApp3.view.RainbowConsole.*;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String email;
    private String password;
    private Role role = Role.USER;

    private List<Book> userBooks = new ArrayList<>(); // список книг пользователя

    public User(String email, String password) {
        try {
            setEmail(email);
        } catch (EmailValidateException e) {
            prnt("Invalid email: " + e.getMessage(), 4);
        }

        try {
            setPassword(password);
        } catch (PasswordValidateException e) {
            prnt("Invalid password: " + e.getMessage(), 4);
        }
    }

    public User(String email, String password, Role role) {
        this(email, password);
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailValidateException {
        UserValidator.validateEmail(email);
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordValidateException {
        UserValidator.validatePassword(password);
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Book> getUserBooks() {
        return userBooks;
    }

    public void addBook(Book book) {
        userBooks.add(book);
    }

    public void removeBook(Book book) {
        userBooks.remove(book);
    }

    @Override
    public String toString() {
        return "User{" + "email='" + email + "', role=" + role + '}';
    }
}
