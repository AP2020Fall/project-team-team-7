package Plato.Model;

import javafx.scene.paint.Stop;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String Id;
    protected String password;
    protected String Email;
    protected String phoneNumber;

    public Person(String firstName, String lastName, String username,
                  String id, String password, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.Id = id;
        this.password = password;
        this.Email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", Id='" + Id + '\'' +
                ", Email='" + Email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}