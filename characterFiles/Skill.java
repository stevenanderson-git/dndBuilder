package characterFiles;

/**
 * The second most impactful set of numbers on a character. A skill is linked
 * with an attribute to determine the values.
 */
public class Skill {
    private Attribute attribute;
    private int proficiencyBonus;
    private String skillName;
    private int skillTotal;
    private boolean proficient;
    private boolean expertise;

    public Skill(String skillName, Attribute attribute, int proficiencyBonus) {
        this.skillName = skillName;
        this.attribute = attribute;
        this.proficiencyBonus = proficiencyBonus;
        proficient = false;
        expertise = false;
        skillTotal = calculateSkillTotal();
    }

    public int calculateSkillTotal() {
        skillTotal = attribute.getAttributeModifier();
        //TODO: think of a way to pass in the Proficiency bonus to a skill from character level
        if (proficient)
            skillTotal = skillTotal + proficiencyBonus;
        if (expertise)
            skillTotal = skillTotal + proficiencyBonus;
        return skillTotal;
    }
    public String toString(){
        return String.format("%s [%s]%n", skillName, skillTotal);
    }
    public void toggleProficiency(){
        if(proficient) proficient = false;
        else proficient = true;
    }

}