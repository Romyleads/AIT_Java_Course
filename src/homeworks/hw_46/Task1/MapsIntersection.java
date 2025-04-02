package homeworks.hw_46.Task1;

/*** Author: Roman Romashko Date: 02.04.2025 ***/

import java.util.HashMap;
import java.util.Map;

/*
    Task 1
    Пересечение двух карт:
    Реализуйте метод, который принимает две карты
    Map<String, Integer> и возвращает новую карту, содержащую только те записи,
    ключи которых присутствуют в обеих исходных картах.

    Для совпадающих ключей значение можно брать из любой карты

    Map<String, Integer> map1 = new HashMap<>();
            map1.put("apple", 50);
            map1.put("banana", 20);
            map1.put("cherry", 30);

    Map<String, Integer> map2 = new HashMap<>();
            map2.put("banana", 25);
            map2.put("cherry", 30);
            map2.put("date", 40);

    Map<String, Integer> intersectionMap = intersection(map1, map2);
            intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
    //Output
    banana: 20
    cherry: 30
*/

public class MapsIntersection {
    public static void main(String[] args) {

        // Создаем мапы по примеру в задании
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);   // "apple" — ключ, 50 — значение
        map1.put("banana", 20);
        map1.put("cherry", 30);

        // Отправим для наглядности в консоль
        // System.out.println("map1.toString(): "+map1.toString());


        // Вторая карта: тоже содержит фрукты, но могут быть другие значения
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        // Отправим для наглядности в консоль
        // System.out.println("map2.toString(): "+map2.toString());

        // Создаем свою мапу по пересечении ключей исходных двух
        Map<String, Integer> intersectionMap = intersection(map1, map2);

        // Отправим для наглядности в консоль
        // System.out.println("intersectionMap.toString(): "+intersectionMap.toString());


        // Выводим результат: ключи и значения из пересечения
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }


    // Метод, возвращающий мапу, содержащую значения с теми ключами, которые есть в обоих мапах
    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {

        // Создаём новую пустую карту для результата
        Map<String, Integer> map = new HashMap<>();

        // Перебираем ключи
        for (String key : map1.keySet()) {

            // Если ключ есть и во второй мапе — добавляем в результирующую мапу
            if (map2.containsKey(key)) {
                map.put(key, map1.get(key)); // берем значение по первой мапе
            }
        }


        return map;
    }


}
