package homeworks.hw_28.Task1;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Junior extends Human{

    @Override
    public void run() {
        System.out.println("Спортсмен любитель бежит со скоростью 15 км.ч");
        showPauseTime();
    }

    @Override
    public void showPauseTime() {
        System.out.println("Нужен отдых: 10 мин.");
    }

}
