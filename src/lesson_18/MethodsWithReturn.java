package lesson_18;

public class MethodsWithReturn {
    public static void main(String[] args) {

        // Возвращаемое значение  - это результат, который метод отправляет обратно

     //   int sum = 10 + 5;
        calculateSum(10,5);
        int sum = calculateSum(10,5);

        sum = calculateSum(10,5) + calculateSum(20,30);
        //System.out.println(sum);


        int pow = powTwo(3);

        System.out.println("powTwo(3): "+ pow);

        test(5);
        test(-10);
        test(3);



    } // Methods ares


    public static void test(int x) {
        // не печатать числа, если x = 3
        if (x==3){
            return;
        }
// печатает числа от 0 ло x
        int result =1;
        for (int i =0; i<x; i++){
            System.out.print(i+ ", ");

        }
        System.out.println();
    }


    // Написать метод, возвращающий 2 в степени X. X

    // если x отрицательный - отбросить часть числа
    public static int powTwo(int x) {

        boolean isPositive = x >= 0;

        if (x<0){
            x = x * -1;
        }

        // вычисляем 2 ^ |X|


        int result =1;
        for (int i =1; i<=x; i++){
            result *= 2;

        }

        if (isPositive){
        return result;
        } else {
            return 1/result;
        }
    }


    /*
    public static int test(int x){

        return -1;
    }

    public static double test(int x){

        return -10;
    }
*/
    public static int calculateSum(int a, int b){

        int result = a+ b;
        System.out.println(result);
        return result; // оператор заканчивающий работу метода м возвращающий значение


    }
}
