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


        // addAll(Collection<? extends T> col) - добавить все элементы из указанной коллекции
        strings.addAll(List.of("JS", "Ruby", "Kotlin"));
        System.out.println(strings);


    }
}
