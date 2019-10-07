/**
 * Damien Verkerk
 * OOP1
 * 16-9-2019
 */
package sample;

public class Admin extends User {
    public Admin(String username, String password){
        super(username,password);
    }


    @Override
    public Menu getMenu(){
        return new AdminMenu();
    }

}
