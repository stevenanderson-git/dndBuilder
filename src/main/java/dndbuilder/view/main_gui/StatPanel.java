package dndbuilder.view.main_gui;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

/**
 * StatPanel builds a panel specifically tailored to display character
 * information
 */
public class StatPanel extends JPanel {
    public StatPanel() {
        super(new BorderLayout());
        add(new CharacterBriefPanel(), BorderLayout.NORTH);
    }

    public void addCharacterInfo(String characterInfo) {
        add(new JTextArea(characterInfo), BorderLayout.CENTER);
    }

}