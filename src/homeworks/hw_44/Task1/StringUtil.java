package homeworks.hw_44.Task1;


import java.util.*;

/*** Author: Roman Romashko Date: 31.03.2025 ***/

    /*
    Task 1
    Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.
    Если строки имеют одинаковую длину - сортировать в естественном порядке

    public static void main(String[] args) {
    String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
    System.out.println(StringUtil.getUniqueSortedWords(testString));
            }

    // Output:
    [для, слов, строка, которые, Тестовая, удаления, повторяются]

    */

public class StringUtil {
    public static void main(String[] args) {

        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));

    }

    /**
     * Метод принимает строку, очищает от знаков препинания, разбивает на слова,
     * убирает повторы и сортирует по длине, а затем по алфавиту.
     */
    public static List<String> getUniqueSortedWords(String input) {
        // Удаление всех символов, кроме букв, цифр и пробелов
        String clean = input.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");

        // Делим строку на слова
        String[] words = clean.split("\\s+");

        // Преобразуем массив слов в список
        List<String> wordList = Arrays.asList(words);

        // Получаем уникальные слова с сохранением порядка
        List<String> result = getUniqueList(wordList);

        // Сортируем по длине слова, затем по алфавиту
        result.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        return result;
    }

    // Метод для получения уникальных элементов с сохранением порядка

    private static <T> List<T> getUniqueList(List<T> list) {

        return new ArrayList<>(new LinkedHashSet<>(list));
    }

}



