package homeworks.hw_23;

/*** Author: Roman Romashko Date: 28.02.2025 ***/

public class EmployeeTest {
    public static void main(String[] args) {

        // Создаем сотрудника

        Employee emp = new Employee("Сергей Петров", 25, 100000.0);

        // Выведем информацию о сотруднике
        emp.info();

        // Поменяем ему зарплату и возраст
        // emp.age=20; -> так не работает
        // emp.name="Robert"; -> так не работает
        // emp.salary=5555.50; -> так не работает

        // Установим недопустимые значения
        emp.setAge(15);
        emp.setSalary(-1000);

        // Проверяем свойства объекта
        emp.info();

        // Проверим установку допустимых значений
        emp.setAge(30);
        emp.setSalary(60000.0);

        // Проверяем свойства объекта
        emp.info();

        // Удобный метод вызова информации о сотруднике
        System.out.println(emp);


    }
}
