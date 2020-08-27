package characterFiles;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 * 
 * The player character class directly interfaces with the GUI. It should be the
 * only class that requires access. All accessor and mutators are in the player
 * character class.
 */

public class PlayerCharacter {
    private Boolean inspiration;
    private String characterName;
    private Heritage heritage;
    private Attribute[] attributes;
    private Skill[] skills;
    private Spellbook spellbook;
    private LevelList levelList;

    // Create a Default Character
    public PlayerCharacter() {
        characterName = "New Character";
        levelList = new LevelList();
        spellbook = new Spellbook();
        heritage = new Heritage("Human");
        // Initialize and add player attributes to the array
        Attribute strength = new Attribute("Strength", 10);
        Attribute dexterity = new Attribute("Dexterity", 10);
        Attribute constitution = new Attribute("Constitution", 10);
        Attribute intelligence = new Attribute("Intelligence", 10);
        Attribute wisdom = new Attribute("Wisdom", 10);
        Attribute charisma = new Attribute("Charisma", 10);
        attributes = new Attribute[] { strength, dexterity, constitution, intelligence, wisdom, charisma };

        // Initialize and add Player skills to the array
        Skill acrobatics = new Skill("Acrobatics", attributes[1], levelList.getProficiencyBonus());
        Skill animalHandling = new Skill("Animal Handling", attributes[4], levelList.getProficiencyBonus());
        Skill arcana = new Skill("Arcana", attributes[3], levelList.getProficiencyBonus());
        Skill athletics = new Skill("Athletics", attributes[0], levelList.getProficiencyBonus());
        Skill deception = new Skill("Deception", attributes[5], levelList.getProficiencyBonus());
        Skill history = new Skill("History", attributes[3], levelList.getProficiencyBonus());
        Skill insight = new Skill("Insight", attributes[4], levelList.getProficiencyBonus());
        Skill intimidation = new Skill("Intimidation", attributes[5], levelList.getProficiencyBonus());
        Skill investigation = new Skill("Investigation", attributes[3], levelList.getProficiencyBonus());
        Skill medicine = new Skill("Medicine", attributes[4], levelList.getProficiencyBonus());
        Skill nature = new Skill("Nature", attributes[3], levelList.getProficiencyBonus());
        Skill perception = new Skill("Perception", attributes[4], levelList.getProficiencyBonus());
        Skill performance = new Skill("Performance", attributes[5], levelList.getProficiencyBonus());
        Skill persuasion = new Skill("Persuasion", attributes[5], levelList.getProficiencyBonus());
        Skill religion = new Skill("Religion", attributes[3], levelList.getProficiencyBonus());
        Skill sleightOfHand = new Skill("Sleight of Hand", attributes[1], levelList.getProficiencyBonus());
        Skill stealth = new Skill("Stealth", attributes[1], levelList.getProficiencyBonus());
        Skill survival = new Skill("Survival", attributes[4], levelList.getProficiencyBonus());
        skills = new Skill[] { acrobatics, animalHandling, arcana, athletics, deception, history, insight, intimidation,
                investigation, medicine, nature, perception, performance, persuasion, religion, sleightOfHand, stealth,
                survival };
    }

    /**
     * Valid indexies are 0 -> 5
     * 
     * @param attributeIndex
     * @param attributeScore
     */
    public void setAttributeScore(int attributeIndex, int attributeScore) {
        try {
            attributes[attributeIndex].setScore(attributeScore);
            updateSkills();
        } catch (Exception e) {
            System.out.println("Invalid Index " + e.toString());
        }
    }

    /**
     * Call when all skills need to be updated from a change
     */
    private void updateSkills() {
        for (int i = 0; i < skills.length; ++i) {
            skills[i].calculateSkillTotal(levelList.getProficiencyBonus());
        }
    }

    /**
     * Accessor method for GUI, valid indexies are 0 -> 17
     * 
     * @param skillIndex
     * @return skillName
     */
    public String getSkillName(int skillIndex) {
        try {
            return skills[skillIndex].getSkillName();
        } catch (Exception e) {
            // TODO: handle exception
            return "Array out of bounds " + e.toString();
        }
    }

    /**
     * Accessor method for GUI, valid indexies are 0 -> 17
     * 
     * @param skillIndex
     * @return skillScore
     */
    public String getSkillScore(int skillIndex) {
        try {
            return String.valueOf(skills[skillIndex].calculateSkillTotal(levelList.getProficiencyBonus()));
        } catch (Exception e) {
            // TODO: handle exception
            return "Array out of bounds " + e.toString();
        }
    }

    /**
     * Access skill Proficiency for GUI. Valid indexies are 0 -> 17
     * 
     * @param skillIndex
     * @return boolean
     */
    public boolean skillProficient(int skillIndex) {
        return skills[skillIndex].skillProficient();
    }

    /**
     * Access Skill Expertise for GUI. Valid indexies are 0 -> 17
     * 
     * @param skillIndex
     * @return boolean
     */
    public boolean skillExpertise(int skillIndex) {
        return skills[skillIndex].skillExpertise();
    }

    /**
     * Accessor method for gui, valid indexies are 0 -> 17
     * 
     * @param skillIndex
     */
    public void toggleSkillProficiency(int skillIndex) {
        try {
            skills[skillIndex].toggleProficiency(levelList.getProficiencyBonus());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());
        }
    }

    /**
     * Accessor method for gui, valid indexies are 0 - skillIndex.length
     * 
     * @param skillIndex
     */
    public void toggleSkillExpertiese(int skillIndex) {
        try {
            skills[skillIndex].toggleExpertise(levelList.getProficiencyBonus());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());
        }
    }

    /**
     * Input a string for a class. Future implementation will ask to create a new
     * class or will find existing classes from memory
     * 
     * @param className
     * @return returns true if successful, false if max levels
     */
    public boolean addLevel(String className) {
        // TODO: add more depth to character class system. import of various classes
        // have classes be handled independently, possibly by adding them into a
        // classesFolder
        try {
            levelList.add(new CharacterClass(className));
            // TODO: Roll hit dice, check if spells need to be added
            return true;
        } catch (Exception e) {
            System.out.println("addLevel Error " + e.toString());
            return false;
        }
    }

    /**
     * Mutator method to change character name
     * 
     * @param characterName
     */
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    /**
     * Accessor Method for GUI
     * 
     * @return String Character Name
     */
    public String getCharacterName() {
        return characterName;
    }

    /**
     * Accessor method for GUI
     * 
     * @return String of the Character Level
     */
    public String getCharacterLevel() {
        return String.valueOf(levelList.getCharacterLevel());
    }

    /**
     * Inspration cannot stack
     */
    public void toggleInspiration() {
        inspiration = !inspiration;
        // TODO: send call to control to update visual
    }

    /**
     * Iterate through an array
     * 
     * @return StringBuilder String of Objects' toString
     */
    private String printArray(Object[] o) {
        StringBuilder arrayString = new StringBuilder("");
        for (int i = 0; i < o.length; ++i) {
            arrayString.append(o[i].toString());
        }
        return arrayString.toString();
    }

    @Override
    public String toString() {
        return String.format("Name: %s %nLevel %s %s%nProficiency Bonus: %s%nAttributes:%n%s%nSkills:%n%s",
                getCharacterName(), getCharacterLevel(), levelList.toString(), levelList.getProficiencyBonus(),
                printArray(attributes), printArray(skills));
    }
}