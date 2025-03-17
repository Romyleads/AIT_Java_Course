package lesson_35.equals;

/*** Author: Roman Romashko Date: 17.03.2025 ***/

public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee = new Employee("Петр", "Петров", "21.10.2000");
        Employee employee1 = new Employee("Руслан", "Руслвнов", "21.09.2002");
        Employee employee2 = new Employee("Иван", "Иванов", "1.11.2002");
        Employee employee3 = new Employee("Петр", "Петров", "21.10.2000");




        System.out.println("employee equals employee1:" +(employee == employee1));
        System.out.println("employee equals employee3:" +(employee == employee3));

        System.out.println("employee == employee1:" +(employee.equals(employee1)));
        System.out.println("employee == employee3:" +(employee.equals(employee3)));


    }
}
