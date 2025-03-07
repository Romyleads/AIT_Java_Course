package homeworks.hw_28.Task3;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Square extends Figure{

    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
