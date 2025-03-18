package homeworks.hw_35.Task3;

import homeworks.hw_35.Task3.lists.MyArrayList;
import homeworks.hw_35.Task3.lists.MyList;

import javax.swing.*;
import java.sql.ClientInfoStatus;

/*** Author: Roman Romashko Date: 18.03.2025 ***/

public class RectangleTest {
    public static void main(String[] args) {

        MyArrayList<Rectangle> rectangles = new MyArrayList<>();

        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        //rectangles.removeDuplicates(rectangleToRemove); // Правильный вызов1
        //removeDuplicates2(rectangles,rectangleToRemove); // Правильный вызов2
        removeDuplicates3(rectangles,rectangleToRemove); // Правильный вызов3

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }



    }

    public static void removeDuplicates2(MyList<Rectangle> list, Rectangle rectangle){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(rectangle)){
                list.remove(i);
                i--; // корректируем индекс после удаления

            }
        }

    }

    public static void removeDuplicates3(MyList<Rectangle> list, Rectangle rectangle){
        //while (list.contains(rectangle)) {
        //    list.remove(rectangle);
        //}
        while (list.remove(rectangle)){}
    }
}




