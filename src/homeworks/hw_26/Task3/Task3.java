package homeworks.hw_26.Task3;

import java.util.Arrays;
import java.util.Scanner;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class Task3 {

    public static void main(String[] args) {

        //phraseString();
        System.out.println(phraseString());

    }

    public static String phraseString(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов: ");

        // String[] words  = input.split(" ");
        // trim() - убирает пробелы в конце и начале строк
        String input = sc.nextLine().trim();

        StringBuilder sb =new StringBuilder();

        if (input.isEmpty()) return "";

        String[] words = input.split("\\s+");
        //System.out.println(Arrays.toString(words));

        //String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length()==0) continue;

            sb.append(word.charAt(0));

           // result += word.charAt(0);

        }

        //return "";
       // return result.toUpperCase();
        return sb.toString().toUpperCase();
    }
}
