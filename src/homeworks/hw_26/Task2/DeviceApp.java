package homeworks.hw_26.Task2;

/*** Author: Roman Romashko Date: 05.03.2025 ***/

public class DeviceApp {
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung", "Galaxy S", "Android");
        Laptop laptop = new Laptop("Lenovo", "Yoga 7", 14);

        System.out.println(phone);
        System.out.println(laptop);

    }
}
