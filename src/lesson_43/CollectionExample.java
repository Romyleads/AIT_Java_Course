package lesson_43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*** Author: Roman Romashko Date: 27.03.2025 ***/

public class CollectionExample {
    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его
        // интерфейсов (List, Queue, Set)

        // Это позволяет нам единообразно обрабатывать различные типы коллекций
        // Создаем коллекцию строк
        // Ссылка типа интерфейс - набор доступных методов + ссылку на объект какого класса может хранить эта переменная
        // Справа мы можем подставлять объекты разных классов - получить разные реализации этого интерфейса

        Collection<String> strings = new HashSet<>(); // Создаем коллекцию строк
        strings = new ArrayList<>();

        // int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size():" +strings.size());

        // boolean isEmpty() - возвращает true, если коллекция пуста
        System.out.println("strings.isEmpty():" +strings.isEmpty());

        // boolean add(T t) - добавляет элемент в коллекции
        strings.add("Java");
        strings.add("JS");

        System.out.println("strings.add(Python):" + strings.add("Python"));

        // Переопределенный метод toString для красивого вывода элементов коллекции
        System.out.println(strings);


        // Статический метод .of() - метод в нескольких т классах JFC (Java Framework Collection)
        // Был введен в Java 9 (SDK 9 b выше)

        // Создает неизменяемую (нельзя удалить или добавить элементы) коллекцию из предоставленных элементов
        // Доступен для List, Set, Map


        Collection<Integer> integers = List.of(0,1,2,3,4,5,6);

        System.out.println("integers:" + integers);

        // integers.add(7); // попытка изменить (модифицировать) неизменяемую коллекцию = приведет к ошибке (исключительная аварийная ситуация)

        // strings.add("JS");
        // strings.add("Go Land");

        // Методы addAll, removeAll, retainAll - это программная реализация операций над множествами в математике


        // addAll(Collection<? extends T> col) - добавить все элементы из указанной коллекции
        strings.addAll(List.of("JS", "Ruby", "Kotlin"));
        System.out.println(strings);


        System.out.println("\n===================================================\n");





        // removeAll(Collection<?> сов) удаляет все элементы содержащиеся в коллекции соїв из коллекции на которой вызван мето
        // colA.removeAll(colb) Удаляет из А все элементы, которые содержит кол B (ВЫЧИТАНИЕ)
        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0,1,2,3,4,5,3,2));

        colA.removeAll(List.of(3,2,1));

        System.out.println("Удаляем: colA.removeAll(List.of(3,2,1)): "+ colA);

        // Пересечение
        // retainAll (Collection<?> colB) - Оставляет в коллекции вызова только те элементы, которые содержатся в коллекции B
        // Удаляет из коллекции элементы, которые не содержатся в коллекции B

        // colA.retainAll(colB) - оставляет в А только те элементы, которые есть в B

        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();

        colA.addAll(List.of(10,20,30,40,50,60));
        colB.addAll(List.of(20,30,40,100));


        System.out.println("colA:" + colA);
        System.out.println("colB:" + colB);


        //boolean containsAll (Collection<?> c): возвращает true, если коллекция содержит все элементы из указанной коллекции.

        System.out.println("colA.containsAll(List.of(20, 30):" + colA.containsAll(List.of (20, 30))); // true


        colA.retainAll(colB);

        System.out.println("retainAll(colB): "+ colA);


        // boolean remove(Object obj) - удаляет элемент из коллекции. Вернет true, если элемент был удален

        System.out.println(
                "colA.remove(100):"+colA.remove(100)
        );


       // System.out.println("Удаляем 20 из этой коллекции colA:" + colA);

        //System.out.println("colA.remove(20):"+colA.remove(20));

        System.out.println("colA:" + colA);


        System.out.println("Удаляем 20 из этой коллекции colA через removeAll:" + colA);
        // Если нужно удалить все вхождения
        colA.removeAll((List.of(20)));

        System.out.println("colA:" + colA);

        // clear() - удаляет все элементы из коллекции

        colA.clear();

        System.out.println("colA: " + colA);










    }
}
