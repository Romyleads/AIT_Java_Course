package lesson_30.flyable;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class Application {
    public static void main(String[] args) {

        Airplane airplane = new Airplane(50);

        Duck duck = new Duck();

        duck.fly();

        duck.swim();

        System.out.println("\n============");

        Flyable[] flyables = new Flyable[2];
        flyables[0] = duck;
        flyables[1] = airplane;

        for (int i = 0; i < flyables.length; i++) {
        Flyable flyable = flyables[i];
        flyable.fly();


        // Проверяем возможность приведения ссылки к типу интерфейса
        if (flyable instanceof Swimmable){

            System.out.println("Могу привести этот объект к Swimmable");
            Swimmable swimmable = (Swimmable) flyable;
            swimmable.swim();
            System.out.println("\n============");
        }

        //

            if (flyable instanceof Airplane){
                System.out.println("Могу привести к самолету");
                Airplane airplaneLink = (Airplane) flyable;

                System.out.println("Вместимость: " + airplaneLink.capacity);
                airplaneLink.takePassenger();

                System.out.println("Количество пассажиров: " + airplaneLink.amountPassengers);




            }


        }


    }
}
