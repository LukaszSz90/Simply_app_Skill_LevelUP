package org.example.MenuPanel;

import org.example.MenuPanel.MenuOption.LoginMenu;
import org.example.MenuPanel.MenuOption.MainMenuOption;

import java.util.Arrays;
import java.util.Comparator;

public class MenuPrinter {

    public static String displayWelcomeAndLogIn() {

        StringBuilder startApplicationText = new StringBuilder();
        startApplicationText
                .append("----Welcome in our application \"LevelUP\"----\n")
                .append("_____________________________________________\n")
                .append("Please Sign in or Sign up to application.\n");

        Arrays.stream(LoginMenu.values())
                .sorted(Comparator.comparingInt(a -> a.getNumber() == 0 ? Integer.MAX_VALUE : a.getNumber()))
                .forEach(option ->{
                    if (option.getNumber() != 0) {
                        startApplicationText.append(option.getNumber()).append(") ").append(option.getDescription()).append("\n");
                    } else {
                        startApplicationText.append("0) ").append(option.getDescription());
                    }
                });

        return startApplicationText.toString();
    }

    public static String displayMainMenu() {
        StringBuilder mainMenuText = new StringBuilder();
        mainMenuText.append("     LevelUP your skill app\n" +
                            "--------------------------------------\n");

        Arrays.stream(MainMenuOption.values())
                .sorted(Comparator.comparingInt(a -> a.getNumber() == 0 ? Integer.MAX_VALUE : a.getNumber()))
                .forEach(option -> {
                    if (option.getNumber() != 0) {
                        mainMenuText.append(option.getNumber()).append(") ").append(option.getDescription()).append("\n");
                    } else {
                        mainMenuText.append("0) ").append(option.getDescription());
                    }
                });
        return mainMenuText.toString();
    }


}
