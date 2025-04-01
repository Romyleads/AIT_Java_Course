package homeworks.hw_45.Task1;

/*** Author: Roman Romashko Date: 01.04.2025 ***/

import java.util.HashMap;
import java.util.Map;

    /*
    Task1.
    Частотный словарь слов: Напишите метод,
    который принимает строку текста и возвращает Map<String, Integer>,
    где каждому слову соответствует количество его вхождений в текст.
     */


public class FrequencyDictionary {
    public static void main(String[] args) {

        String input = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        System.out.println("String input: " + input);

        // Получаем мапу со словами и их количеством
        Map<String, Integer> frequencyMap = frequencyDictionary(input);

        // Визуализируем содержимое мапы в консоли через лямбду
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value)); // key - слово, value - его повторы

    }

    public static Map<String, Integer> frequencyDictionary(String input) {

        // Обработка исключений
        //Set<String> stopWords = Set.of("и", "в");

        // Удаление всех символов, кроме букв, цифр и пробелов
        String clean = input.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");

        // Переводим строку в нижний регистр
        clean = clean.toLowerCase();

        // Делим строку на слова
        String[] words = clean.split("\\s+");

        // Создаем пустую мапу с параметрами: ключ (слово) + значение (количество в тексте)
        Map<String, Integer> map = new HashMap<>();

        // Ну и начинаем подсчет
        for (String word : words) {
            //if (!stopWords.contains(word)) {

            // добавляем в мапу и параллельно увеличиваем счётчик для слова
            map.put(word, map.getOrDefault(word, 0) + 1);
            //}
        }

        // Возвращаем готовую мапу
        return map;
    }
}
