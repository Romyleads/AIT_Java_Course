package homeworks.hw_21;

/*** Author: Roman Romashko Date: 26.02.2025 ***/

public class MyRide {
    public static void main(String[] args) {


        Bike bike = new Bike("Merida", "синий", 25, false );
        Car car = new Car("Mercedes", "голубой", 60 );
        EScooter scooter = new EScooter("Bolt", "черный", 24 );

        bike.iride();
        car.iride();
        scooter.iride();

    }
}
