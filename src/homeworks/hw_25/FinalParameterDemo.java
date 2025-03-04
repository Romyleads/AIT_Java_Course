package homeworks.hw_25;

/*** Author: Roman Romashko Date: 04.03.2025 ***/

/*
    Task4 * (Опционально)
    Final параметр метода
    •	Напишите метод printMessage(final String message), который выводит сообщение на экран.
    •	Попробуйте изменить значение параметра message внутри метода.
    •	Объясните результат и поведение компилятора.
 */
public class FinalParameterDemo {

    // Создаем метод с final параметром
    public static void printMessage(final String message) {

        System.out.println(message);

        // Попытка изменить значение параметра message приведёт к ошибке компиляции:
        // java: final parameter message may not be assigned
        // message = "Новое сообщение";
    }

    public static void main(String[] args) {
        printMessage("Hello world!");
        //printMessage("Hello world2!");
        //message = "Новое сообщение";
    }

    // Объяснение:
    // Параметр метода, объявленный как final, нельзя изменить внутри метода.

    // Это значит, что после передачи значения переменная message становится неизменной.

    // Если попытаться присвоить новое значение, компилятор выдаст ошибку final parameter message may not be assigned.
    // Такая конструкция защитит от случайного изменения входных параметров и обеспечивает,
    // что исходное значение остаётся неизменным во время выполнения метода.

}
