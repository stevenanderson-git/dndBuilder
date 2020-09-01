package dndbuilder;

import java.awt.EventQueue;

import dndbuilder.control.MainController;

/**
 * Version: 0.1.Alpha 2020/08/30
 * 
 * DND builder main class.
 * 
 * @author Steven Anderson
 */
class BuilderMain {
    public static void main(String[] args) {
        MainController controller = new MainController();
        // TODO: Understand the lambda expression for EventQueue
        // https://stackoverflow.com/questions/44665924/java-awt-eventqueue-invokelater-cant-understand-the-syntax
        EventQueue.invokeLater(() -> controller.displayGUI());
    }

    private BuilderMain() {
        // Does nothing, example taken from Carcassonne project
    }
}