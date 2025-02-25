package lesson_21;

public class Dog {
    String name;
    int weight;

    public Dog (String name, int weight){
        this.name=name;
        this.weight=weight;
    }

    public void info(){
        System.out.println("I am dog "+ name + ", my weight: "+ weight);

    }
    public void eat(){
        System.out.println("Я кушаю, ням ням!");
        this.weight++;
    }
    public void run(){
        /*
        1. Достаточный ли вес собачки для пробежки
        2. Если вес мал - кушать
         */
        while (weight<3){
            System.out.println("Сорян, я слишком худая, злая и голодная! Могу тебя съесть!");
            System.out.println("Мой вес сейчас: "+weight);
            eat();
        }
        System.out.println("Я бегу!");
        weight-=2;
        System.out.println("Вес после пробежки: "+weight);
        System.out.println("================================");
    }
}
