package homeworks.hw_41.LibraryApp.repository;

import homeworks.hw_41.LibraryApp.model.User;
import homeworks.hw_41.LibraryApp.utils.MyList;

public interface UserRepository {

    MyList<User> getAllUsers();
    User addUser(String email, String password);

    boolean isEmailExist(String email);

    User getUserByEmail(String email);

    boolean updatePassword(String email, String newPassword);
    boolean deleteUser(String email);





}
