package dndbuilder.characterbuilder;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 */
public class CharacterClass {
    private String className;
    private String classDescription;

    // TODO: add class abilities and modifiers
    // TODO: add subclasses/specializations
    public CharacterClass(String className) {
        this.className = className;
    }

    public String toString() {
        return String.format("%s", className);
    }

}