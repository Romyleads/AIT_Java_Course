package lesson_34;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*** Author: Roman Romashko Date: 16.03.2025 ***/

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(40)
    void firstTest(){
        System.out.println("First Test");

    }

    @Test
    @Order(20)
    void secondTest(){
        System.out.println("Second Test");

    }

    @Test
    @Order(30)
    void thirdTest(){
        System.out.println("Third Test");

    }

    @Test
    @Order(10)
    void randomTest(){
        System.out.println("Random Test");

    }


}
