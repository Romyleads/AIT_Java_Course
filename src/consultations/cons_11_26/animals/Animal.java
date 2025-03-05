package consultations.cons_11_26.animals;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Animal {
    protected String name;

    public Animal(String name){

        this.name=name;
    }

    // Пустой конструктор чтобы иметь возможность генерировать пустые объекты без имени
    //public Animal(){
    //}

    void eat(){

        System.out.println(name + " eats");
    }
    public String toString(){
        return "Animal "+ name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
