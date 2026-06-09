package org.example;

import javax.swing.*;

public class Main {
    static void main() {

        app_start();

    }

    private static void app_start() {
        String userName = "Lukasz";


        MainMenu mainMenu = new MainMenu(userName);

        mainMenu.displayMenu();


    }
}
