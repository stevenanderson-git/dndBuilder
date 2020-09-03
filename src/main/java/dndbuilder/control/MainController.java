package dndbuilder.control;

import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UIManager;

import dndbuilder.characterbuilder.PlayerCharacter;
import dndbuilder.view.main_gui.MainGUI;

public class MainController {
    private final MainGUI mainGUI;
    private PlayerCharacter playerCharacter;
    private boolean editMode = false;

    public MainController() {
        newCharacter();
        setNimbus();
        mainGUI = new MainGUI(this);

    }

    /**
     * https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/nimbus.html
     */
    private void setNimbus() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
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

    public String getCharacterAttributes() {
        return playerCharacter.getAttributes();
    }

    public String getCharacterSkills() {
        return playerCharacter.getSkills();
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

    public String getCharacterComponentString(String componentName) {
        // TODO: Create this with constants to return the values of the character
        switch (componentName) {
            case ("NAME"):
                return playerCharacter.getCharacterName();
            case ("LEVEL"):
                return playerCharacter.getCharacterLevel();
            case ("ALIGNMENT"):
                return playerCharacter.getCharacterAlignment();
            case ("BACKGROUND"):
                return playerCharacter.getCharacterBackground();
            default:
                return "nullValue - " + componentName;
        }
    }

    public void toggleEditMode() {
        editMode = !editMode;
        if (editMode) {
            System.out.println("Edit mode:" + editMode);
        } else {
            System.out.println("Edit Mode: " + editMode);
        }
    }
}