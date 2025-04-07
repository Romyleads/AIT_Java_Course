
package homeworks.hw_41.LibraryApp3.utils;

public class PasswordValidateException extends Exception {

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage(); // Перегружаем сообщение
    }
}
