package lesson_15;

public class TernaryOperator {
    public static void main(String[] args) {

        // Тернарный оператор - краткая форма if-else, которая позволяет присваиветь значения в зависимости от условий

        int age = 20;

        String status;

        if (age >=18) {
            status = "Совершеннолетний";
        } else {
            status = "Несовершеннолетний";
        }

        System.out.println(status);

        // переменная = (условие) ? значение если True : значение если False

        String result = (age >=18) ? "Совершеннолетний" : "Несовершеннолетний";

        int x = 18;

        System.out.println("Значение в переменной x "+ ((x>=0)?"положительное" : "отрицательное"));


    }
}
