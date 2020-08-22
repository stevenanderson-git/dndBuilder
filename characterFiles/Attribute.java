package characterFiles;

/**
 * The Attribute is the basis of all character stats.
 * Most character features are based from the Attribute Class.
 */

public class Attribute {
    private String attributeName;
    private int attributeScore;
    private int attributeModifier;
    // Create an Empty attribute. Requires a Name. the modifier is calculated.
    // public Attribute(String attributeName) {
    // this.attributeName = attributeName;
    // attributeScore = 10;
    // attributeModifier = calculateModifier(attributeScore);
    // }

    // Create an attribute taking a String and int, the modifier is calculated.
    public Attribute(String attributeName, int attributeScore) {
        this.attributeName = attributeName;
        this.attributeScore = attributeScore;
        attributeModifier = calculateModifier(attributeScore);
    }

    // Calculates modifier based on score, if the mod is >=10 the result is
    // positive, otherwise negative
    private int calculateModifier(int score) {
        if (score >= 10)
            return (int) Math.floor((score - 10) / 2);
        else
            return (int) Math.floor((score - 10.1) / 2);
    }

    public String getAttributeName() {
        return attributeName;
    }

    public int getAttributeScore() {
        return attributeScore;
    }

    public int getAttributeModifier() {
        return attributeModifier;
    }

    public String toString() {
        return String.format("%s [%s]\t%s", attributeName, attributeScore, attributeModifier);
    }
}