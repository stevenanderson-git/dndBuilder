package dndbuilder.view.main_gui;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Dimension;

import dndbuilder.control.MainController;

public class MainGUI extends JFrame {
    private static final Dimension MINIMUM_WINDOW_SIZE = new Dimension(500, 500);
    private final MainController controller;
    private JTabbedPane tabbedPane;

    private StatPanel characterStats;

    public MainGUI(MainController controller) {
        this.controller = controller;
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
        addTabbedPane();
        setMinimumSize(MINIMUM_WINDOW_SIZE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void addTabbedPane() {
        tabbedPane = new JTabbedPane();
        tabbedPane.setTabPlacement(JTabbedPane.LEFT);
        characterStats = new StatPanel();
        tabbedPane.add(characterStats, "Character Stats");
        add(tabbedPane, BorderLayout.CENTER);
    }

    public void populateStatPanel() {
        characterStats.addCharacterInfo(controller.getCharacterInfo());
    }
}