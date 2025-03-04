package homeworks.hw_24;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

/*
    Task 2 * (Опционально)
    Написать класс Собака (Dog).

    Каждая Собака обязательно должна иметь имя и высоту прыжка
    Должна уметь прыгать и должна уметь тренироваться.

    За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
    Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
    чем двукратная высота первоначального прыжка.

    Также должен быть метод взять jumpBarrier.
    В параметрах метод принимает высоту барьера.
    Если собака в состоянии преодолеть этот барьер - прыгает.
    Если не в состоянии, нужно проверить помогут ли тренировки
    (будет ли данная собака в принципе в состоянии взять барьер).

    Если да -> идем тренироваться -> берет барьер
*/

public class Dog {
    private String name; // Имя собачки
    private double initHeight; // Высота прыжка собачки
    private double curHeight; // Текущая высота прыжка
    private double maxHeight; // Максимальная высота прыжка для собачки


    public Dog(String name, double initHeight) {
        this.name = name;
        this.initHeight = initHeight;
        this.curHeight = initHeight;
        this.maxHeight = initHeight * 2;
    }

    public void info() {
        System.out.println("Я собачка " + name + ", моя высота прыжка: " + curHeight);

    }

    public void jump() {
        System.out.println("Я успешно прыгаю на высоту " + curHeight + "см.");

    }

    public void train() {



        // Тренируемся если предел не наступил
        if (curHeight < maxHeight) {

            double increase = 10;
            // Если прибавление 10 см превысит максимум, прибавляем только разницу до maxHeight
            if (curHeight + increase > maxHeight) {
                increase = maxHeight - curHeight;   // рассчитываем разницу до максимума
            }

            curHeight += increase;
            //curHeight += 10;
            System.out.println("Я тренируюсь! Моя текущая высота прыжка: " + curHeight);
        } else {
            System.out.println("Я достигла максимальной высоты прыжка!");
        }
    }

    public void jumpBarrier(double barHeight) {

        System.out.println("Барьер: " + barHeight);

        // Начинаем брать барьер

        // Если сходу текущая высота прыжка собаки не меньше высоты барьера - прыгаем!
        if (curHeight >= barHeight) {
            System.out.println("Бинго!");
            jump();
            return;
        } else {
            // Если нет:
            // Проверяем возможно ли натренировать собаку до это высоты
            // Если да - тренируем, если нет - сожалеем!
            if (maxHeight >= barHeight) {

                while (curHeight < barHeight) {
                    train();
                }
                //if (curHeight >= barHeight) {
                //    System.out.println("Бинго!");
                //    jump();
                //    return;
                //}

                System.out.println("Бинго!");
                jump(); // выполняем прыжок
            } else {
                System.out.println("Извини друг! Тут тренировки не помогут!");
            }

        }
    }

}
