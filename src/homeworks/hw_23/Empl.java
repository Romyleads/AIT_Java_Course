package homeworks.hw_23;

/*** Author: Roman Romashko Date: 28.02.2025 ***/

public class Empl {

    private String name;
    private  int age;
    private  double salary;

    public Empl(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void info(){

        System.out.printf("Сотрудник имя: %s, возраст: %d, зарплата: %.2f",name,age,salary);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
