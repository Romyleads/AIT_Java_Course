
package homeworks.hw_41.LibraryApp3.tests;

import homeworks.hw_41.LibraryApp3.utils.EmailValidateException;
import homeworks.hw_41.LibraryApp3.utils.PasswordValidateException;
import homeworks.hw_41.LibraryApp3.utils.UserValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidationTest {

    @Test
    void testValidEmail() {
        assertDoesNotThrow(() -> UserValidator.validateEmail("valid@example.com"));
    }

    @Test
    void testInvalidEmail_missingAt() {
        Exception exception = assertThrows(EmailValidateException.class, () -> {
            UserValidator.validateEmail("invalidemail.com");
        });
        assertTrue(exception.getMessage().contains("@ error"));
    }

    @Test
    void testValidPassword() {
        assertDoesNotThrow(() -> UserValidator.validatePassword("StrongPass1!"));
    }

    @Test
    void testInvalidPassword_short() {
        Exception exception = assertThrows(PasswordValidateException.class, () -> {
            UserValidator.validatePassword("Short1!");
        });
        assertTrue(exception.getMessage().contains("min 8 characters"));
    }

    @Test
    void testInvalidPassword_noUpper() {
        Exception exception = assertThrows(PasswordValidateException.class, () -> {
            UserValidator.validatePassword("lowercase1!");
        });
        assertTrue(exception.getMessage().contains("uppercase"));
    }

    @Test
    void testInvalidPassword_noDigit() {
        Exception exception = assertThrows(PasswordValidateException.class, () -> {
            UserValidator.validatePassword("NoDigits!");
        });
        assertTrue(exception.getMessage().contains("digit"));
    }
}
