package dndbuilder.view.main_gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import dndbuilder.control.MainController;

public class CharacterSpellsPanel extends JPanel {
    private MainController controller;

    public CharacterSpellsPanel(MainController controller) {
        super(new BorderLayout());
        this.controller = controller;
    }
}
