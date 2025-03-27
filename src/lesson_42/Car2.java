package lesson_42;

/*** Author: Roman Romashko Date: 26.03.2025 ***/

public class Car2 {

    private int maxSpeed;

    public Car2(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Car2{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
