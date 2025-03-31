package homeworks.hw_44.Task3;

import java.util.LinkedHashMap;
import java.util.Map;

/*** Author: Roman Romashko Date: 31.03.2025 ***/

public class CharacterFind {


/* Task 3
    Опционально
    Написать метод, возвращающий первый неповторяющийся символ в строке
    public static void main(String[] args) {
    String string = "abcdefj ab,cdf,";
    System.out.println(StrUtil.getFirstUniqueChar(string));
    }
    //Output: e
 */

        public static void main(String[] args) {

            String input = "abcdwefj ab,cdf,";
            System.out.println("Первый уникальный символ: " + getFirstUniqueChar(input));
        }

        /**
         * План действий:
         * 1. Проходим по всем символам строки
         * 2. Считаем, сколько раз встречается каждый символ [только буквы и цифры]
         * 3. Проходим по символам в порядке добавления и находим первый, у которого счётчик равен 1
         */

        private static Character getFirstUniqueChar(String input) {

            // LinkedHashMap - сохраняем порядок символов в строке
            // Ключ Character — символ, значение Integer — сколько раз он встречался
            Map<Character, Integer> frequency = new LinkedHashMap<>();

            // Подсчитываем количество повторения каждого символа
            for (char ch : input.toCharArray()) { // перебираем все символы строки
                if (Character.isLetterOrDigit(ch)) { // проверка: символ — это буква или цифра
                    if (frequency.containsKey(ch)) { // если символ уже есть в мапе
                        int count = frequency.get(ch); // получаем текущее количество
                        frequency.put(ch, count + 1); // увеличиваем значение на 1
                    } else {
                        frequency.put(ch, 1); // если встретили символ впервые — ставим 1
                    }
                }
            }

            // Проходим по мапе и ищем первый символ, у которого счётчик = 1
            for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
                Character symbol = entry.getKey(); // получаем символ
                Integer count = entry.getValue();  // получаем количество

                if (count == 1) return symbol; // если это первый уникальный — возвращаем
            }

            return null;
        }

    }

