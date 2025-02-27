package homeworks.hw_22;

/*** Author: Roman Romashko Date: 26.02.2025 ***/

public class Les22Main {
    public static void main(String[] args){

        int[] numbers = new int[5];
        System.out.println("В numbers ячеек: "+numbers.length);
        // [1,3,66,2]
        // add(100)

        MagicArray magic = new MagicArray();

        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(6,7,8);
        magic.add(10,20,30,40);
        magic.add(999);

        System.out.println("В массиве сейчас элементов: "+ magic.size());


        String arrayToString = magic.toString();
        System.out.println("arrayToString: "+arrayToString);

        System.out.println("Внутренний массив:");
        magic.test();

        System.out.println("=====");
        int value = magic.get(0);

        System.out.println("magic.get(0)"+value);

       // System.out.println("magic.get(15)"+magic.get(15));
       // System.out.println("magic.get(-1)"+magic.get(-1));
       // System.out.println("magic.get(30)"+magic.get(30));

        int oldValue=magic.remove(3);
        System.out.println("magic.remove(3): "+oldValue);

        System.out.println(magic.toString());
        System.out.println("size: " + magic.size());

        magic.add(1000);
        System.out.println("arrayToString: "+arrayToString);

        System.out.println("=====");

        int index =magic.indexOf(20);

        if (index>=0){
            System.out.println("Значение было найдено");

        } else {
            // получили -1
            System.out.println("Такого индекса в массиве нет");

        }
        //System.out.println("magic.indexOf(20)"+magic.indexOf(20));
        //magic.test();

        System.out.println("\n\n=========================***< HOMEWORK >***========================");

        // Создадим массив с заданными значениями
        int[] mуHomeData = {1,10,5,100,24,100};

        MagicArray magik = new MagicArray(mуHomeData);

        // Выводим массив
        magik.test();

        // Выводим индекс последнего вхождения 100
        System.out.println("lastIndexOf(100):"+magik.lastIndexOf(100)); // ? -->5

        // Удаляем первое вхождение 100
        System.out.println("removeByValue(100):"+magik.removeByValue(100)); // ? -->True

        // Удаляем что-то иное
        System.out.println("removeByValue(77):"+magik.removeByValue(77)); // ? --> False

        // Выводим массив
        magik.test();



    }
}
