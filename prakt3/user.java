package prakt3;

public class user {
    public String username;
    public String email;
    public String password;
    public String name;

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name);
    }

    public user (String username, String email) {
        this.username = username;
        this.email = email;
        this.password = "polinema123";
    }
}