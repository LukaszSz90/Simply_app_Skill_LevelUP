package org.example;


import javax.swing.*;

public class MainMenu {

    private String userName;

    public MainMenu(String userName) {
        this.userName = userName;
    }


    public void displayMenu() {

        boolean isClosed = false;

        while (!isClosed) {

            int userChoice = Integer
                    .parseInt(
                            JOptionPane.showInputDialog(
                                    (MenuPrinter.displayMainMenu())
                            )
                    );

            switch (userChoice) {
                case 1: {

                }
                case 2: {

                }
                case 3: {

                }
                case 0: {
                    JOptionPane.showMessageDialog(null, "Application has been closed");
                    isClosed = true;
                }
            }
        }
        System.exit(0);
    }
}
