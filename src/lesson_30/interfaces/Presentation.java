package lesson_30.interfaces;

/*** Author: Roman Romashko Date: 10.03.2025 ***/

public class Presentation implements ColorPrintable{
    String title;
    String author;
    String theme;

    public Presentation(String title, String author, String theme) {
        this.title = title;
        this.author = author;
        this.theme = theme;
    }


    @Override
    public void colorPrint() {
        System.out.printf("Печатаю презентацию в цвете: author: %s, title: %s, theme: %s",author,title,theme );

    }

    @Override
    public void print() {
        System.out.printf("Печатаю чб презентацию %s автора  %s",title,author );
    }
}
