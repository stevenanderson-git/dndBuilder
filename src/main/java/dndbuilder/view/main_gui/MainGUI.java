package dndbuilder.view.main_gui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import dndbuilder.control.MainController;

public class MainGUI extends JFrame {
    private static final Dimension MINIMUM_WINDOW_SIZE = new Dimension(1200, 800);
    private final MainController controller;
    private JTabbedPane mainTabbedPane;
    private CharacterHeadingPanel characterHeadingPanel;
    private CharacterOverviewPanel overviewPanel;
    private CharacterSpellsPanel characterSpells;

    public MainGUI(MainController controller) {
        this.controller = controller;
        buildFrame();
        populateTabbedPanes();

    }

    /**
     * Shows the GUI.
     */
    public void display() {
        setVisible(true);
    }

    /**
     * Creates a frame and mainTabbedPane for containters to be placed in
     */
    private void buildFrame() {
        setJMenuBar(new MainMenuBar(controller, this));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        characterHeadingPanel = new CharacterHeadingPanel(controller);
        add(characterHeadingPanel, BorderLayout.NORTH);

        mainTabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
        mainTabbedPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        add(mainTabbedPane, BorderLayout.CENTER);
        setMinimumSize(MINIMUM_WINDOW_SIZE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void populateTabbedPanes() {
        
        // Add Stat Pane
        overviewPanel = new CharacterOverviewPanel(controller);
        mainTabbedPane.addTab("Overview", overviewPanel);
        // Add Spell Pane
        characterSpells = new CharacterSpellsPanel(controller);
        mainTabbedPane.addTab("Spells", characterSpells);
    }

    /**
     * Example taken from
     * https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html Not
     * currently used
     * 
     * @param path
     * @return image icon or null
     */
    private ImageIcon createImageIcon(String path) {
        // TODO: currently not working
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}