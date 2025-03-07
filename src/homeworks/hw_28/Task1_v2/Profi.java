package homeworks.hw_28.Task1_v2;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Profi extends Human{

    public Profi() {
        super(25, 5, "Профессиональный спортсмен");
    }

    public Profi(int runSpeed, int restTime) {
        super(runSpeed, restTime, "Профессиональный спортсмен");
    }

    @Override
    public void run() {
        System.out.printf("%s бежит со скоростью %d км/ч\n", getHumanType(), getRunSpeed());
        rest();
    }

}
