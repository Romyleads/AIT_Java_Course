package homeworks.hw_27.bus;

/*** Author: Roman Romashko Date: 05.03.2025 ***/


/*
Ассоциация - это форма ассоциации, представляющая собой отношение "часть-целое"
Ассоциация бывает:

Агрегация - часть - целое, где часть может существовать отдельно
Композиция - часть - целое, где часть не может существовать без целого

Ассациации реализуются через создание ссылок в классе на другие объекты
Это значит, что класс содержит поля, которые ссылаются на объекты других классов.

Ассациации - это отношения между классами, где один класс использует другой в качестве одного из своих полей

Автобус содержит Водителя. HAS-A - Агрегация
Автобус содержит Автопилот. HAS-A - Композиция. Автопилот является неотъемлемой частью автобуса. Это жесткая неразрывная связь.

Важные аспекты ассоциации:

Направленность : одно, двух
Кардинальность связи: Определяет сколько объектов класса одного класса может быть асссоциировано с объектом другого класса.

One to One,
One to Many,
Many to Many

1:1 Автобус и двигатель

Каждый автобус может иметь ровно один двигатель. И на каждый двигатель приходится ровно один автобус.
1 : Many -> автобус может иметь множество пассажиров, но со стороны пассажира - один он в одном автобусе. Один пассажир  - в одном автобусе.

Many : Many -> Список автобусов и списко автобусных остановок.
т.е. каждый автобус останавливается на множестве остановок и на каждой остановке может обсуживаться множество автобусов.

 */

public class Autobus {

    private static int counter = 1;
    // уникальный идентификатор объекта
    private final int id;

    private BusDriver driver; // агрегация - мягкая связь
    private Autopilot autopilot; // композиция - жесткая связь

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id= counter++;
        this.driver = driver;
        this.capacity = capacity;
        this.autopilot= new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "id=" + id +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                ", capacity=" + capacity +
               // ", get='" + get + '\'' +
                '}';
    }
        public void showListPassengers() {

            if (countPassengers == 0) {
                System.out.println("[]");
                return;


            }
            StringBuilder sb = new StringBuilder("[");

            for (int i = 0; i < countPassengers; i++) {
                sb.append(passengers[i].toString());
                sb.append((i < countPassengers - 1) ? ", " : "]");
            }

            System.out.println(sb.toString());
        }
   public boolean takePassenger(Passenger passenger){

    if (passengers==null) return false;

    /*
    1. Надо проверить свободное место
    2. Находится ли пассажир в автобусе
    3. Если есть место и не в автобусе - садим на борт
    3.1 добавляем в список пассажиров
    3.2 увеличиваем кол-во пассажиров
    3.3. Возвращаем true
    4. Иначе 3.3 - что-то пошло не так
     */
       if (countPassengers < capacity) {
           // Место есть

           if (isPassengerInBus(passenger)) {
               // Пассажир уже внутри
               System.out.printf("Пассажир с id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
               return false;
           }

           // Добавляем пассажира
           passengers[countPassengers++] = passenger;
           return true;
       }

       // Места нет
       return false;
   }

    private boolean isPassengerInBus(Passenger passenger){

        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()){
                // id совпали - значит єто один и тот же объект
                return true;

            }
        }
        return false; // Не найден
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }



}
