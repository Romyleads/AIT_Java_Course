package homeworks.hw_24;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

public class MainDogTrain {
    public static void main(String[] args) {

        Dog dog=new Dog("Patrik", 33);

        // Выводим информацию о собаке
        dog.info();

        // Проверяем возможность взять барьер, если возможно тренируемся и берем барьер
        dog.jumpBarrier(65);


    }
}
