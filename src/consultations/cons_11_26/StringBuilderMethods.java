package consultations.cons_11_26;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class StringBuilderMethods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println("sb.capacity(): " + sb.capacity());
        System.out.println("sb.length(): " + sb.length());

        sb.append("Test string append");

        System.out.println("sb.capacity(): " + sb.capacity());
        System.out.println("sb.length(): " + sb.length());

    }
}
