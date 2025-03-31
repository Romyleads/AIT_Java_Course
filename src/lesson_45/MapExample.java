package lesson_45;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

/*** Author: Roman Romashko Date: 31.03.2025 ***/

public class MapExample {
    public static void main(String[] args) {


        // Map<K, V>

        // Иногда разные ключи могу привести к одному номеру ячейки (одинаковый хеш код для разных значений)

        Map<Integer, String > pldTable = new Hashtable<>(); // Устаревшая, медленная. Не рекомендуется к использованию

        Map<String, String> phoneBook = new HashMap<>();

        // Добавить пару ключ-значение
        // V put(K key, V value) -> возвращает старое значение, соответствующее ранее этому ключу
        // Если такого ключа нет - вернет null

        System.out.println(phoneBook.put("Hanna", "+49-11111111"));

        phoneBook.put("Max", "+49-33333");
        phoneBook.put("John", "+49-22222");



        System.out.print("phonebook: "+phoneBook);

        String oldValue = phoneBook.put("John", "+49-33333");

        System.out.println("oldValue: " + oldValue);

        System.out.println("phoneBook: "+ phoneBook);

        // putAll - принимает карту (Map) и копирует все пары ключ-значение из этой карты
        Map<String, String > book2 = new HashMap<>();
        book2.put("Sebastian", "+49-4324234");
        book2.put("Michael", "+49-44444");

        phoneBook.putAll(book2);
        System.out.println("phonebook: "+phoneBook);

        // boolean containsKey(Object key) - вернет true, если карта содержит такой ключ
        // boolean containsValue(Object value) - вернет true, если карта содержит хотябы одно такое значение
        System.out.println("phoneBook.containsKey(\"Michael\"): " + phoneBook.containsKey("Michael"));

        System.out.println("phoneBook.containsKey(\"123\"): " + phoneBook.containsKey("123"));

        System.out.println("+49-44444:" + phoneBook.containsValue("+49-44444"));


        System.out.println("==============GET================");

        // Взятие значения по ключу
        // V get (K key) - возвращает значение по ключу. Если ключа нет - вернет null


        String value = phoneBook.get("Hanna");

        System.out.println("Hanna: "+ value);

        System.out.println("phoneBook.get(\"KEY\"): " + phoneBook.get("KEY")); // null

        // getOrDefault(Object key, V defaultValue)

        // Возвращает значение по ключу. Если ключа нет - вернет значение по умолчанию (второй параметр метода)

        String val2 = phoneBook.getOrDefault("Hanna", "DEFAULT");

        System.out.println("phoneBook.getOrDefault(\"Hanna\"): " + val2);

        val2 = phoneBook.getOrDefault("KEY", "DEFAULT");

        System.out.println("phoneBook.getOrDefault(\"KEY\"): " + val2);

        System.out.println("Objects.hashCode(null): " + Objects.hashCode(null));

        // Конструкторы
        //Map<Integer,Integer> construct = new HashMap<>();

        // Конструкторы

        // 16 корзин. Коэффициент заполнения 0,75

        Map<Integer, String> construct = new HashMap<>();

        // Создается пустой список пар ключ-значение


        construct = new HashMap<>(30); // Создается пустой словарь. 32 корзины. Коэффициент заполнения 0.75

        construct = new HashMap<>(32, 0.90f); // Создается пустой словарь. 32 корзины. Коэффициент

        Map<Integer, String> otherMap = new HashMap<>();

        otherMap.put(1, "a");

        construct = new HashMap<>(otherMap); // скопирует все пары клю-значения

        System.out.println("construct: " + construct);

        // V remove(Object key) удаляет пару ключ-значение. Возвращает старое значение или п

        System.out.println("phoneBook: " + phoneBook);

        System.out.println(phoneBook.remove("Sebastian")); // Ключ есть. Удалит пару. Вернет старое значение.

        System.out.println("phoneBook: " + phoneBook);

        System.out.println(phoneBook.remove("Sebastian")); // Ключа нет - вернет пull

        // boolean remove (Object key, Object value) - удаляет пару
        System.out.println("phoneBook.remove(\"John\", \"0000\": " + phoneBook.remove("John", "0000"));

        System.out.println("phoneBook.remove(\"John\", +49-444441:" + phoneBook.remove("John", "+49-44444"));

        System.out.println("phoneBook: " + phoneBook);

        // void clear() очищает карту

        // int size() возвращает кол-во элементов (пар ключ-значение)

        System.out.println("phoneBook.size(): " + phoneBook.size());






    }
}
