package homeworks.hw_27.components;

import homeworks.hw_27.computer.Comp;

/*** Author: Roman Romashko Date: 06.03.2025 ***/

public class ComputerApp {
    public static void main(String[] args) {

        Storage storage=new Storage("WD", "WD-1000");
        Computer computer = new Computer("LE-571",storage);

        System.out.println(computer.toString());
        Computer computer1 =new Computer("R01",storage,20000);

        System.out.println(computer1.toString());
    }
}
