package lesson_25;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

// ключевое слово final. Может применяться к классам, членам классов (полям, методам), переменным (в т.ч. аргументам методов)

public class FinalDemo {
    // Для примитивных типов данных, помеченных как final
    // После инициализации (присвоения первого значения)

    private final int capacity;

    // Ссылочный тип данных. Нельзя изменить значение переменной (привязать новый объект)

    private  final int[] ints=new int[5];

    private int notFinal;


    public FinalDemo(int capacity){
        this.capacity=capacity;
        // Нельзя поменять значение final переменной
        //this.capacity++;

        // Нельзя присвоить ссылку на другой объект или null
        //this.ints = new int[2];
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;


    }

    // Параметры метода тоже можно пометить как final
    // т.е. внутри метода нельзя изменить значение перемнной
    public void finalArguments(int x, final int[] array){
        // нельзя изменить x
        x++;

        // не могу присвоить ссылку на новый обхект
        // array
        array[0]=x;
        array[1]=1000;


    }
    // Сеттеры для финальных полей не генерируются

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }
}
