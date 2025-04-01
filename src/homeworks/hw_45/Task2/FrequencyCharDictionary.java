package homeworks.hw_45.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*** Author: Roman Romashko Date: 01.04.2025 ***/

/*
    Task2 (опционально).
    Напишите метод, возвращающий частотный словарь вхождения символов в строку.
 */

public class FrequencyCharDictionary {

    public static void main(String[] args) {

        String input = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        // Получаем мапу с символами и их частотностью
        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(input);

        System.out.println("\nВхождение символов: ");

        frequencyCharsMap = new TreeMap<>(frequencyCharsMap);
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();

    }

    public static Map<Character, Integer> frequencyCharsDictionary(String input) {

        // Создаем пустую мапу: ключ — символ, значение — количество
        Map<Character, Integer> map = new HashMap<>();

        // Преобразуем строку в массив символов
        for (char ch : input.toCharArray()) {

            // добавляем в мапу и увеличиваем счётчик
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }

}
