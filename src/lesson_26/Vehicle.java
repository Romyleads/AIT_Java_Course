package lesson_26;

/*** Author: Roman Romashko Date: 04.03.2025 ***/

public class Vehicle {
    protected String model; // наследники имеют прямой доступ
    private int year; // наследники не имеют доступ, только через сеттер и геттер

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public  Vehicle(){


    }

    public String toString(){

        return model+ ", year of manufacture : "+ year;

    }

    public void start(){
        System.out.println(model+ " начинает движение");
    }

    public void stop(){
        System.out.println(model+ " останавливается");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }


}
