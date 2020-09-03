package dndbuilder.view.main_gui;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.InsetsUIResource;

import dndbuilder.control.MainController;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;

public class CharacterHeadingPanel extends JPanel {
    private MainController controller;
    private GridBagConstraints constraints;

    public CharacterHeadingPanel(MainController controller) {
        super(new GridBagLayout());
        this.controller = controller;
        addInfoField("Name", controller.getCharacterComponentString("NAME"));
        addInfoField("Level", controller.getCharacterComponentString("LEVEL"));
        addInfoField("Background", controller.getCharacterComponentString("BACKGROUND"));
        addInfoField("Alignment", controller.getCharacterComponentString("ALIGNMENT"));
    }

    private void addInfoField(String labelName, String fieldName) {
        constraints = new GridBagConstraints();
        constraints.insets = new InsetsUIResource(10, 10, 10, 10);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = .5;
        constraints.weighty = 2;
        constraints.gridy = 0;

        JLabel infoLabel = new JLabel(labelName);
        infoLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        constraints.gridx = getComponentCount() + 1;
        add(infoLabel, constraints);

        JTextField infoField = new JTextField(fieldName);
        infoField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        infoField.setHorizontalAlignment(infoField.CENTER);
        constraints.gridx = getComponentCount() + 1;
        add(infoField, constraints);

    }
}