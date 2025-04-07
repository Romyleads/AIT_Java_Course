
package homeworks.hw_41.LibraryApp3.utils;

public class UserValidator {

    public static void validateEmail(String email) throws EmailValidateException {
        if (email == null) throw new EmailValidateException("email should be not null");

        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("@ error");

        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) throw new EmailValidateException("last . domain error");

        for (char ch : email.toCharArray()) {
            boolean isPass = ch == '-' || ch == '_' || Character.isAlphabetic(ch)
                    || ch == '.' || ch == '@' || Character.isDigit(ch);
            if (!isPass) throw new EmailValidateException("illegal symbol error");
        }

        if (indexAt == 0) throw new EmailValidateException("@ should be not first");

        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");
    }

    public static void validatePassword(String password) throws PasswordValidateException {
        if (password == null) throw new PasswordValidateException("password should be not null");

        if (password.length() < 8) throw new PasswordValidateException("password must has min 8 characters");

        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        String specialChars = "!%$@&*()[],.-";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (specialChars.indexOf(ch) != -1) hasSpecial = true;
        }

        if (!hasDigit) throw new PasswordValidateException("password must contain 1 digit");
        if (!hasLower) throw new PasswordValidateException("password must contain 1 lowercase letter");
        if (!hasUpper) throw new PasswordValidateException("password must contain 1 uppercase letter");
        if (!hasSpecial) throw new PasswordValidateException("password must contain 1 special character");
    }
}
