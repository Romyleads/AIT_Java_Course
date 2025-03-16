package lesson_34.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/*** Author: Roman Romashko Date: 16.03.2025 ***/

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "1234567Ww!";

    @BeforeEach
    void setUP() {
        person = new Person(startEmail, startPassword);

    }


    /*
    1. Беру валидный правильный емейл.
    2. Устанавливаем его сеттером person-u
    3. Мы ожидаем, что у person будет установлен этот валидный емейл

     */

    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test111@test.com.de"})
    void testValidEmailSet(String validEmail) {

        person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());

    }

      /*
    1. Беру НЕ валидный правильный емейл.
    2. Устанавливаем его сеттером person-u
    3. Мы ожидаем, что у person НЕ будет установлен этот НЕ валидный емейл
    3.1 Это значит, что поле емейл у person не будет равно НЕ валидный емейл.
    3.2. Значение поля емейл должно остаться прежним

     */

    @ParameterizedTest
    @ValueSource(strings = {

            "test@@email.com",   // Две собаки (@)
            "testemail.com",     // Нет собаки (@)
            "test@emailcom",     // Нет точки после собаки
            "test@email.c",      // Менее двух символов после последней точки
            "test@em#ail.com",   // Недопустимый символ (#)
            "@email.com",        // Нет символов перед собакой
            "1test@email.com"    // Первый символ не буква

    })
    void testNotValidEmailSet(String notValidEmail) {

        person.setEmail(notValidEmail);
        Assertions.assertEquals(notValidEmail, person.getEmail());

    }


        /*
    1. Беру валидный пароль.
    2. Устанавливаю его сеттером у person
    3. Ожидаю, что у person будет установлен этот валидный пароль

     */

    @ParameterizedTest
    @ValueSource(strings = {"wwwWWW112@", "0987654qW%"})
    void testValidPasswordSet(String validPas) {

        person.setPassword(validPas);
        Assertions.assertEquals(validPas, person.getPassword());

    }

      /*
    1. Беру НЕ валидный пароль.
    2. Устанавливаю его сеттером person-u
    3. Ожидаю, что у person НЕ будет установлен этот НЕ валидный пароль
    3.1 Это значит, что поле пароль у person не будет равно НЕ валидному паролю.
    3.2. Значение поля пароль должно остаться прежним

     */

    @ParameterizedTest
    @ValueSource(strings = {"12345", "qwerty123"})
    void testNotValidPasswordSet(String validPas) {

        person.setPassword(validPas);
        Assertions.assertEquals(validPas, person.getPassword());

    }


}
