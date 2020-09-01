package dndbuilder.characterbuilder;

public class CharacterAlignment {
    private static final String[][] alignmentOptions = { { "Lawful ", "Neutral ", "Chaotic " },
            { "Good", "Neutral", "Evil" } };
    private String alignmentValue;

    public CharacterAlignment(String alignmentValue) {
        this.alignmentValue = alignmentValue;
    }

    public void changeAlignment(int gne, int lnc) {
        this.alignmentValue = alignmentValue;
    }

    public String toString() {
        return alignmentValue;
    }
}
