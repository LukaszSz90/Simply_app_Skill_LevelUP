package org.example.MenuPanel.MenuOption;

public enum MainMenuOption {
    VIEW_SKILL_STATISTICS(1, "View skill statistics"),
    ADD_SKILL(2, "Add a new skill"),
    EDIT_SKILL(3, "Edit exising skill"),
    CLOSE_APPLICATION(0, "Close application");

    private final int number;
    private final String description;

    MainMenuOption(int number, String description) {
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
