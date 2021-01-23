package Plato.View;

import Plato.Controller.AdminPageManager;
import Plato.Controller.Manager;
import Plato.Controller.RegisterManager;
import Plato.Model.Person;
import Plato.Controller.MainPageManager;
//salam test

public class RegisterMenu extends Menu {
    public RegisterMenu(Manager manager) {
        super(manager);
        showRegisterMenu();
    }

    private void showRegisterMenu() {
        System.out.println("write back to return!");
        System.out.println("username:");
        String username = scanner.nextLine();
        if (username.equalsIgnoreCase("back")) {
            returnAccountMenu();
        }
        while (manager.isThisUsernameExist(username)) {
            System.err.println("this username is already taken!");
            System.out.println("username:");
            username = scanner.nextLine();
            if (username.equalsIgnoreCase("back")) {
                returnAccountMenu();
            }
        }
        System.out.println("password:");
        String password = scanner.nextLine();
        if (password.equalsIgnoreCase("back")) {
            returnAccountMenu();
        }
        System.out.println("Email:");
        String email = scanner.nextLine();
        if (email.equalsIgnoreCase("back")) {
            returnAccountMenu();
        }
        while (!manager.checkEmail(email)) {
            System.err.println("invalid input, try again!");
            email = scanner.nextLine();
            if (email.equalsIgnoreCase("back")) {
                returnAccountMenu();
            }
        }
        System.out.println("first name:");
        String fName = scanner.nextLine();
        if (fName.equalsIgnoreCase("back")) {
            returnAccountMenu();
        }
        System.out.println("last name:");
        String lName = scanner.nextLine();
        if (lName.equalsIgnoreCase("back")) {
            returnAccountMenu();
        }
        System.out.println("phone number:");
        String phoneNum = scanner.nextLine();
        if (phoneNum.equalsIgnoreCase("back")) {
            returnAccountMenu();
        }
        while (!manager.checkPhoneNumber(phoneNum)) {
            System.err.println("invalid input, try again!");
            phoneNum = scanner.nextLine();
            if (phoneNum.equalsIgnoreCase("back")) {
                returnAccountMenu();
            }
        }
        ((RegisterManager) manager).createNewAccount(username, password, email, fName, lName, phoneNum);
        System.out.println("successfully register " + manager.getPerson().getUsername() + "\nhello " + fName);
        if (Person.getPeople().size() > 1) {
            manager = new MainPageManager();
        } else {
            System.out.println("Admin");
            manager = new AdminPageManager();
        }
    }

}