package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class MenuPrinter {

    public static String 

    public static String displayMainMenu() {
        StringBuilder mainMenuText = new StringBuilder();
        mainMenuText.append("     LevelUP your skill app\n" +
                            "--------------------------------------\n");

        Arrays.stream(MainMenuOption.values())
                .sorted(Comparator.comparingInt(a -> a.getNumber() == 0 ? Integer.MAX_VALUE : a.getNumber())
                )
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
