package homeworks.hw_29.Task2;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class GameApp {
    public static void main(String[] args) {

        // Для наглядности создадим переменную определяющую персонажа
        String myCharacter = "";

        // Создадим массив дочерних объектов класса GameCharacter и определим в его значениях персонажей
        GameCharacter[] characters = {
                new Mag(),
                new Warrior(),
                new Mag(),
                new Archer(),
                new Warrior()
        };

        // Пробежимся по этому массиву и вызовем метод атаки каждого персонажа
        for (int i = 0; i < characters.length; i++) {

            // Проверяем тип объекта с помощью instanceof
            if (characters[i] instanceof Warrior) {
                myCharacter = "Воин ";
            } else if (characters[i] instanceof Mag) {
                myCharacter = "Маг ";
            } else if (characters[i] instanceof Archer) {
                myCharacter = "Лучник ";
            } else {
                myCharacter = "Неизвестный персонаж ";
            }

            System.out.print(myCharacter);
            characters[i].attack();


        }
    }
}
