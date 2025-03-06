package lesson_27.shapes;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Application {
    public static void main(String[] args) {

        BusDriver busDriver= new BusDriver("John", "33ewqeqwe");

        Autobus bus = new Autobus(busDriver, 16);

        System.out.println(bus.toString());

        BusDriver busDriver1=new BusDriver("Margo", "23432432432432");

        bus.setDriver(busDriver1);

        System.out.println(bus.toString());

        bus.showListPassengers();
    }
}
