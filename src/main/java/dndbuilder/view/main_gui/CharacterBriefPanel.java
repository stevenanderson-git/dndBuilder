package dndbuilder.view.main_gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.InsetsUIResource;

import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;

public class CharacterBriefPanel extends JPanel {
    private String[] characterShortInfo;
    private GridBagConstraints c;

    public CharacterBriefPanel(String[] characterShortInfo) {
        super(new GridBagLayout());
        this.characterShortInfo = characterShortInfo;
        fillCharacterShortInfo();
    }

    public void fillCharacterShortInfo() {

        for (int i = 0; i < characterShortInfo.length; ++i) {
            c = new GridBagConstraints();
            c.fill = GridBagConstraints.BOTH;
            c.weightx = .5;
            c.weighty = 2;
            c.gridy = 0;
            c.gridx = i;
            c.insets = new InsetsUIResource(10, 10, 10, 10);

            JLabel infoField = new JLabel(characterShortInfo[i]);
            infoField.setFont(new Font("SansSerif", Font.PLAIN, 20));
            infoField.setHorizontalAlignment(infoField.CENTER);
            add(infoField, c);
        }
    }

    public void updateCharacterInfo(String[] characterShortInfo) {
        this.characterShortInfo = characterShortInfo;
    }
}