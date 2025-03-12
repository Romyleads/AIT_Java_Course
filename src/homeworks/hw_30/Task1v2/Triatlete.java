package homeworks.hw_30.Task1v2;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

public class Triatlete implements Runner,Swimmer{
    private String name;

    public Triatlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Триатлет бежит");
    }

    @Override
    public void swim() {
        System.out.println("Триатлет плывет");
    }
}
