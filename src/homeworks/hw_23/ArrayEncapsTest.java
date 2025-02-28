package homeworks.hw_23;

import java.util.Arrays;

/*** Author: Roman Romashko Date: 27.02.2025 ***/

public class ArrayEncapsTest {
    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};

        MagicArrayEncaps magic = new MagicArrayEncaps(test);
        // magic.test();
        magic.add(10); // у нас создался новый массив
        // magic.test();

        // Что может делать пользователь не нужного
        //magic.array[1]=10000;
        //magic.array=new int[5];

        //magic.test();

        System.out.println(magic.toString());

        // magic.test();

        test[3] = 1000;

        // magic.test();
        magic.add(20, 330, 40);

        System.out.println(magic.toString());

        int[] fromMagic = magic.toArray();
        System.out.println(fromMagic.length);
        //fromMagic[3] = 1000;
        System.out.println("Массив: " + Arrays.toString(fromMagic));
    }
}
