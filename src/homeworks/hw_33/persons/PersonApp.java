package homeworks.hw_33.persons;

public class PersonApp {
  public static void main(String[] args) {

    // Не валидный пароль и емейл
    Person person = new Person("test@mailnet", "password");
    System.out.println("test@mailnet : password -> " + person);

    // Валидный пароль и емейл
    person = new Person("test@mail.net", "Password-123");
    System.out.println("test@mail.net : Password-123 -> " + person);



  }

}
