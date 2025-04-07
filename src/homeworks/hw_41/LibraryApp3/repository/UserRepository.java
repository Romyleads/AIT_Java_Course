package homeworks.hw_41.LibraryApp3.repository;

import homeworks.hw_41.LibraryApp3.model.User;
import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();
    User addUser(String email, String password);

    boolean isEmailExist(String email);

    User getUserByEmail(String email);

    boolean updatePassword(String email, String newPassword);
    boolean deleteUser(String email);





}
