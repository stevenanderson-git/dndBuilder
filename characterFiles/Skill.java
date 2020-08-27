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

    /**
     * Needs integer describing proficiency bonus. This can be found from the
     * levelList.getCharacterLevel() method. Checks if the skill is proficient and
     * expertise.
     * 
     * @param proficiencyBonus
     * @return total value of skill including any bonuses
     */
    public int calculateSkillTotal(int proficiencyBonus) {
        skillTotal = attribute.getAttributeModifier();
        if (proficient)
            skillTotal = skillTotal + proficiencyBonus;
        if (expertise)
            skillTotal = skillTotal + proficiencyBonus;
        return skillTotal;
    }

    public String getSkillName() {
        return skillName;
    }

    @Override
    public String toString() {
        return String.format("%s [%s] Proficient: %s Expertise: %s%n", skillName, skillTotal, proficient, expertise);
    }

    // Method for Proficiency toggle
    public void toggleProficiency(int proficiencyBonus) {
        if (expertise) {
            System.out.println("Toggle expertise first!");
        } else {
            proficient = !proficient;
            calculateSkillTotal(proficiencyBonus);
        }

    }

    // Method for Expertise toggle
    public void toggleExpertise(int proficiencyBonus) {
        // Verify if the skill is already proficient
        if (proficient) {
            expertise = !expertise;
            calculateSkillTotal(proficiencyBonus);
        } else {
            System.out.println("Not proficient");
        }
    }

    /**
     * Access status of Skill Proficiency
     * 
     * @return boolean
     */
    public boolean skillProficient() {
        return proficient;
    }

    /**
     * Access status of Skill Expertise
     * 
     * @return boolean
     */
    public boolean skillExpertise() {
        return expertise;
    }
}