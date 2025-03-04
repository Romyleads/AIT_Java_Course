package lesson_26;

/*** Author: Roman Romashko Date: 04.03.2025 ***/

// Traint - is-a BUS - не верно


public class Train extends Vehicle {
    //private int capacity

    private final int wagonCapacity;
    private int capacity;
    private int countPassengers;
    private int countWagons;


    public Train(String model, int year, int countWagons, int wagonCapacity) {
        super(model, year);
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        // Определить вместимость - рассчитать capacity;
        calculateCapacity();

    }

    private void calculateCapacity() {

        this.capacity = countWagons * wagonCapacity;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();

        // TODO
        // Проконтроллировать, что кол-во пассажирова не больше чем вместимость
    }
}
