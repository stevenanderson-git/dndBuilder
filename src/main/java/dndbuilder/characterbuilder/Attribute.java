package dndbuilder.characterbuilder;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 * 
 * The Attribute is the basis of all character stats. Most character features
 * are based from the Attribute Class.
 */

public class Attribute {
    private String attributeName;
    private int attributeScore;
    private int attributeModifier = 0;

    // Create an attribute taking a String and int, the modifier is calculated.
    public Attribute(String attributeName, int attributeScore) {
        this.attributeName = attributeName;
        this.attributeScore = attributeScore;
        updateModifier();
    }

    public void setScore(int newScore) {
        attributeScore = newScore;
        updateModifier();
    }

    /**
     * Update the modifier. Call this each time the score changes.
     */
    private void updateModifier() {
        attributeModifier = Math.floorDiv((attributeScore - 10),2);
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
        return String.format("%s [%s] %s%n", getAttributeName(), getAttributeScore(), getAttributeModifier());
    }
}