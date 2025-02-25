package lesson_18;

import java.util.Arrays;

public class homework_Task2 {
    public static void main(String[] args) {

        //String[] strings={"One", "Pyton", null, "Hello", "JS"};
        //String[] result = getArrayWithSmallestStrings(strings);
        //System.out.println(Arrays.toString(result));


        /*
        System.out.println("\n====================== START test Array = null / length =0  ====================== ");
        strings=null;
        strings=new String[0];
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n====================== STOP test Array = null / length =0  ====================== ");


        System.out.println("\n====================== START test null in array  ============================== ");

        strings= new String[]{"One", "Pyton", null, "Hello", "JS"};
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));


        System.out.println("\n====================== STOP test null in array   ====================== ");


        System.out.println("\n====================== START test null in array is First ============================== ");

*/
        String[] strings = {null, "Pyton", null, "Hello", "JS"};
        String[] result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));


    }


    public static String[] getArrayWithSmallestStrings(String[] strings){

        // Important checkout on null
        if (strings == null || strings.length == 0) {
            return new String[0]; // []
        }

        String notNullValue=findFirstNotNullValueInArray(strings);
        //System.out.println("notNullValue: "+ notNullValue);

        
      // String smallest = strings[0];
      // String biggest = strings[0];
        
        if (notNullValue == null) {
            return new String[0]; // []
        }

        String smallest = notNullValue;
        String biggest = notNullValue;

        for (int i = 0; i < strings.length; i++) {

            //System.out.println("Текущий:"+strings[i]+", ");

            //if (strings[i]!=null) continue;
            if (strings[i]!=null && strings[i].length()<smallest.length()){
                smallest=strings[i];

            }

            if (strings[i]!=null && strings[i].length()>biggest.length()){
                biggest=strings[i];

            }

        }
        return new String[] {smallest,biggest};
    }


    public static String findFirstNotNullValueInArray(String[] strings){

        for (int i = 0; i < strings.length; i++) {
            if (strings[i]!=null) return strings[i];
        }
        // не нашли ни одного нулл
        return null;
    }
}
