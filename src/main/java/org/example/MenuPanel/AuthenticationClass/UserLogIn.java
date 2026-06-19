package org.example.MenuPanel.AuthenticationClass;

import org.example.DatabaseConnection.DMConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserLogIn {

    public Integer signInUser() {
        //Sign in
        String query = "SELECT ID FROM user WHERE NAME = ?";
        int userID = -1;

        try (
                Connection con = DMConnection.connect();
                PreparedStatement statement = con.prepareStatement(query)
        ) {
            String username = JOptionPane.showInputDialog("Enter your login username: ");

            statement.setString(1, username);

            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    userID = rs.getInt(1);

                    JOptionPane.showMessageDialog(null, "Login successful!\n" +
                            " Welcome " + username);


                    return userID;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "User doesn't find");
                }
            }

        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        return userID;
    }
}
