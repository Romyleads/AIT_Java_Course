package homeworks.hw_28.Task1;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Profi extends Human{

    @Override
    public void run() {
        System.out.println("Профессионал бежит со скоростью 25 км.ч");
        showPauseTime();
    }

    @Override
    public void showPauseTime() {
        System.out.println("Нужен отдых: 5 мин.");
    }
}
