package lesson_26;

import java.awt.*;
import java.util.Arrays;

/*** Author: Roman Romashko Date: 04.03.2025 ***/

public class StringBuilderExample {
    public static void main(String[] args) {

        String str ="Java" + " " + "is" +" "+ " the best";

        // StringBuilder - это класс, который используется для создания и манипулирования изменяемыми строками.

        // Перегруженный конструктор
        StringBuilder sb=new StringBuilder(); // Пустой конструктор
        sb = new StringBuilder("Hello");


        sb.append(" "); // "Hello" + " "; Приклеивание справа, полный аналог конкатенации

        // Получить строковое представление
        String string = sb.toString();
        //System.out.println(sb); - ну а девушки потом

        // Вставить символы в указанную позицию
        sb = new StringBuilder("Hello World"); // Hello beautiful World

        sb.insert(6, "beatiful ");
        System.out.println(sb.toString());

        // String start = "Hello World!";
        // String result = start.substring(0,7);
        // result+="beautiful ";
        // result+=start.substring(6);
        // System.out.println(result);


        System.out.println(sb);
        // Заменить подстроку:
        sb = new StringBuilder("Hello World!!!");
        sb.replace(6,11, "Java");
        System.out.println(sb.toString());

        // Удалить подстроку в диапазоне от start (вкл) до end (не вкл)

        sb = new StringBuilder("Hello World!!!");
        sb.delete(5,11);
        System.out.println(sb.toString());

        // Поиск подстроки
        sb = new StringBuilder("Hello World!!!");
        int index = sb.indexOf("W");
        System.out.println(index);


        index=sb.lastIndexOf("Java");
        System.out.println(index);

        // Реверс - разворачивает последовательность символов
        sb = new StringBuilder("Hello World!!!");
        sb.reverse();
        System.out.println(sb.toString());

        System.out.println("==========================");


        // Получить символ по индексу
        sb = new StringBuilder("Hello World!!!");
        int ch = sb.indexOf("3");
        System.out.println(index);

        // Кол-во символов в sb (длина)
        System.out.println("length: "+ sb.length());

        // Я могу установить новую длину (обрезать или расширить sb)
        sb = new StringBuilder("Hello");
        sb.setCharAt(2,'!');

        // Если увеличить строку, она будет заполнена char с кодом 0

        sb.setLength(10);
        sb.setLength(3);

        System.out.println("sb.setLength(3): " + sb.toString());

        System.out.println("sb.length(): " + sb.length());

        /*

        Написать метод, который запрашивает у пользователя строку, состоящую из несколько слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)
        научно исследовательский институт нии

        */

        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" ");
        System.out.println(Arrays.toString(words));
















    }
}
