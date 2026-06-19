package org.example.MenuPanel.MenuOption;

public enum LoginMenu {
    LOGIN(1, "Sign in"),
    REGISTER(2, "Sign up"),
    CLOSE_APPLICATION(0, "Close Application");

    private final int number;
    private final String description;

    LoginMenu(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
