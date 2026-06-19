package org.example.MenuPanel;

import org.example.MenuPanel.AuthenticationClass.UserLogIn;

import javax.swing.*;

public class MainMenu {

    public void displayMenu() {
        boolean isClosed = false;

        int userID = authenticateOrRegister();



    }

    private int authenticateOrRegister() {

        while (true) {
            int choice = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            MenuPrinter.displayWelcomeAndLogIn()
                    )
            );


            switch (choice) {
                case 1: {
                    UserLogIn sigIn = new UserLogIn();
                    Integer userId = sigIn.signInUser();

                    if (userId > 0) {
                        return userId;
                    }
                } break;
                case 2: {
                    //Sign up

                }
                break;
                case 0: {
                    //Close Application
                    JOptionPane.showMessageDialog(null, "Application is closed");
                    System.exit(0);
                }
                break;
                default: {
                    JOptionPane.showMessageDialog(null, "Wrong choice, please try again ...");
                }
            }
        }

    }

}
