package lesson_21;

public class MainCats {
    public static void main(String[] args) {

        // 1. Физически создается объект типа Cat
        // 2. Вызывается конструктор класса для инициализации свойств объекта (заполнение полей значениями)
        /*
        При создании объекта класса все его поля инициализируются какими-то значениями
        По умолчанию (если не задано другое поведение) поля инициализируются значениями по умолчанию для своего типа данных
         */
        Cat cat=new Cat(); // Создание нового объекта класса Cat
        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName=cat.name;
        System.out.println("Имя: "+ catName);

        System.out.println("Возраст "+ cat.age);
        System.out.println("\n=========================================");

        Cat cat1 = new Cat("Max");
        // Будет создан новый объект класса Cat
        // Имя (строка), которая передана в конструктор будет присвоена свойству name объекта класса

        System.out.println("cat1.name: "+ cat1.name);
        System.out.println("cat1.color: "+ cat1.color);

        cat.whoAmI();
        cat1.whoAmI();
        System.out.println("\n=========================================");

        Cat cat2= new Cat("Diamand", "red");
        cat2.whoAmI();

        System.out.println("\n=========================================");

        Cat barsik= new Cat("Barsik", "white", 10);
        System.out.println("barsik.name: "+ barsik.name);
        System.out.println("barsik.color: "+ barsik.color);
        System.out.println("barsik.age: "+ barsik.age);

        barsik.whoAmI();


        Cat catClone=barsik;
        catClone.whoAmI();
        barsik.age=100;
        System.out.println("\nbarsik.age=100");

        barsik.whoAmI();
        catClone.whoAmI();


        System.out.println("\n=========================================");

        catClone = new Cat("Kratos", "black", 66);
        catClone.whoAmI();
        barsik.whoAmI();

        catClone=null; // нет привязки к объекту null - ничто. Ссылка не ссылается ни на какой объект
        // Если у переменной, значение которой null попытаться вызвать метод, получить свойство -программа завершится ошибкой NullPointerException.
        // У null нельзя вызвать метод, присвоить или получить значение поля - NPE

        if (catClone!=null) {
            System.out.println("catClone.name: "+ catClone.name);
            catClone.whoAmI();

        } else {
            System.out.println("В переменной хранится null");

        }

    }
}
