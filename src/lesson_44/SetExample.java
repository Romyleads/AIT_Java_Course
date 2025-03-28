package lesson_44;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/*** Author: Roman Romashko Date: 28.03.2025 ***/

public class SetExample {
    public static void main(String[] args) {

        String str = "abc";
        System.out.println(str.hashCode());

        String str2 = "abc";
        System.out.println(str.equals(str2));

        System.out.println(str2.hashCode());


        /*
        Для корректной работы хеш-коллекций есть важное правило - контракт между hashCode() и equals()

        1. Если два объекта равны по методу equals(), то и их  hashCode() тоже должны быть равны
        2. Если хеш коды различны, то объекты точно не должны быть равны по equals
        (обратное не всегда верно. Коллизия - разные объекты могут иметь одинаковые hash-коды)
        3. Вызов метода hashCode должен возвращать одинаковое значение при многократных вызовах на неизмененном объекте

         */


        // Конструкторы
        Set<Integer> set = new HashSet<>(); // Создает пустой hashSet. Емкость 16 и коэффициент заполнения 0.75
        set = new HashSet<>(20); // Создает пустой hashSet с указанной емкостью
        // Принимает коллекцию - создает новый сет (множество), содержащий уникальные элементы из указанной коллекции.
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, -4, 5, 6, 3, 6, -100));

        System.out.println(set);

        List<Integer> startValues = List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 17, 8, 16, 32);

        // HashSet - не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("hashSet: " + integers);

        // Реализация LinkedHashSet - сохраняет порядок добавления элеиментов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        // Методы интерфейса Set

        // boolean add(E e) - добавление элемента
        System.out.println("integers.add(100):" + integers.add(100)); //true - элемент был добавлен
        System.out.println(integers);

        System.out.println("integers.add(100):" + integers.add(100)); //false - элемент не был добавлен, так как такое значение уже есть в Set
        System.out.println(integers);


        System.out.println("=============================");

        // boolean remove(Object o) - удаляет элемент по значению
        System.out.println("integers.remove(100): " + integers.remove(100));
        System.out.println(integers);

        // boolean contains(Object o) - проверяет присутствие элементов в множестве
        System.out.println(integers);

        System.out.println("integers.contains (100): " + integers.contains(100)); // false
        System.out.println("integers.contains(32): " + integers.contains(32)); // true

        /*

        int size() - кол-во элементов в сет-е
        boolean isEmpty - возвращает true, если сет не содержит элементы
        clear() - удаляет все элементы

         */

        // iterator () - возвращает итератор для элементов сет-а
        // Наличие итератора позволяет последовательно перебирать все элементы циклом for-each

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }

        System.out.println();

        for (Integer val : integers) {
            System.out.print(val + ", ");
        }

        System.out.println();

        // Убрать дубликаты

        // Написать метод, который принимает список и возвращает список, состоящий только из уникальных элементов списка


        System.out.println("=============================");


        System.out.println("startValues = " + startValues);
        List<Integer> result = getUniqueList(startValues);


        System.out.println("getUniqueList: " + result);
        result.add(15);
        result.add(15);
        System.out.println(result);

        System.out.println("=============================");  System.out.println("=============================");  System.out.println("=============================");  System.out.println("=============================");  System.out.println("=============================");
        // SortedSet - расширяет интерфейс Set
        // Элементы упорядочены в соответствии с их естественным порядком (если элементы реализуют Comparable) или компаратором, переданным при создании
        // Реализован в виде бинарного дерева

        // SortedSet Конструкторы
        // Пустой - Естественный порядок сортировки

        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое, упорядоченное

        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);

        System.out.println("sortedSet: " + sortedSet);

        // Принимает коллекцию. Создает set из элементов коллекции. Сортировка в естественном порядке

        sortedSet = new TreeSet<>(startValues);

        System.out.println("sortedSet: " + sortedSet);

        // Конструктор с компаратором, определяющим порядок хранения элементов

        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // будет поддерживаться обратный естественный порядок сортировки

        treeSet.addAll(startValues);

        treeSet.add(10);

        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>((Integer i1, Integer i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);

        // first() - возвращает самый первый (самый левый) (наименьший по мнению Компаратора) элемент

        System.out.println("treeSet.first(): " + treeSet.first());

        // last() - возвращает последний (правый / максимальный)

        System.out.println("treeSet.last(): " + treeSet.last());

        // SortedSet<E> headSet (E element) - возвращает часть множества, элементы которого строго меньше чем element

        SortedSet<Integer> headSet = treeSet.headSet(6);

        System.out.println("treeSet.headSet (6): " + headSet);

        // SortedSet<E> tailSet(E element) элементы больше или равны element

        SortedSet<Integer> tailSet = treeSet.tailSet(6);
        System.out.println("treeSet.tailSet (6): " + tailSet);

        // SortedSet<E> subSet(E fromElement, E toElement) часть множества, от from (включительно) до toElement (не включительно)

        SortedSet<Integer> subSet = treeSet.subSet(16, 6);
        System.out.println("treeSet.subSet(6, 16): " + subSet);

        // comparator() возвращает компаратор, используемый для упорядочивания элементов в этом множестве
        // если используется естественный порядок - вернется null

        homework("Тестовая строка, что есть в            домашке!!!");



















    }

    private static void homework(String testStr){
        // заменить все не буквы на пустоту
        // Заменить символ, который не цифра, не буква, не пробел на пустоту
        String newString = testStr.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");

        System.out.print("newString: "+newString);

        String str = String.join("" , "Hello", "Java", "Test");
        System.out.println("str:" + str);

        // Преобразование строки в массив слов String[] words = str.split(regex: "");

        // Преобразование строки в массив слов
        // s - "пробельный символ"
        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));

        // Arrays.asList(T[] array) - преобразует массив в список (List)

        List<String > list = Arrays.asList(words);
        System.out.println("list:"+list);



    }

        private static <T> List<T> getUniqueList(List<T> list) {

        // Получить коллекцию, состоящую из уникальных элементов (убрать дубликаты)
        // Р.S. Позаботиться о сохранении порядка элементов изначального спискаSet<T> set = new LinkedHashSet<>(list);

        Set<T> set = new LinkedHashSet<>(list);

        // Преобразовать кол-цию уникальных элементов в список
        return new ArrayList<>(new LinkedHashSet<>(list));


        }




}
