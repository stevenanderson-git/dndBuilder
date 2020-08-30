package dndbuilder.control;

import dndbuilder.view.main_gui.MainGUI;

public class MainController {
    private final MainGUI mainGUI;

    public MainController() {
        mainGUI = new MainGUI(this);
    }

    /**
     * Display GUI.
     */
    public void displayGUI(){
        mainGUI.display();
    }

}