package homeworks.hw_21;

/*** Author: Roman Romashko Date: 26.02.2025 ***/

public class Bike {
    String brand;
    String color;
    int speed;
    boolean reqLicense = false;

    public Bike(String brand, String color, int speed, boolean reqLicense){
        this.brand=brand;
        this.color=color;
        this.reqLicense=reqLicense;
        this.speed=speed;

    }

    public void iride() {
        String licText = reqLicense ? "Мне нужны права для этого." : "Мне не нужны права для этого.";
        System.out.println("Я еду на велосипеде " + brand + " " + MyColorUtils.convertColor(color) + " цвета со скоростью " + speed + " км/ч. " + licText);
    }

}




