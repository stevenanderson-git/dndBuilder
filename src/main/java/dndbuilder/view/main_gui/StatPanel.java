package dndbuilder.view.main_gui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import dndbuilder.control.MainController;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

/**
 * StatPanel builds a panel specifically tailored to display character
 * information
 */
public class StatPanel extends JPanel {
    private JScrollPane characterStats;
    private JTextArea characterText;
    private MainController controller;

    public StatPanel(CharacterBriefPanel cbp, MainController controller) {
        super(new BorderLayout());
        this.controller = controller;
        add(cbp, BorderLayout.NORTH);
        buildStatArea();
        characterText.setText(controller.getCharacterInfo());
    }

    public void updateCharacterInfo() {
        characterText.setText(controller.getCharacterInfo());
    }

    private void buildStatArea() {
        characterText = new JTextArea();
        characterText.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        characterText.setEditable(false);
        characterStats = new JScrollPane(characterText);
        characterStats.setBorder(BorderFactory.createLoweredBevelBorder());
        add(characterStats, BorderLayout.CENTER);
    }

}