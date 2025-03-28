package homeworks.hw_43.Task1;

import java.util.ArrayList;
import java.util.List;

/*** Author: Roman Romashko Date: 28.03.2025 ***/

/*
    Task 1
    Напишите метод, который принимает на вход две реализации интерфейса List.
    Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

public class IntersectionApp {

    public static void main(String[] args) {

            // Создаем первый список, пусть будет дабл
            List<Double> list1 = List.of(1.0, 2.2, 3.2, 4.0, 5.1);

            // Создаем второй список
            List<Double> list2 = List.of(3.2, 4.0, 5.1, 6.0, 7.0);

            // Получаем список общих элементов
            List<Double> common = intersection(list1, list2);

            // Выводим результат
            System.out.println("Общие элементы: " + common);
        }



    // напишем метод, находящий общие элементы двух списков
    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();

        // Перебираем все элементы первого списка и проверяем,
        // содержатся ли они во втором. Если да — добавляем в результат.
        for (T element : list1) {
            if (list2.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

}
