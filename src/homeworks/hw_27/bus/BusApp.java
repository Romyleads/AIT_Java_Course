package homeworks.hw_27.bus;

/*** Author: Roman Romashko Date: 06.03.2025 ***/

public class BusApp {
    public static void main(String[] args) {

        BusDriver driver=new BusDriver("Peter", "LN-000000001");

        Autobus autobus = new Autobus(driver, 4);
        System.out.println(autobus.toString());


        Passenger pas1=new Passenger("John1");
        Passenger pas2=new Passenger("John2");
        Passenger pas3=new Passenger("John3");
        Passenger pas4=new Passenger("John4");
        Passenger pas5=new Passenger("John5");

        autobus.takePassenger(pas1);
        autobus.takePassenger(pas2);
        autobus.takePassenger(pas3);
        autobus.takePassenger(pas4);
        autobus.takePassenger(pas5);

        autobus.showListPassengers();

        System.out.println("\n =============");

        System.out.println("dropPassenger(pas4):" + autobus.dropPassenger(pas4));

        autobus.showListPassengers();



    }
}
