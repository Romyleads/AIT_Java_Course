package lesson_49.validator;

/*** Author: Roman Romashko Date: 04.04.2025 ***/

public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {

        // throw - Ключевое слово используется для явного выброса исключения (создание объекта исключения)

        if (email == null) throw new EmailValidateException("email should be not null");

//1. Проверка на наличие одной собачки @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt==-1 || indexAt!=lastAt) throw new EmailValidateException("@ error");

//2. Проверка на точку после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt+1);
        if (dotIndexAfterAt==-1) throw new EmailValidateException(". after @ error");

//3. после последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex>=email.length()-2) throw new EmailValidateException("last . domain error");

//4.  Алфавит, цифры, точка, дефис, подчеркивание, тире
// for (int i = 0; i < email.length(); i++) {
//   char c = email.charAt(i);

//string.toCharArray() -> char[]
        for (char ch : email.toCharArray()) {

// проверка символа на допустимость
            boolean isPass = ch == '-' || ch == '_' || Character.isAlphabetic(ch) || ch == '.'|| ch == '@' || Character.isDigit(ch);
            if (!isPass) throw new EmailValidateException("illegal symbol error");
        }


//5. До собаки должен быть хотя бы один символ
        if (indexAt==0) throw new EmailValidateException("@ should be not first");

//6. Первый символ - должен быть буквой. Символ с индексом 0 - буква
        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

        //return true;
    }

}
