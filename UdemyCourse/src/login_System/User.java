package login_System;

public class User {

    // Attributes / Fields
    private final String name;
    private final String surname;
    private final String email;
    private final String username;
    private final String password;

    // Constructor
    public User(String name, String surname, String email, String username, String password){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString(){
        return name + " \n"+ surname + " \n" + email + " \n" + username;
    }
}
