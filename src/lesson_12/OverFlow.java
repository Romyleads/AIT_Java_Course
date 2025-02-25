package lesson_12;

public class OverFlow {
    public static void main(String[] args) {

        // -128 ... 128

        byte byteVar = 127;
        System.out.println(byteVar);

        byte n = 3;
        byteVar = (byte)(byteVar + n);
        System.out.println(byteVar);
    }
}
