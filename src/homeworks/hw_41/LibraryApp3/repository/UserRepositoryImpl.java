package homeworks.hw_41.LibraryApp3.repository;

import homeworks.hw_41.LibraryApp3.model.Role;
import homeworks.hw_41.LibraryApp3.model.User;

import java.util.*;
import java.util.stream.Collectors;

public class UserRepositoryImpl implements UserRepository {

    private final Map<String, User> users = new HashMap<>();

    public UserRepositoryImpl() {
        users.put("admin@admin.com", new User("admin@admin.com", "Password123!", Role.ADMIN));
        users.put("user@user.com", new User("user@user.com", "Password123!", Role.USER));
        users.put("user1@library.com", new User("user1@library.com", "Pass123!", Role.USER));
        users.put("user2@library.com", new User("user2@library.com", "Pass123!", Role.USER));
        users.put("user3@library.com", new User("user3@library.com", "Pass123!", Role.USER));
    }

    @Override
    public User addUser(String email, String password) {
        User user = new User(email, password);
        users.put(email, user);
        return user;
    }

    @Override
    public boolean isEmailExist(String email) {
        return users.containsKey(email);
    }

    @Override
    public User getUserByEmail(String email) {
        return users.get(email);
    }

    @Override
    public boolean updatePassword(String email, String newPassword) {
        User user = users.get(email);
        if (user == null) return false;
        try {
            user.setPassword(newPassword);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteUser(String email) {
        return users.remove(email) != null;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public List<User> findByRole(Role role) {
        return users.values().stream()
                .filter(u -> u.getRole() == role)
                .collect(Collectors.toList());
    }
}
