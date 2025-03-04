package lesson_26;

/*** Author: Roman Romashko Date: 04.03.2025 ***/

// extends - наследование. Bus наследуется от Vehicle.
// Bus is-a Vehicle - верно. -> Можно применить наследование

public class Bus extends Vehicle {


    private int capacity;
    private int countPassengers;
    //  public Bus(){

    //    super(); -- вызов конструктора родителсьвого класса

    //}


    public Bus(String model, int year, int capacity) {

        // нужно сначала создать объект родителя
        // если в потомке нет явного конструктора родителя, то автоматические
        super(model, year); // вызов родительского конструктора, принимающего модель и год
        // Вызов констутора родителя должен быть первой строкой исполняемого кода

        this.capacity = capacity;
    }

    public Bus() {
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    // метод высадки

    public boolean takePassenger() {
        // Проверить есть ои свободное место, если есть - посадить - увеличить кол-во пассажиров
        if (countPassengers < capacity) {
            countPassengers++;
            // идею доступ в наследнике к полю родителя с модификатором протектед
            System.out.println("Пассажир прыгнул в бус: " + model);
            //System.out.println("Пассажир прыгнул в бус: " + getYear());
            return true;

        }    //else {}

        // сюда я и так попаду если будет место в автобусе , доп. элзе не нужен
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров", model, countPassengers);
        return false;

    }

    public boolean dropPassangers() {
        //  Главная задача не уйти в мину
        return false;
    }
}
