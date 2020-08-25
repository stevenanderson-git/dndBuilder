package characterFiles;

import java.util.*;

public class PlayerCharacter {
    private int characterLevel;
    private int proficiencyBonus;
    private ArrayList<CharacterClass> characterClasses;
    private String characterName;
    private ArrayList<Attribute> characterAttributes;
    private ArrayList<Skill> characterSkills;
    private Spellbook spellbook;

    // Create a Default Character
    public PlayerCharacter() {
        characterName = "New Character";
        characterClasses = new ArrayList<>();
        characterClasses.add(new CharacterClass("Fighter"));
        calculateCharacterLevel();
        calculateProficiencyBonus();
        spellbook = new Spellbook();


        // Initialize and add player attributes to the list
        characterAttributes = new ArrayList<>();
        Attribute strength = new Attribute("Strength", 10);
        Attribute dexterity = new Attribute("Dexterity", 10);
        Attribute constitution = new Attribute("Constitution", 10);
        Attribute wisdom = new Attribute("Wisdom", 10);
        Attribute intelligence = new Attribute("Intelligence", 10);
        Attribute charisma = new Attribute("Charisma", 10);
        Collections.addAll(characterAttributes, strength, dexterity, constitution, wisdom, intelligence, charisma);

        // Initialize and add Player skills to the list
        characterSkills = new ArrayList<>();
        Skill acrobatics = new Skill("Acrobatics", dexterity, proficiencyBonus);
        Skill animalHandling = new Skill("Animal Handling", wisdom, proficiencyBonus);
        Skill arcana = new Skill("Arcana", intelligence, proficiencyBonus);
        Skill athletics = new Skill("Athletics", strength, proficiencyBonus);
        Skill deception = new Skill("Deception", charisma, proficiencyBonus);
        Skill history = new Skill("History", intelligence, proficiencyBonus);
        Skill insight = new Skill("Insight", wisdom, proficiencyBonus);
        Skill intimidation = new Skill("Intimidation", charisma, proficiencyBonus);
        Skill investigation = new Skill("Investigation", intelligence, proficiencyBonus);
        Skill medicine = new Skill("Medicine", wisdom, proficiencyBonus);
        Skill nature = new Skill("Nature", intelligence, proficiencyBonus);
        Skill perception = new Skill("Perception", wisdom, proficiencyBonus);
        Skill performance = new Skill("Performance", charisma, proficiencyBonus);
        Skill persuasion = new Skill("Persuasion", charisma, proficiencyBonus);
        Skill religion = new Skill("Religion", intelligence, proficiencyBonus);
        Skill sleightOfHand = new Skill("Sleight of Hand", dexterity, proficiencyBonus);
        Skill stealth = new Skill("Stealth", dexterity, proficiencyBonus);
        Skill survival = new Skill("Survival", wisdom, proficiencyBonus);
        Collections.addAll(characterSkills, acrobatics, animalHandling, arcana, athletics, deception, history, insight,
                intimidation, investigation, medicine, nature, perception, performance, persuasion, religion,
                sleightOfHand, stealth, survival);
    }

    private void calculateCharacterLevel() {
        characterLevel = characterClasses.size();
    }

    private void calculateProficiencyBonus() {
        switch (characterLevel) {
            case 1:
            case 2:
            case 3:
            case 4:
                proficiencyBonus = 2;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                proficiencyBonus = 3;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                proficiencyBonus = 4;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                proficiencyBonus = 5;
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                proficiencyBonus = 6;
                break;
            default:
                proficiencyBonus = 2;
        }
    }

    public String toString() {
        return String.format("Name: %s \nLevel %s %s%nProficiency Bonus: %s%nAttributes:%n%s%nSkills:%n%s", getCharacterName(),
                getCharacterLevel(), getCharacterClass(), proficiencyBonus, printCharacterAttributes(), printCharacterSkills());
    }

    public String getCharacterClass() {
        return characterClasses.toString();
    }

    public void addCharacterClass(String className) {
        characterClasses.add(new CharacterClass(className));
        calculateCharacterLevel();
        calculateProficiencyBonus();
        updateSkills();

    }

    public void updateSkills() {
        for (Skill skill : characterSkills) {
            skill.calculateSkillTotal();
        }
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public List getCharacterAttributes() {
        return characterAttributes;
    }

    public String printCharacterAttributes() {
        String output = "";
        for (Attribute attribute : characterAttributes) {
            output = output + attribute.toString();
        }
        return output;
    }

    public List getCharacterSkills() {
        return characterSkills;
    }

    public String printCharacterSkills() {
        String output = "";
        for (Skill skill : characterSkills) {
            output = output + skill.toString();
        }
        return output;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}