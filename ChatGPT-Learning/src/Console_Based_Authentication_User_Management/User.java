package Console_Based_Authentication_User_Management;

public class User {

    // Field
    private final String username;
    private final String password;

    // Constructor
    public User (String username, String password){
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public String toString(){
        return "User: " + username;
    }
}
