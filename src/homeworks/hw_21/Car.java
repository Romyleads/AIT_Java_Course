package homeworks.hw_21;

/*** Author: Roman Romashko Date: 26.02.2025 ***/

public class Car {

    String brand;
    String color;
    int speed;
    boolean reqLicense = true;

    public Car(String brand, String color, int speed){
        this.brand=brand;
        this.color=color;
    //    this.reqLicense=reqLicense;
        this.speed=speed;

    }

    public void iride() {
        String licText = reqLicense ? "Мне нужны права для этого." : "Мне не нужны права для этого.";
        System.out.println("Я еду на машине " + brand + " " + MyColorUtils.convertColor(color) + " цвета со скоростью " + speed + " км/ч. " + licText);
    }



}
