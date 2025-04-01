package lesson_46;

import java.util.*;

/*** Author: Roman Romashko Date: 31.03.2025 ***/

public class MapExample3 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "red");

        map.put(4, "green");

        map.put(15, "yellow");

        map.put(16, "blue");

        map.put(0, "white");

        map.put(100, "black");

        map.put(17, "orange");

        map.put(7, "red");

        System.out.println(map);


        // Collection<V> values() - возвращает коллекцию всех значений карты
        Collection<String > values = map.values();
        System.out.println("map.values():" + values);

        // Set<K> keySet() - возвращает set, состоящий из всех ключей карты
        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet():" + keys);

        // могу перебрать все ключи в цикли и получить все занчения:

        for(Integer key : keys){

            System.out.println(map.get(key) + "; ");

        }
        System.out.println();

        /*
        Фокус: живая связь
        Метод keySet и values возвращают представление / проекция (view) соответствующих ключей и значений карты.
        Эта проекция поддерживается самой картой, что означает, что они связаны напрямую с внутренними данными Map-ы
        Поэтому любые изменения, внесенные в эти представления, отражаются на исходной карте.
        Причем эта связь двусторонняя.

         */
        // Удаляю ключ из сета ключей
        keys.remove(17);
        System.out.println("keys: " + keys);
        System.out.println("map: " + map);

        System.out.println("values: " + values);
        System.out.println("========================");

        System.out.println("green");
        System.out.println("values: " + values);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);

        System.out.println("========================");


        map.remove(16);

        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        //System.out.println("========================");

        // удаляет по первому найднному ключу
        //values.remove("red");

        //System.out.println("map: " + map);
        //System.out.println("keys: " + keys);
       // System.out.println("values: " + values);


        System.out.println("========================");

        // удаляю все ключи

        values.removeAll(List.of("red"));

        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);


        System.out.println("========================");

        // Если мы хотим разорвать "связь" - нужно копировать элементы в другую коллекцию
        Set<Integer> keysCopy = new HashSet<>(map.keySet());

        keysCopy.remove(0);

        System.out.println("keyCopy: " + keysCopy);

        System.out.println("map:" + map);

        System.out.println("=========== Map.Entry =============");

        // Set<Map.Entry<K,V>> entrySet
        // Set<Map.Entry<Integer, String>> entrySet() - возвращает set вхождений всех пар-значений

        for(Map.Entry<Integer, String> entry:map.entrySet()){

            System.out.print("entry: " + entry + " -> ");

            System.out.print("entry.getKey(): "+ entry.getKey() + " | ");

            System.out.println("entry.getValue(): " + entry.getValue() + "\n");


        }

        // Тоже живая связь

        for (Map.Entry<Integer, String> entry: map.entrySet()) {

            if (entry.getKey().equals(100)) {

                entry.setValue("JAVA!");

            }
        }
            System.out.println("map:" + map);

        // foreach - простой способ перебора всех пар ключ - значение с возможностью применить к ним какую-то функцию


        System.out.println("=========== put vs replace =============\n");

        System.out.println(map.put(11,"orange")); // если такого ключа нет - добавляется новая пара key-value

        System.out.println(map.put(11,"green")); // если ключ - есть, value - будет переписано

        // replace(K key, V value) - Если такого ключа нет, новая пара не создается

        System.out.println(map.replace(200,"orange")); // если такого ключа нет - пара не добавляется

        System.out.println(map.replace(15,"green")); // если ключ - есть, value - будет переписано

        System.out.println("map:" + map);

        System.out.println("=========== foreach =============\n");

        for (Map.Entry<Integer,String> entry: map.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();

            // могу что-то сделать с єтими значениями

            System.out.println(key+": "+value);
        }


        System.out.println("=========== foreach =============\n");

        // foreach () - перебор всех пар ключ - значение с возможностью выполнить какую-то функцтю
        map.forEach((k,v)->System.out.println(k +"= "+v));

        System.out.println("=========== Многострочное действие =============\n");

        map.forEach((key, val)->{

            System.out.println("Iteration: ");
            System.out.println("key: "+ key+ " | Value: "+val);
            System.out.println("================\n");
        });




    }
}
