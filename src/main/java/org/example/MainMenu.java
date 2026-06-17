package org.example;

import org.example.DatabaseConnection.DMConnection;

import javax.swing.*;
import java.sql.*;

public class MainMenu {

    public void displayMenu() {
        boolean isClosed = false;

        int userID = authenticateOrRegister();


    }

    private int authenticateOrRegister() {

        boolean isClose = false;

        while (!isClose) {
            int choice = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            MenuPrinter.displayWelcomeAndLogIn()
                    )
            );


            switch (choice) {
                case 1: {
                    //Sign in
                    String username = null;

                    String query = "SELECT name FROM user WHERE user = '"
                            + username + "'";

                    try (
                            Connection con = DMConnection.connect();
                            Statement statement = con.createStatement();
                            ) {
                        boolean isUserExist = false;
                        while (!isUserExist) {
                            username = JOptionPane.showInputDialog("Enter your login username: ");

                            isUserExist = statement.execute(query);
                            if (isUserExist) {
                                JOptionPane.showMessageDialog(null, "Login successful!\n" +
                                        " Welcome " + username);
                                String query2 = "SELECT name FROM user WHERE user = '"


                                return
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "User doesn't find");
                            }
                        }



                    } catch (SQLException sqlException) {
                        System.out.println(sqlException.getMessage());
                    }

                } break;
                case 2: {
                    //Sign up

                } break;
                case 0: {
                    //Close Application
                } break;
                default: {
                    JOptionPane.showMessageDialog(null, "Wrong choice, please try again ...");
                }
            }
        }

        return 0;
    }

}
