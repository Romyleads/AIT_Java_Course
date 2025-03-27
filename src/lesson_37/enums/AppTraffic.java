package lesson_37.enums;

import java.awt.*;

/*** Author: Roman Romashko Date: 19.03.2025 ***/

public class AppTraffic {

    public static void main(String[] args) {
        // Возвращает константу Enum по указанному имени (строке)
        Colors red = Colors.valueOf("RED");

// Enum безопасно сравнивать оператором == (не обязательно использовать equals())
        System.out.println("color == Colors.RED: " + (red == Colors.RED));

// У каждой константы есть порядковый номер (начиная с 0)
        System.out.println("color.ordinal(): " + red.ordinal());

        TrafficLight trafficLight = new TrafficLight("SN-001", "Berlin", Colors.YELLOW);

        System.out.println(trafficLight);
    }

}