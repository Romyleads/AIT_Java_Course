package homeworks.hw_31;



/*** Author: Roman Romashko Date: 12.03.2025 ***/

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> integerList = new MyArrayList<>();
        integerList.add(10);

        System.out.println(integerList);
        integerList.addAll(120,250,2000, -100, -200, 0);

        System.out.println(integerList);

        System.out.println(integerList.get(0));
        System.out.println(integerList.size());
        System.out.println(integerList.indexOf(120));
        System.out.println(integerList.indexOf(250));


        System.out.println("======================");


        // Хотим удалить 0


        integerList.remove(Integer.valueOf(0)); // упаковка в инт
        System.out.println(integerList);

        System.out.println("======================");

        // Хотим удалить добавить и удалить null
        integerList.add(null);
        System.out.println(integerList);

        // Поиск null

        System.out.println(integerList.indexOf(null));

        System.out.println("======================");

        integerList.remove(null);
        System.out.println(integerList);





    }
}
