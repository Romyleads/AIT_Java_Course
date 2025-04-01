package lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*** Author: Roman Romashko Date: 01.04.2025 ***/

public class OptionalExample {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(10, "Peter", 25));
        users.add(new User(11, "Ivan", 15));
    }

    public static void main(String[] args) {

        // Optional<T> - это класс-обертка, который может содержать значение типа Т, а может не содержать (быть пустым)
        // Основная задача - уменьшить количество ошибок, возникающих при обращении к null


        //User user = getById(10);

        //Optional<User> user = getById(10);

        Optional<User> user2 = getById2(10);

       // System.out.println(user2.get());

        // boolean isPresent - мы можем проверить есть ли в обертке значение


        if (user2.isPresent()){
            // NPE
            // System.out.println(user.ge

            User user = user2.get();
            System.out.println("User: "+ user);
            System.out.println("Имя: "+ user.getName());




        } else System.out.println("Пользователь не найден!");


        // boolean isEmpty - вернет true,  если Optional пустой

        // orElse(T defaultValue) - распакует из Optional объект если он есть,
        //


        User current = getById(1).orElse(null);
        System.out.println("Current: "+ current);

        // NPE
        // System.out.println(user.getName());

    }

    /*

    Как создать Optional

    Optional.of(value) - создает Optional, содержащий значение (не пустой / пустой)
    Если передать null -  будет ошибка

    Optional.empty() - создает пустой Optional()

    Optional.ofNullable(value) - создает Optional, который содержит значение или пустой

     */

    // там юзер или null? - Обертка указывает на необходимость проверки на null
    public static Optional<User> getById(int id){

        // Список пользователей
        // Перебираем пользователей, сравниваем id

        for( User user: users){
            if (user.getId() == id) {



                return Optional.of(user);

            }

        }

// TODO

        return Optional.empty();
    }





    public static Optional<User> getById2(int id){

        // Список пользователей
        // Перебираем пользователей, сравниваем id

        User result = null;


        for( User user: users){
            if (user.getId() == id) {

                result = user;

            }

        }

// TODO


        //return Optional.of(result);
        return Optional.ofNullable(result);
    }



}
