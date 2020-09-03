package dndbuilder.view.main_gui;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


import dndbuilder.control.MainController;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import java.awt.FlowLayout;
import java.awt.Font;

/**
 * StatPanel builds a panel specifically tailored to display character
 * information
 */
public class CharacterOverviewPanel extends JScrollPane {

    private MainController controller;
    private JPanel innerPane;
    private JPanel attributePanel;
    private JPanel skillPanel;
    private JPanel extraPanel;

    public CharacterOverviewPanel(MainController controller) {
        super();
        this.controller = controller;
        buildCharacterOverview();
        updateCharacterOverview();
    }

    /**
     * Call when updates need to be made to the overview panel.
     */
    public void updateCharacterOverview() {
        setViewportView(innerPane);
    }

    private void buildCharacterOverview() {
        innerPane = new JPanel(new FlowLayout());

        buildAttributePanel();
        buildSkillPanel();
        buildExtraPanel();

        innerPane.add(attributePanel);
        innerPane.add(skillPanel);
        innerPane.add(extraPanel);
    }

    private void buildAttributePanel() {
        attributePanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = .5;
        constraints.weighty = .5;

        JPanel strengthPanel = new JPanel(new BorderLayout());
        strengthPanel.add(new JLabel("Strength: " + "Modifier"), BorderLayout.NORTH);
        strengthPanel.add(new JTextField("10"), BorderLayout.CENTER);
        constraints.gridx = 0;
        constraints.gridy = 0;
        attributePanel.add(strengthPanel, constraints);

        JPanel dexterityPanel = new JPanel(new BorderLayout());
        dexterityPanel.add(new JLabel("Dexterity: " + "Modifier"), BorderLayout.NORTH);
        dexterityPanel.add(new JTextField("10"), BorderLayout.CENTER);
        constraints.gridx = 0;
        constraints.gridy = 1;
        attributePanel.add(dexterityPanel, constraints);

        JPanel constitutionPanel = new JPanel(new BorderLayout());
        constitutionPanel.add(new JLabel("Constitution: " + "Modifier"), BorderLayout.NORTH);
        constitutionPanel.add(new JTextField("10"), BorderLayout.CENTER);
        constraints.gridx = 0;
        constraints.gridy = 2;
        attributePanel.add(constitutionPanel, constraints);

        JPanel intelligencePanel = new JPanel(new BorderLayout());
        intelligencePanel.add(new JLabel("Intelligence: " + "Modifier"), BorderLayout.NORTH);
        intelligencePanel.add(new JTextField("10"), BorderLayout.CENTER);
        constraints.gridx = 0;
        constraints.gridy = 3;
        attributePanel.add(intelligencePanel, constraints);

        JPanel wisdomPanel = new JPanel(new BorderLayout());
        wisdomPanel.add(new JLabel("Wisdom: " + "Modifier"), BorderLayout.NORTH);
        wisdomPanel.add(new JTextField("10"), BorderLayout.CENTER);
        constraints.gridx = 0;
        constraints.gridy = 4;
        attributePanel.add(wisdomPanel, constraints);

        JPanel charismaPanel = new JPanel(new BorderLayout());
        charismaPanel.add(new JLabel("Charisma: " + "Modifier"), BorderLayout.NORTH);
        charismaPanel.add(new JTextField("10"), BorderLayout.CENTER);
        constraints.gridx = 0;
        constraints.gridy = 5;
        attributePanel.add(charismaPanel, constraints);
    }

    private void buildSkillPanel() {
        skillPanel = new JPanel();

        JTextArea skillArea = new JTextArea(controller.getCharacterSkills());

        skillPanel.add(skillArea);
    }

    private void buildExtraPanel() {
        extraPanel = new JPanel();

        JTextArea characterText = new JTextArea(controller.getCharacterInfo());
        characterText.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        characterText.setEditable(false);

        extraPanel.add(characterText);
    }
}
