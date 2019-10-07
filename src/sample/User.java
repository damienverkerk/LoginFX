/**
 * Damien Verkerk
 * OOP1
 * 16-9-2019
 */
package sample;


public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    Menu getMenu() {
        System.out.println("success");
        return new UserMenu();
    }

    boolean authenticate(String username, String pass) {
        return this.getUsername().equals(username) && this.getPassword().equals(pass);
    }
    public String getUsername() {
        return username;
    }


    void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}