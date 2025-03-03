package lesson_24;

/*** Author: Roman Romashko Date: 28.02.2025 ***/


/*
Массив ссылочных типов данных. Элементы это массива - ссылки на объекты
 */
public class PersonApp {
    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");

        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Music, Reading");

        System.out.println(john.toString());

        Person[] people = new Person[5]; // Создаю массив для 5
        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");

        System.out.println("====================================");

        System.out.println("people[0]:" + people[0].toString());
        System.out.println(people[0].getName());

        people[0].setName("Peter");

        System.out.println("people[0]:" + people[0].toString());
        System.out.println(garry.toString());

        System.out.println(john.toString());


        System.out.println("====================================");


        for (int i = 0; i < people.length; i++) {

            if (people[i] != null) {
                System.out.println("people[" + i + "]:" + people[i].toString());
                System.out.println("people[" + i + "].getName:" + people[i].getName());

            } else {
                System.out.println("NUL!!!");
            }


        }

        System.out.println("====================================");

        Person test = new Person("Test", 50, "coding");

        people[2] = test;


        people[2].setName("Test1");
        test.setAge(52);

        System.out.println(test.toString());
        test = null;

        System.out.println(people[2].getHobby());

        test = people[1];


    }
}
