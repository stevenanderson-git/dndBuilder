package dndbuilder.view.main_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import dndbuilder.control.MainController;

public class MainMenuBar extends JMenuBar {
    private final MainController controller;
    private final MainGUI mainGUI;

    public MainMenuBar(MainController controller, MainGUI mainGUI) {
        super();
        this.controller = controller;
        this.mainGUI = mainGUI;
        addFileMenu();
        addSettingsMenu();
        addEditMenu();
    }

    private void addSettingsMenu() {
        JMenu settingsMenu = new JMenu("View");
        settingsMenu.add("Font Size");

        add(settingsMenu);
    }

    private void addEditMenu() {
        JMenu editMenu = new JMenu("Edit");

        JMenuItem editCharacter = new JMenuItem("Edit Character");
        editCharacter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.toggleEditMode();
            }
        });
        editMenu.add(editCharacter);
        add(editMenu);
    }

    private void addFileMenu() {
        JMenu fileMenu = new JMenu("File");

        JMenuItem newCharacter = new JMenuItem("New Character");
        newCharacter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.newCharacter();
            }
        });
        fileMenu.add(newCharacter);

        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(quit);
        add(fileMenu);
    }
}