package homeworks.hw_28.Task1;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class HumanSportApp {
    public static void main(String[] args) {

        Human human = new Human();
        Junior junior = new Junior();
        Profi profi = new Profi();

        System.out.println("===== Обычный человек =====");
        human.run();

        System.out.println("\n===== Спортсмен любитель =====");
        junior.run();

        System.out.println("\n===== Спортсмен профессионал =====");
        profi.run();


    }
}
