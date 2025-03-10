package lesson_29.children;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Child extends Parent{

    // Copy from parent
    // private String name;
    int age;
    //String name="Вася";

    // если не ни одного будет добавлен конструктор вида:
    public Child(){
        // вызывается пустой конструктор родителя
       super("Default");
       this.age=20;


    }

    public Child(String name, int age){
        super(name);
        this.name=name;
        this.age=age;

    }
 // нельзя переопередлить если указан в родителе final
    //@Override
    //void show() {
      //  System.out.println("Another show");
    //}
}
