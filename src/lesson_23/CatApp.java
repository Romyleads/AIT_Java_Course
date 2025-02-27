package lesson_23;

// import lesson_21.Cat;

/*** Author: Roman Romashko Date: 27.02.2025 ***/

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Catty", 8, 5);
        cat.sayMeow();
        System.out.println(cat.toString());
        //   System.out.println(cat.age); // не доступно, так как помечены как private
        //   cat.age = -1000; // не доступно, так как помечены как private
        //   cat.weight = 1500;
        //   cat.name = null;
        System.out.println(cat.toString());
        //    cat.testMethod(); // не доступно, так как помечены как private
        Cat cat2 = new Cat(null, 150, -20);
        System.out.println(cat2.toString());
        System.out.println("==============================");

        int catAge=cat.getAge();

        System.out.println("В след. году коту будет:"+(catAge+1));
        System.out.println("Вес:"+cat.getWeight());
        System.out.println("Имя кота:"+cat.getName());

        System.out.println("==============================");

        //int catAge=cat.setAge();

        //System.out.println("В след. году коту будет:"+(catAge+100));
        cat.setAge(15);
        System.out.println(cat.toString());

        cat.setAge(-15);

        System.out.println("==============================");
        cat.isProtected=true;
        System.out.println("cat.isProtected:"+cat.isProtected);

        cat.isDefault=false;
        System.out.println("cat.isDefault:"+cat.isDefault);







    }
}
