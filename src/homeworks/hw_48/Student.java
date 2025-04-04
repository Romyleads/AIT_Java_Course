package homeworks.hw_48;

/*** Author: Roman Romashko Date: 04.04.2025 ***/

/*
    Есть класс Student, описывающий студентов университета:

    public class Student {
    private String name;
    private int age;
    private String major; // специальность
    private int year;     // курс
    private double grade; // средняя оценка

        // Конструктор, геттеры, toString()
    }
 */

public class Student {
    private String name;
    private int age;
    private String major; // специальность
    private int year;     // курс
    private double grade; // средняя оценка

    // Конструктор, геттеры, toString()


    public Student(String name, int age, String major, int year, double grade) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.year = year;
        this.grade = grade;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (" + major + ", " + year + " курс, ср. оценка " + grade + ")";
    }

}
