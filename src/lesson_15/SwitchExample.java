package lesson_15;

import java.util.Random;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        /*

         Когда нужно выполнить разные действия в зависимости от выражения
           Это альтернатива множественным if-else if, когда проверяется равенство одной переменной с разными

           Особенно хорош, когда мы выбираем из известного и конечного количества вариантов.
         */

        int x = 11;

        if (x == 5) System.out.println("if: x равен 5");
        else if (x == 7) System.out.println("if-else: x равен 7");
        else System.out.println("else: что-то другое");


        /*

        switch (выражение){

        case значение 1:
        // Блок кода для значения 1
        case значение 2:
        // Блок кода для значения 2
        case значение 3:
        // Блок кода для значения 3

        default:
        // Блок кода по умолчанию (если ни одно из значений не совпало)

        }

         */

        switch (x) {

            case 5:
                System.out.println("switch: x равен 5");
                break;
            case 7:
                System.out.println("switch: x равен 7");
                break;

            default:
                System.out.println("switch: что-то другое");


        }


        int input = 1;

        switch (input) {

            case 1:

                System.out.println("Вы ввели один");

                break;

            case 2:

                System.out.print("вы ввели два");

            case 3:

            case 4: // if (x == 3 || x == 4)

                System.out.println("Вы ввели три или четыре");

                break;

            default:

                System.out.println("Я таких чисел не знаю");

        }

        // Java 14 ot higher

        switch (input) {

            case 1 -> System.out.println("Opt2: Вы ввели один");

            case 2 -> System.out.println("Opt2: Вы ввели два");

            case 3, 4 -> System.out.println("Opt2: Вы ввели три или четыре");

            default -> System.out.println("Opt2: Я таких чисел не знаю");
        }

                /*

        У ребенка есть карманные деньги. Допустим сейчас у него 100 Ребенок получает оценку в школе (от 1 до 5)

        за хорошие оценки ребенок получает деньги, за плохие отбирают

        5-> +20

        4-> +10

        3-> +0

        2->-20

        1-> все деньги

        */

        Random random = new Random();

        int note; // генерация случайного числа от 1 до 5 включительно

        int deneg = 100;


        note = random.nextInt(5)+1; // 1-5 включительно

        System.out.println("Ребенок получил оценку: " + note);

        System.out.println("У ребенка сейчас денег: " + deneg);


        switch (note) {

            case 5:
                System.out.println("денег +20: " + (deneg += 20));
                break;
            case 4:
                System.out.println("денег +10: " + (deneg += 10));
                break;


            case 3:
                System.out.println("денег: " + (deneg));
                break;

            case 2:
                System.out.println("денег -20:" + (deneg -= 20));
                break;


            case 1:
                System.out.println("денег - 100:" + (deneg=0));







        }

        System.out.println("***************************");

        System.out.println("Денег:" + deneg);
        deneg = 100;

        deneg = switch(note){
            case 5 -> deneg +20;
            case 4 -> deneg +10;
            case 3 -> deneg +0;
            case 2 -> deneg -20;
            case 1 -> 0;
            default -> deneg;
            };


        System.out.println("Денег через молодежный свич:" + deneg);

        String multiString = """
                Строка 1
                Строка 2
                Строка 3
                """;




        System.out.println("У меня есть загадка");
        System.out.println("Что это: желтый, большой, с рогами и полный зайцев?");
        System.out.println("Как думаешь?");


        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();

        // троллейбус, Троллейбус, Троллейбус    , Троллейбус!

        String answerClean=answer.trim().toLowerCase();

        System.out.println("trim: "+ answerClean);

        switch (answerClean){

            case "троллейбус":
            case "троллейбус!":
                System.out.println("Молодец! Угадал!");
break;
            case "сдаюсь":
            case "сдаюсь!":
                System.out.println("Быстро ты сдался! Правильный ответ: троллейбус");
break;
            default:
                System.out.println("Ответ не верный, попробуй еще раз!");
        }

    }
}

