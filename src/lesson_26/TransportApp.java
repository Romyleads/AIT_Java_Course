package lesson_26;

/*** Author: Roman Romashko Date: 04.03.2025 ***/

public class TransportApp {
    public static void main(String[] args) {

        Bus bus =new Bus("Bus-X1", 2020,10);
        String str = bus.toString();
        System.out.println(str);

        bus.start();
        bus.stop();


        System.out.println("bus.getModel(): "+ bus.getModel());
        System.out.println("capacity: "+ bus.getCapacity());



        System.out.println("========================================");

        Bus bus2 =new Bus("Bus-X2", 2020,10);
        System.out.println(bus2.takePassenger());





        System.out.println("========================================");


        Train train = new Train("Skoda", 2022, 7, 25);
        System.out.println(train.toString());

        train.start();
        train.stop();

        System.out.println("========================================");

        System.out.println("capacity: "+ train.getCapacity());

        train.setCountWagons(10);
        train.setCountWagons(11);

        System.out.println("capacity: "+ train.getCapacity());




    }
}
