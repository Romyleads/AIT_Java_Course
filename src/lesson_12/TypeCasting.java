package lesson_12;

public class TypeCasting {
    public static void main(String[] args) {

        /*

        Два способа преобразования типа данных
        1. Неявное преобразование (автоматическое)
        2. Явное преобразование (кастинг)


        // Неявное преобразование происходит автоматически, когда значение меньшего типа данных
        // преобразуется в больший тип данных
         */

        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // Неявное преобразование типа byte в тип int
        System.out.println("intVal:" + intVal);

        double doubleVal = intVal; // Неявное преобразование типа double в тип int
        System.out.println("doubleVal:" + doubleVal);


        //Явное преобразование
        //Когда тип данные снижается и фактор потери информации увеличивается

        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2;

        System.out.println("doubleVal2:" + doubleVal2);
        System.out.println("int1:" + int1);

        short shortVal = (short) int1; // Явное преобразование к типу данных short
        System.out.println("shortVal:" + shortVal);


        double bigDouble= 3_000_000_000_000_000_000_000.00; // Тип данных double вмещает гораздо больший диапазон значений
        // в том числе и целой части

        System.out.println("\n=========================================== \n");

        // Преобразование в вычислениях

        int x =20;
        int y =7;

        double result;
        result = x/y;

        System.out.println("result:" + result);

        // 20 / 7.0 -> 20.0 / 7.0 -> 2.8634543
        result = x / 7.0;
        System.out.println("result:" + result);


        result = (float) x / y;
        System.out.println("result:" + result);


        //Приоритет математических операций

        /*

        ()
        *, %
        +,-

        */

        int varC = (2+8)/2;
        System.out.println("(2+8)/2: "+ varC);

        varC = 25 / (2 % 5) * 3;
        System.out.println("25 / (2 % 5) * 3"+ varC);

    }
}
