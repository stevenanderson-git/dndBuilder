package dndbuilder.view.main_gui;

import javax.swing.*;
import dndbuilder.control.MainController;

public class MainGUI extends JFrame {
    private final MainController controller;
    private JFrame frame;

    public MainGUI(MainController controller) {
        this.controller = controller;
        buildFrame();
    }

    /**
     * Shows the GUI.
     */
    public void display() {
        frame.setVisible(true);
    }

    private void buildFrame() {
        frame = new JFrame("Character Builder - by Steven Anderson");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

}