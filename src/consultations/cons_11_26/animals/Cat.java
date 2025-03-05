package consultations.cons_11_26.animals;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Cat extends Animal {

    private int age;

    public Cat(String name){
        super(name);

    }

    // Перегруженный конструктор
    public Cat(String name, int age){
        super(name); // обязательно как в конструкторе

        this.name = name; //
        this.age= age;


    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
