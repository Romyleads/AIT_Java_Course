package lesson_25;

/*** Author: Roman Romashko Date: 03.03.2025 ***/


// Static - делает переменную единственное для всех экземпляров класса, а
// final делает ее неизменяемой


public class ConstantDemo {

    public static final double PI = 3.141519; // Константа
    public static final int[] ints = new int[5]; // не является константой так как состояние объекта (значения  в массиве можно изменить)

    public static final String MY_COUNTRY = "Germany"; // Константа, так как невозможно изменить значение строки (состояние объекта)
    public static final String[] colors = {"blue", "red", "green"}; // не константа

    public ConstantDemo() {
        colors[0] = "purple";
        // COUNTRY  = "USA"; - не могу изменить
        String newString = MY_COUNTRY.toUpperCase();

    }

    public static double doublePiSqrt() {
        double result = 2 * PI * PI;
        return result;
    }

}
