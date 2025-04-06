package homeworks.hw_49.validator;

/*** Author: Roman Romashko Date: 07.04.2025 ***/

public class PasswordValidateException extends Exception{

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
            return "Password validate exception | "+ super.getMessage();
        }

    public static void main(String[] args) {

    }

}
