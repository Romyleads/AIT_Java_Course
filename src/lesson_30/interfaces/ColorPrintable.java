package lesson_30.interfaces;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

// Интерфейс может расширять другой интерфейс
public interface ColorPrintable extends Printable{

    // дочерний интерфейс наследует все методы род.интерфейса

    void colorPrint();


}
