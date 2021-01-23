package Plato.Controller;

import Plato.Model.Admin;
import Plato.Model.Person;
import Plato.Model.Player;
import Plato.View.RegisterMenu;

public class RegisterManager extends Manager {

    public RegisterManager() {
        menu = new RegisterMenu(this);

    }

    public Person createNewAccount(String username, String password, String email, String fName, String lName, String phoneNum) {
        if (isThisAdmin()) {
            Admin admin = new Admin(username, password, email, fName, lName, phoneNum);
            setPerson(admin);
            setAdmin(admin);
            return admin;
        } else {
            Player player = new Player(username, password, email, fName, lName, phoneNum);
            setPerson(player);
            setCurrentPlayer(player);
            players.add(player);
            return player;
        }
    }

    public boolean isThisAdmin() {
        return Person.getPeople().isEmpty();
    }

}