package homeworks.hw_25;

/*** Author: Roman Romashko Date: 04.03.2025 ***/

/*
    Task 2
    Неизменяемая переменная
    •	Объявите переменную final int MAX_USERS = 100;.
    •	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
    •	Объясните, что произошло при попытке изменения значения.
 */

public class Task2 {
    public static void main(String[] args) {

        final int MAX_USERS = 100;

        // Попытка изменить значение константы MAX_USERS приведёт к ошибке компиляции - невозможности присвоения нового значения
        // MAX_USERS = 10;

        System.out.println("final int MAX_USERS: " + MAX_USERS);

    }
}
