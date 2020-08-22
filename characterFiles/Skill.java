package characterFiles;

/**
 * The second most impactful set of numbers on a character. A skill is linked
 * with an attribute to determine the values.
 */
public class Skill {
    private Attribute attribute;
    private String skillName;
    private int skillTotal;
    private boolean proficient;
    private boolean expertise;

    public Skill(String skillName, Attribute attribute) {
        this.skillName = skillName;
        this.attribute = attribute;
        proficient = false;
        expertise = false;
        skillTotal = calculateSkillTotal();
    }

    private int calculateSkillTotal() {
        skillTotal = attribute.getAttributeModifier();
        //TODO: think of a way to pass in the Proficiency bonus to a skill from character level
        if (proficient)
            skillTotal = skillTotal + 1;
        if (expertise)
            skillTotal = skillTotal + 1;
        return skillTotal;
    }
    public String toString(){
        return String.format("Skill: %s [%s]", skillName, skillTotal);
    }

}