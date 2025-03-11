package homeworks.hw_29.Task1v2;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class CircleSingleTone extends Shape{

    private static CircleSingleTone instance;
    private double radius;

    public CircleSingleTone(double radius) {
        this.radius = radius;
    }

    public static CircleSingleTone getCircle(double radius){
        if (radius < 0 ) return null;
        return new CircleSingleTone(radius);


    }

    /*
    Еще свой вариант
    public static CircleSingleTone getInstance(double radius) {
        if (instance == null || instance.radius != radius) {
            if (radius < 0) return null; // Защита от отрицательного радиуса
            instance = new CircleSingleTone(radius);
        }
        return instance;
    }
    */

    //public CircleSingleTone(double radius) {
      //  if (radius<0) {this.radius =(-1.0*radius);} else this.radius = radius;
    //}



    // Классивческий синг тон
    /*
    public static CircleSingleTone getInstance(double radius){

        // В статическом контенте можно вызвать конструктор
        if (instance == null) {
            // Это позволяет хранить объект в единственном экземляре
            instance = new CircleSingleTone(radius);}
        return instance;

    }
*/
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
        }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
