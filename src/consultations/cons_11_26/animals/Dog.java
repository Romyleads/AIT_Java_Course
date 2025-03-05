package consultations.cons_11_26.animals;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Dog extends Animal {

    // Чтобы создать потомка, нужно сначала создать объект родителя

    public Dog(String name) {

        super(name);
        // Первой строкой вызывается конструктор родителя: super(name);
        //this.name=name;
    }
    void bark(){
        System.out.println(name + " barks!");

    }
}
