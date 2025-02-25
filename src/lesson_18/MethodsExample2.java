package lesson_18;

public class MethodsExample2 {
    public static void main(String[] args) {

        int temp = 55;

        changeMe(temp);

        System.out.println(temp); //55

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        printArray(numbers);

        changeMe(numbers);

        printArray(numbers);

        int[] link2= numbers;

        link2[2]=-100;

        System.out.print("numbers:" );
        printArray(numbers);

        System.out.print("numbers:" );
        printArray(link2);

        // null - специальное значение, указывающее, что ссылка не ссылается на объект - отсутствие значение ссылки переменной
        numbers = null;
        //printArray(numbers);


        // numbers[0] = 10; // Ошибка возникает во время работы программы NullPointerException
        // нельзя взять 0-й элементу ничего

        link2[9]=0;
        printArray(link2);

        numbers=new int[]{10,20,30};

        System.out.print("numbers:" );
        printArray(numbers);

        String hello="Hello";
        changeMe(hello);
        System.out.println("hello main:"+ hello);
        //hello="dsdsfsdfdsf";
        //changeMe(hello);
        String str2=hello.toUpperCase();
        changeMe(str2);

    } // Methods area

    public static void changeMe(String str){
        str = str + "!!!";

        System.out.println("str method:"+ str);

    }

    public static void changeMe(int[] array){
    System.out.println(array.length);
    array[0] =1000;

    }

    public static void changeMe(int x){

        x = 100;

    }
    // Метод "красиво" выводящий все элементы массива ЦЕЛЫХ ЧИСЕЛ
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // перебираю индексы массива
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

} // End class
