package homeworks.hw_49.validator;

/*** Author: Roman Romashko Date: 04.04.2025 ***/

// extends RuntimeException = для непроверяемых исключений
// extends Exception = для проверяемых
public class EmailValidateException extends Exception{


    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCouse() - возвращает исключение, которое вызвало текущее исключение
    toString() - строковое представление исключения
    printStackTrace() - выводит трассировку исключения
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage(){
        return "Email validate exception | "+ super.getMessage();
    }

    public static void main(String[] args) {




    }
}
