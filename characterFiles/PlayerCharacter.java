package characterFiles;

import java.util.*;

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
        heritage = new Heritage();
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

    private void updateSkills() {
        for (int i = 0; i < skills.length; ++i) {
            skills[i].calculateSkillTotal(levelList.getProficiencyBonus());
        }
    }

    public void toggleInspiration() {
        inspiration = !inspiration;
        // TODO: send call to control to update visual
    }

    /**
     * Valid indexies are 0, 1, 2, 3, 4, 5
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

    public boolean addLevel(CharacterClass newClass) {
        try {
            levelList.add(newClass);
            // TODO: Roll hit dice, check if spells need to be added
            return true;
        } catch (Exception e) {
            System.out.println("addLevel Error " + e.toString());
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s %nLevel %s %s%nProficiency Bonus: %s%nAttributes:%n%s%nSkills:%n%s",
                getCharacterName(), getCharacterLevel(), levelList.toString(), levelList.getProficiencyBonus(),
                printCharacterAttributes(), printCharacterSkills());
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getCharacterLevel() {
        return levelList.getCharacterLevel();
    }

    public String printCharacterAttributes() {
        StringBuilder attributeString = new StringBuilder("");
        for (int i = 0; i < attributes.length; ++i) {
            attributeString.append(attributes[i].toString());
        }
        return attributeString.toString();
    }

    public String printCharacterSkills() {
        StringBuilder skillString = new StringBuilder("");
        for (int i = 0; i < skills.length; ++i) {
            skillString.append(skills[i].toString());
        }
        return skillString.toString();
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}