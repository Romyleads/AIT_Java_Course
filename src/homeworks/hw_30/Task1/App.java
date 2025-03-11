package homeworks.hw_30.Task1;

/*** Author: Roman Romashko Date: 11.03.2025 ***/

/*
    Task 1
    Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
    Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
    Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */
public class App {
    public static void main(String[] args) {

        // Создаем объект на основе класса Триатлет и вызываем его методы
        Triathlete triathlete = new Triathlete();
        triathlete.swim();
        triathlete.run();

        System.out.println("\n===============\n");

        // Используем массив интерфейсов
        Swimmer[] swimmers = new Swimmer[1];
        Runner[] runners = new Runner[1];

        //swimmers[0].swim(); // Cannot invoke "homeworks.hw_30.Task1.Swimmer.swim()" because "swimmers[0]" is null

        // Присваиваем объект triathlete первому элементу массива swimmers
        swimmers[0] = triathlete;
        swimmers[0].swim();

        // Присваиваем объект triathlete первому элементу массива runners
        runners[0] = triathlete;
        runners[0].run();

        System.out.println("\n===============\n");

        // Проверяем instanceof
        if (triathlete instanceof Swimmer) {
            System.out.println("Triathlete реализует интерфейс Swimmer, поэтому он умеет плавать.");
        }
        if (triathlete instanceof Runner) {
            System.out.println("Triathlete реализует интерфейс Runner, поэтому он умеет бежать.");
        }

    }
}
