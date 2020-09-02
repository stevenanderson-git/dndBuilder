package dndbuilder.control;

import dndbuilder.characterbuilder.PlayerCharacter;
import dndbuilder.view.main_gui.MainGUI;

public class MainController {
    private final MainGUI mainGUI;
    private PlayerCharacter playerCharacter;

    public MainController() {
        newCharacter();
        mainGUI = new MainGUI(this);

    }

    /**
     * Display GUI.
     */
    public void displayGUI() {
        mainGUI.display();
    }

    public String getCharacterInfo() {
        return playerCharacter.toString();
    }

    /**
     * TODO: Add actions to a separate class maybe?
     */
    public void newCharacter() {
        // TODO: Add check to save if a character is !null
        playerCharacter = new PlayerCharacter();
    }

    public String[] getCharacterShortInfo() {
        return playerCharacter.getCharacterShortInfo();
    }
}