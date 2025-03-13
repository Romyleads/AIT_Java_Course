package lesson_33.persons;

public class Person {
  private String email;
  private String password;

  public Person(String email, String password) {
    // this.email = email;
    setEmail(email);
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if (isEmailValid(email)) {
      this.email = email;

    }
    // this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Person [email=" + email + ", password=" + password + ", toString()=" + super.toString() + "]";
  }

  private boolean isEmailValid(String email) {
int indexAt = email.indexOf('@');
int lastAt = email.lastIndexOf('@');
if (indexAt==-1 || indexAt!=lastAt) {return false;}

//2. Точка  после собаки
int dotIndexAfterAt = email.indexOf('.', indexAt+1);
if (dotIndexAfterAt==-1) {return false;}

//3. после послдней точки есть 2 или более символов
int lastDotIndex = email.lastIndexOf('.');
if (lastDotIndex>=email.length()-2) {return false;}

//4.  Алфавит, циыфры, точка, дефис, подчеркивание
// for (int i = 0; i < email.length(); i++) {
//   char c = email.charAt(i);

//string.toCharArray() -> char[]
for (char ch : email.toCharArray()) {

// проверка символа на допустимость
boolean isPass = ch == '-' || ch == '_' || Character.isAlphabetic(ch) || ch == '.'|| ch == '@' || Character.isDigit(ch);
if (!isPass) {return false;}
}


//5. До собаки должен быть хотя бы один символ
if (indexAt==0) {return false;}

//6. Первый символ - должен быть буквой. Символ с индексом 0 - буква
if (!Character.isAlphabetic(email.charAt(0))) {return false;}

// Проверка пароля:
1. Длина пароля не менее 8 символов
2. Пароль содержит хотя бы одну цифру
3. Пароль содержит хотя бы одну букву
4. Пароль содержит хотя бы один спецсимвол
//5. Пароль не содержит пробелов
//6. Пароль не содержит кириллицу
7. Содердит большую букву

Пароль должен удовлетворять всем условиям
5 boolean переменных/флагов Каждая отвечает за свой пункт


    // Все проверки пройдены, емейл подходит
    return true;
  }

}
