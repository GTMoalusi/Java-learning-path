package Console_Based_Authentication_User_Management;

import java.util.HashMap;
import java.util.Map;

public class AuthService {

    // Fields
    private final Map<String, User> users;
    private User currentUser;

    // Constructor
    public AuthService(){
        this.users = new HashMap<>();
        this.currentUser = null;
    }

    // Unique Methods
    public void register(String username, String password){
        if (username == null || username.trim().isEmpty()){
            throw new IllegalArgumentException("Username cannot be empty.");
        }

        if (password == null || password.trim().isEmpty()){
            throw new IllegalArgumentException("Password cannot be empty.");
        }

        if (password.length() < 8){
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }

        if (users.containsKey(username)){
            throw new IllegalArgumentException("User already exists.");
        }

        User user = new User(username, password);

        users.put(username, user);
    }

    public void login(String username, String password){
        if (currentUser != null){
            throw new IllegalStateException("A user is already logged in.");
        }

        if (!users.containsKey(username)){
            throw new IllegalArgumentException("No user of that username.");
        }

        User user = users.get(username);

        if (!user.getPassword().equals(password)){
            throw new IllegalArgumentException("Invalid password.");
        }

        currentUser = user;
    }

    public void logout(){
        if (currentUser == null){
            throw new IllegalStateException("No user is logged in.");
        }

        currentUser = null;
    }

    // Getter
    public User getCurrentUser(){
        return currentUser;
    }
}
