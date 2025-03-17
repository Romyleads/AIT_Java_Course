package lesson_35.equals;

import java.util.Objects;

/*** Author: Roman Romashko Date: 17.03.2025 ***/

public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;

        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(dateOfBirth);
        return result;
    }


    // Прописываю логику сравнения этого (this) объекта с другим объектом любого типа данных


        ///@Override
        ///public boolean equals(Object obj) {
      ///  if (this == obj) return true; //
        //return super.equals(obj);
      ///  if (!(obj instanceof Employee)) return false;
       /// Employee employee = (Employee) obj;

        // Сравниваю значение полей, которые должны быть равными, для признания объектов равными
        //return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);

        //null.equals(employee.firstName) -- > аварийное завершение программы

        //return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && dateOfBirth.equals(employee.dateOfBirth);

        // Безопасное сравнение с учетом того, что кто-то может оказаться null
        //return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth);


        //Object.equals(null,employee.firstName) --> вернет false;

    ///}


}
