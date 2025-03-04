package lesson_25;

/*** Author: Roman Romashko Date: 03.03.2025 ***/

public class StaticBlockDemo {

    static int counter = 5;
    static String[] colors = new String[3];

    private String title;

    private int capacity =10; // Инициализация значения



    // Статистический блок инициализации

    // Вызывается ровно один раз до вызова конструктора


    static {

        System.out.println("Static Block RUN");
        colors[0]="red";
        colors[1]="green";
        colors[2]="yellow";
    }


    static {
        // может быть сколько угодно


    }


    // Не статические блоки инициализации
    // Выполняются при КАЖДОМ создании объекта
    // Вызывается до конструктора

    {

        System.out.println("NON-static block RUN!");
        this.title="DEFAULT";

    }


    public StaticBlockDemo() {
        System.out.println("Constructor RUN!");
        if (counter==0) {
        this.capacity=50;
        }
        colors[0]="red";
        colors[1]="green";
        colors[2]="yellow";
    }

    public String toString(){

        return String.format("Title %s, capacity: %d, static-counter: %d",title,capacity,counter);


    }

}
