package lesson_12;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 5;
        x = x + 10; //аналогично x += 5

        x += 5;

        System.out.println("0x: " + x);

        x-=2;
        x*=2;
        x/=5;

        System.out.println("1x: " + x);

        //Инкремент, декремент

        x++; // x = x + 1; x += 1; // инкремент - увеличить текущее значение в переменной x на 1

        System.out.println("2x: " + x);

        x--; // x = x - 1; x -= 1; // декремент - уменьшить текущее значение в переменной x на 1

        System.out.println("3x: " + x);

        System.out.println("\n====================\n");

        /*
        постфикс: x++, x-- -> в начале используется текущее значение переменной, а потом оно будет увеличено
        префикс: ++x, --x -> в начале будет увеличено, а потом взято

         */

        int var = 100;
        System.out.println("var: " + var++ +"var: "+ var);
        System.out.println("var: " + var);

        int y = 100;
        System.out.println("y: " + ++y);
        System.out.println("y: " + y);
    }
}
