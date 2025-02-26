package homeworks.hw_21;

/*** Author: Roman Romashko Date: 26.02.2025 ***/

public class MyColorUtils {
    public static String convertColor(String color) {
        return color.replaceAll("ий$", "его").replaceAll("ый$", "ого").replaceAll("ой$", "ого");
    }
}
