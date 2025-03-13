package homeworks.hw_32.Task1;

/*** Author: Roman Romashko Date: 13.03.2025 ***/


public class MainApp {
    public static void main(String[] args) {

        // Создаем стринговый объект дженерик класса и передаем ему две строки
        Pair<String> pair = new Pair<>("1","2");

        // Выводим значения элементов
        pair.setFirst("New First");
        pair.setSecond("New Second");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        // Меняем местами
        pair.swap();

        // Проверяем
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
