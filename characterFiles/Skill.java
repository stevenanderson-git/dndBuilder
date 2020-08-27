package characterFiles;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 * 
 * Each skill is linked to an attribute. The values for the skillscore are based
 * on attribute.getModifier(), proficiency, and expertiese.
 * 
 * Proficiency bonus is needed as part of the calculation.
 */
public class Skill {
    private Attribute attribute;
    private String skillName;
    private int skillTotal;
    private boolean proficient;
    private boolean expertise;

    public Skill(String skillName, Attribute attribute, int proficiencyBonus) {
        this.skillName = skillName;
        this.attribute = attribute;
        proficient = false;
        expertise = false;
        skillTotal = calculateSkillTotal(proficiencyBonus);
    }

    public int calculateSkillTotal(int proficiencyBonus) {
        skillTotal = attribute.getAttributeModifier();
        // TODO: think of a way to pass in the Proficiency bonus to a skill from
        // character level
        if (proficient)
            skillTotal = skillTotal + proficiencyBonus;
        if (expertise)
            skillTotal = skillTotal + proficiencyBonus;
        return skillTotal;
    }

    public String toString() {
        return String.format("%s [%s]%n", skillName, skillTotal);
    }

    // Method for Proficiency toggle
    public void toggleProficiency(int proficiencyBonus) {
        proficient = !proficient;
        calculateSkillTotal(proficiencyBonus);
    }

    // Method for Expertise toggle
    // TODO: add check to verify player is proficient before allowing expertise
    public void toggleExpertise(int proficiencyBonus) {
        expertise = !expertise;
        calculateSkillTotal(proficiencyBonus);
    }
}