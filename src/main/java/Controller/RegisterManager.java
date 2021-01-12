package Controller;

import Model.Admin;
import Model.Person;
import Model.Player;
import View.AccountMenu;
import View.RegisterMenu;

public class RegisterManager extends Manager{

    public RegisterManager() {
        menu = new RegisterMenu(this);

    }


    public String createNewAccount(String username, String password, String email, String fName, String lName, String phoneNum) {
        if (!isInputValid(email, phoneNum)){
            return "invalid input";
        }
        if (Person.isPeopleEmpty()){
            Admin admin = new Admin(username, password, email, fName, lName, phoneNum);
        } else {
            Player player = new Player(username, password, email, fName, lName, phoneNum);
        }
        return "register successfully";
    }

    private boolean isInputValid(String email, String phoneNum){
        if (!checkEmail(email)){
            return false;
        }
        if (!checkPhoneNumber(phoneNum)){
            return false;
        }
        return true;
    }
}