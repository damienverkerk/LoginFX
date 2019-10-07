/**
 * Damien Verkerk
 * OOP1
 * 16-9-2019
 */
package sample;


import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty age;
    private final SimpleStringProperty mail;

    private SimpleStringProperty primary;
    private SimpleStringProperty secondary;

    Person(String id, String name, String age, String mail, String primary, String secondary){

        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.age = new SimpleStringProperty(age);
        this.mail = new SimpleStringProperty(mail);

        this.primary = new SimpleStringProperty(primary);
        this.secondary = new SimpleStringProperty(secondary);

    }

    public String getSecondary() {
        return secondary.get();
    }


    public void setSecondary(String secondary) {
        this.secondary.set(secondary);
    }


    public String getPrimary() {
        return primary.get();
    }


    public void setPrimary(String primary) {
        this.primary.set(primary);
    }


    public String getId(){
        return id.get();
    }

    public void setId(String id){
        this.id.set(id);
    }

    public String getName(){
        return name.get();
    }

    public void setName(String name){
        this.name.set(name);
    }


    public String getAge(){
        return age.get();
    }

    public void setAge(String age){
        this.age.set(age);
    }

    public String getMail(){
        return mail.get();
    }

    public void setMail(String mail){
        this.mail.set(mail);
    }
}
