package characterFiles;
import java.util.*;


public class PlayerCharacter {
    private int characterLevel;
    private String characterName;
    private ArrayList<Attribute> characterAttributes;
    private ArrayList<Skill> characterSkills;

    // Create an Empty Character
    public PlayerCharacter() {
        characterName = "New Character";
        characterLevel = 1;

        // Initialize and add player attributes to the list
        characterAttributes = new ArrayList();
        Attribute strength = new Attribute("Strength", 20);
        Attribute dexterity = new Attribute("Dexterity", 15);
        Attribute constitution = new Attribute("Constitution", 11);
        Attribute wisdom = new Attribute("Wisdom", 9);
        Attribute intelligence = new Attribute("Intelligence", 8);
        Attribute charisma = new Attribute("Charisma", 5);
        Collections.addAll(characterAttributes, strength, dexterity, constitution, wisdom, intelligence, charisma);

        // Initialize and add Player skills to the list
        characterSkills = new ArrayList();
        Skill acrobatics = new Skill("Acrobatics", dexterity);
        Skill animalHandling = new Skill("Animal Handling", wisdom);
        Skill arcana = new Skill("Arcana", intelligence);
        Skill athletics = new Skill("Athletics", strength);
        Skill deception = new Skill("Deception", charisma);
        Skill history = new Skill("History", intelligence);
        Skill insight = new Skill("Insight", wisdom);
        Skill intimidation = new Skill("Intimidation", charisma);
        Skill investigation = new Skill("Investigation", intelligence);
        Skill medicine = new Skill("Medicine", wisdom);
        Skill nature = new Skill("Nature", intelligence);
        Skill perception = new Skill("Perception", wisdom);
        Skill performance = new Skill("Performance", charisma);
        Skill persuasion = new Skill("Persuasion", charisma);
        Skill religion = new Skill("Religion", intelligence);
        Skill sleightOfHand = new Skill("Sleight of Hand", dexterity);
        Skill stealth = new Skill("Stealth", dexterity);
        Skill survival = new Skill("Survival", wisdom);
        Collections.addAll(characterSkills, acrobatics, animalHandling, arcana, athletics, deception, history, insight,
                intimidation, investigation, medicine, nature, perception, performance, persuasion, religion,
                sleightOfHand, stealth, survival);
    }

    public String toString() {
        return String.format("Name: %s \nLevel: %s\nAttributes:\n %s\nSkills:\n%s", getCharacterName(),
                getCharacterLevel(), getCharacterAttributes().toString(), getCharacterSkills().toString());
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public String getCharacterName() {
        return characterName;
    }

    public List getCharacterAttributes() {
        return characterAttributes;
    }

    public List getCharacterSkills() {
        return characterSkills;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}