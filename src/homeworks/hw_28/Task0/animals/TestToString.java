package homeworks.hw_28.Task0.animals;



/*** Author: Roman Romashko Date: 06.03.2025 ***/

public class TestToString {
    private String title;

    public TestToString(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestClass: "+ title;
    }

    public static void main(String[] args) {

        TestToString test  = new TestToString("test");

        // у всех объектов любого класса есть метод toString полученный от Object
        // когда мы передаем ссылку на объект, где она должна быть выведена в строку, везде будет выведен toString();
        // System.out.println(test.toString());

        String result =" Hello" + test;

        System.out.println(result);


    }
}
