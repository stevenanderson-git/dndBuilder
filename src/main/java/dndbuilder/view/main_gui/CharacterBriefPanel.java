package dndbuilder.view.main_gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;

public class CharacterBriefPanel extends JPanel {
    private String[] characterShortInfo = { "No Character Selected", "0", "Lawful Good", "Aristocrat" };

    public CharacterBriefPanel() {
        super(new FlowLayout());
        updateCharacterShortInfo(characterShortInfo);
    }

    public void updateCharacterShortInfo(String[] characterShortInfo) {
        this.characterShortInfo = characterShortInfo;
        for (int i = 0; i < characterShortInfo.length; ++i) {
            add(new JTextField(characterShortInfo[i]));
        }
    }
}