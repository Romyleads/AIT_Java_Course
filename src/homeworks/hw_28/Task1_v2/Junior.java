package homeworks.hw_28.Task1_v2;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Junior extends Human{

    public Junior() {
        super(15, 10, "Молодой спортсмен");
    }

    public Junior(int runSpeed, int restTime) {
        super(runSpeed, restTime, "Молодой спортсмен");
    }

    @Override
    public void run() {
        System.out.printf("%s бежит со скоростью %d км/ч\n", getHumanType(), getRunSpeed());
        rest();
    }

}
