package lesson_27.shapes;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class ShapeApp {
    public static void main(String[] args) {

        Rechtangle rechtangle = new Rechtangle("Rect1", "синий", 4.0,3.0);
        rechtangle.setDimensions(5,6);
        rechtangle.setColor("Red");
        rechtangle.displayInfo();
        rechtangle.calculateArea();


        System.out.println("==================");

        Circle circle = new Circle("Circl1","yellow",5.0);
        circle.displayInfo();
        circle.setRadius(10);
        circle.calculateArea();



    }
}
