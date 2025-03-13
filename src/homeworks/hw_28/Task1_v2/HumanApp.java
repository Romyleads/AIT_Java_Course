package homeworks.hw_28.Task1_v2;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class HumanApp {
    public static void main(String[] args) {

        Human human = new Human();
        Junior junior = new Junior();
        Profi profi = new Profi();


        human.run();
        System.out.println();

        junior.run();
        System.out.println();

        profi.run();
        System.out.println();



        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = junior;
        humans[2] = profi;

        System.out.println("\n=========================");
        for (int i = 0; i < humans.length; i++) {
            humans[i].run();
            System.out.println();
        }
        

    }
}
