package spellbuilder;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 */

public class Spell implements Comparable<Spell> {
    private String spellName;
    private int spellLevel;
    private String spellSchool;
    private String castingTime;
    private String spellDescription;
    private boolean prepared;

    public Spell(String spellName, int spellLevel, String spellSchool, String castingTime, String spellDescription) {
        this.spellName = spellName;
        this.spellLevel = spellLevel;
        this.spellSchool = spellSchool;
        this.castingTime = castingTime;
        this.spellDescription = spellDescription;
    }

    public void togglePrepared() {
        prepared = !prepared;
        // TODO: prepared should have an indicator in GUI
    }

    public String getSpellLevel() {
        if (spellLevel == 0) {
            return "Cantrip";
        }
        return String.format("%s", spellLevel);
    }

    public String toString() {
        return String.format("%s%n%s %s%nCasting Time: %s%nPrepared: %s%n%s", spellName, spellSchool, getSpellLevel(),
                castingTime, prepared, spellDescription);
    }

    public String getSpellName() {
        return spellName;
    }

    /**
     * Should compare spells. Spells of same level should be sorted alphabetically
     * 
     * @param spell
     * @return
     */
    @Override
    public int compareTo(Spell spell) {
        // TODO Auto-generated method stub
        if (spell.getSpellLevel().equals(this.getSpellLevel())) {
            return spell.getSpellName().compareToIgnoreCase(this.getSpellName());
        }
        return spell.getSpellLevel().compareToIgnoreCase(this.getSpellLevel());
    }
}