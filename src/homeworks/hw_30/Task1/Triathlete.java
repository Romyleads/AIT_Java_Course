package homeworks.hw_30.Task1;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public class Triathlete implements Swimmer, Runner{

    @Override
    public void run() {
        System.out.println("Триатлет бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Триатлет плывет!");
    }
}
