package characterFiles;

public class AttributeList {
    /**
     * Use the following numbers to access the correct Attribute 0 - Strength 1 -
     * Dexterity 2 - Constitution 3 - Intelligence 4 - Wisdom 5 - Charisma
     */
    private final Attribute[] attributeList;

    public AttributeList() {
        attributeList = new Attribute[] { new Attribute("Strength", 10), new Attribute("Dexterity", 10),
                new Attribute("Constitution", 10), new Attribute("Intelligence", 10), new Attribute("Wisdom", 10),
                new Attribute("Charisma", 10) };
    }

    /**
     * 
     * @param index
     * @return Attribute at Specified Location
     */
    public Attribute getAttribute(int index) {
        try {
            return attributeList[index];
        } catch (Exception e) {
            System.out.println("Index out of bounds, use 0-5 " + e.toString());
            return null;
        }

    }

    public Attribute getStrength() {
        return attributeList[0];
    }

}