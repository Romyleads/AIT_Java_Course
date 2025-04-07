
package homeworks.hw_41.LibraryApp3.utils;

public class EmailValidateException extends Exception {

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage(); // Перегружаем сообщение
    }
}
