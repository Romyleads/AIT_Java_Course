package lesson_24;

/*** Author: Roman Romashko Date: 28.02.2025 ***/

/*
Статические члены класса видят только статический контент
 */

public class StaticExample {

    // Статическое поле класса
    static int staticY;
    // non-static класса
    int x;

    // Статический метод

    public static void staticMethod() {

        // Статические методы видят только статические члены (поля и методы) класса:
        // x++; не доступа
        staticY++; // доступ к статическому полю есть

        // Можем вызывать только статические методы
        // nonStaticMethod();
        // this.x - не доступно

    }

    // Не статический метод

    public static void main(String[] args) {
        //x = 10; // Ошибка компиляции. У статик метода нет доступа к не статических переменной
        staticY = 10;
        staticY++;



    }
    public void nonStaticMethod() {

        // Доступ ко всем членам класса
        // Не статический метод нельзя вызвать без создания объекта

       StaticExample staticExample = new StaticExample();

       staticExample.nonStaticMethod(); // я могу вызвать не-стат.метод

        // и наоборот: статический метод может вызваться без создания объекта
        StaticExample.staticMethod();

        x++;
        staticY++;

        int sum = MathUtil.sumIntegers(1,2,3,4,5,6,7,8);
        System.out.println("Сумма чисел: "+sum);

    }
}
