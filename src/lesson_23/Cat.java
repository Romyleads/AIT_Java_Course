package lesson_23;

/*** Author: Roman Romashko Date: 27.02.2025 ***/

public class Cat {
    private final String name;
    private int age;
    private int weight;

    protected boolean isProtected;
    boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    // Геттеры и сеттеры - спец. публичные методы, дающие возможность получать или изменять значения поля
    // Геттер для поля age
    public int getAge() {
        return age;

    }

    // Сеттер позволяет изменять значения приватных методов
    public void setAge(int age) {
        if (!(age < 0 || age > 30)) {
            // Если age подходит
            this.age = age;
        } /*else {
            // пусто - ничего не делаем
        }*/
    }

    public int getWeight() {
        return weight;

    }

    public void setWeight(int weight) {
        if (!(weight < 0 || weight > 30)) {
            // Если weight подходит
            this.weight = weight;
        } else {
            this.weight = 0; // если не подходящее - ставим по умолчанию
            System.out.println("Текущий вес кота: " + this.weight);
        }

    }

    public String getName() {
        return name;

    }

    // Я не хочу давать возможность менять имя, поэтому не пишу сеттер на имя
    /*
    public void setName(String name) {
    if (name!=null) {
        this.name = name;
        }
    }
    */

    public void sayMeow() {
        System.out.println("Meow! " + name);
        testMethod(); // внутри класса есть доступ
    }

    private void testMethod() {
        System.out.println("Test!");

    }

    public String toString() {
        //System.out.printf("Cat %s, age: %d, weight: %d\n", name,age,weight);
        //String resConcat="Cat" + name + ", age"+age+" weight: "+ weight;
        String result = String.format("Cat %s, age: %d, weight: %d", name, age, weight);
        return result;
    }

}
