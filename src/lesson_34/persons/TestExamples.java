package lesson_34.persons;

import homeworks.hw_27.bus.Autobus;
import homeworks.hw_27.bus.BusDriver;
import lesson_24.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/*** Author: Roman Romashko Date: 14.03.2025 ***/

class TestExamples {

    // Метод, который выполнится перед каждым тестом
    @BeforeEach
    void setUp(){
        System.out.println("@Method BeForEach");

        }
    /*

    @BeforeAll - метод выполняется один раз перед КАЖДЫМ выполнением тестового метода
    @AfterEach - выполняется после КАЖДОГО тестового метода
    @AfterAll - метод выполняется после выполнения всех тестовых методов
    @disabled - указывается, что тест отключен и не будет выполняться

     */


    //@Test указывает, что метод является тестовым
    // Т.о. JUnit знает, что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition(){
        // Протестировать, правильно ли работает метод add класса Calculator
        int result = Calculator.add(2,3);

        // Реальное / фактическое значение в переменной result
        // 5 - ожидаемое значение

        // Методы проверки утверждений
        // assertEquals (expected, result)
        assertEquals(5, result); // метод проверяет равны ли два значения. Тест будет пройден если два значения равны
        Assertions.assertNotEquals(0, result); // Тест пройден если результат не совпадет
        Assertions.assertTrue( result >= 4); // проверяет, что условие верно
        Assertions.assertFalse( result < 4); // проверяет, что условие ложно
        Assertions.assertNull(null); // Проверяет, что объект null
        Assertions.assertNotNull("String"); // Проверяет, что объект не null


    }

    // @Disabled - возможность отключить выполнения тестового метода
    @Test
    public void emptyTest(){
        // Если в методе нет ложного утверждения - он считается пройденным
        System.out.println("Test Empty");

    }

    // Параметризованные тесты
    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi1"})
    public void testFruits(String fruit){
        System.out.println("current value: "+ fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testStatic(int value){
        System.out.println("value:" + value);
        Autobus bus = new Autobus(new BusDriver("Test","1111"),2222);
        System.out.println(bus);
    }

    // Источник данных в формате CSV
    // Источник данных файл в формате CSV

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruits(String fruit){
        System.out.println("Current value:" + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "kiwi");
    }


    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("Current value:" + value);
        assertNotEquals(100,value);
    }
    static Stream<Integer> testDataInt() {return Stream.of(1,2,-10,0,15);
    }


    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + isEquals + " | " + expected);
        int result = value * value;
        assertEquals(expected,result);
    }

    static Stream<Arguments> testDataArguments(){
        return Stream.of( Arguments.of(2,4,true),
         Arguments.of(3,9,true),
                Arguments.of(4,15,false)
        );


    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person person, String newEmail) {
        System.out.println("Current value:" + person);
        System.out.println("New email:" + newEmail);
    }

    static Stream<Arguments> testPersonData(){
        Person person = new Person("test@email.com", "passwordW1%");
        return Stream.of(
                Arguments.of(person,"new1234#mail.com"),
                Arguments.of(new Person("invalid.email.com", "password"), "pass")

        );

    }

/*
    static Stream<Object[]> testDataArguments() {
        return Stream.of(
                new Object[]{1, 1, true},
                new Object[]{2, 5, false},
                new Object[]{-10, -10, true},
                new Object[]{0, 100, false}

        );
    }
*/


}

