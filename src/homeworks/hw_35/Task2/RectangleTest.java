package homeworks.hw_35.Task2;

/*** Author: Roman Romashko Date: 18.03.2025 ***/

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2)); // Должно быть true, по умолчанию false
        System.out.println(rect1.equals(rect3)); // Должно быть false, по умолчанию false



    }
}
