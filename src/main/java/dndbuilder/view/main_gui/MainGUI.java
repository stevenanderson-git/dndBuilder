package dndbuilder.view.main_gui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import dndbuilder.control.MainController;

public class MainGUI extends JFrame {
    private static final Dimension MINIMUM_WINDOW_SIZE = new Dimension(500, 500);
    private final MainController controller;
    private CharacterBriefPanel cbp;

    private JPanel characterStats;

    public MainGUI(MainController controller) {
        this.controller = controller;
        // cbp will be at the top of most of the panes
        cbp = new CharacterBriefPanel(controller.getCharacterShortInfo());
        buildFrame();
    }

    /**
     * Shows the GUI.
     */
    public void display() {
        setVisible(true);
    }

    /**
     * Constructs the default frame that elements will be placed in.
     */
    private void buildFrame() {
        setJMenuBar(new MainMenuBar(controller, this));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        addStatPanel();
        setMinimumSize(MINIMUM_WINDOW_SIZE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void addStatPanel() {
        characterStats = new StatPanel(cbp, controller);
        //ImageIcon statIcon = createImage
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.add(characterStats);
        add(tabbedPane, BorderLayout.CENTER);
    }
}