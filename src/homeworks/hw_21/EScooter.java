package homeworks.hw_21;

/*** Author: Roman Romashko Date: 26.02.2025 ***/

public class EScooter {
    String brand;
    String color;
    int speed;
    boolean reqLicense = false;

    public EScooter(String brand, String color, int speed){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
        this.reqLicense=speed>25;

    }

    public void iride() {
        String licText = reqLicense ? "Мне нужна дорожная лицензия для этого." : "Мне не нужна дорожная лицензия для этого.";
        System.out.println("Я еду на электроскутере " + brand + " " + MyColorUtils.convertColor(color) + " цвета со скоростью " + speed + " км/ч. " + licText);
    }

}
