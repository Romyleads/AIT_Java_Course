package homeworks.hw_23;

/*** Author: Roman Romashko Date: 28.02.2025 ***/

    /*
    Task 0
    Написать класс Employee (Работник)
    У него должны быть поля имя, возраст, зарплата
    Инкапсулировать класс.
    Написать метод info() выводящий информацию о работнике.
     */
public class Employee {

    // Инкапсуляция
    private final String name;
    private int age;
    private double salary;

    //  Конструктор полей
    public Employee(String name, int age, double salary) {
        this.name = name;
        setAge(age); // Применяем сеттер для проверки возраста
        setSalary(salary); // Применяем сеттер для проверки зарплаты
    }

    // Геттер для поля имени
    public String getName() {
        return name;
    }

    // Геттер для поля возраста
    public int getAge() {
        return age;
    }

    // Сеттер для поля возраста
    public void setAge(int age) {
        if (!(age <= 18 || age >= 70)) {
            // age подходит
            this.age = age;
        } else {
            System.out.println("Неподходящий возраст. Устанавливаем начальный возраст: 18");
            this.age = 18; // возраст по умолчанию
        }
    }

    // Геттер для поля зарплаты
    public double getSalary() {
        return salary;
    }

    // Сеттер для поля зарплата
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Зарплата не может быть меньше 0. Устанавливаем 1");
            this.salary = 1;
        }

    }

    //Метод info() - выводим информацию о работнике
    public void info() {
        System.out.printf("Сотрудник: %s, age: %d, salary: %.2f%n", name, age, salary);
    }

    //Переопределение метода toString()
    public String toString() {
        return String.format("Сотрудник: %s, age: %d, salary: %.2f%n", name, age, salary);

    }


}
