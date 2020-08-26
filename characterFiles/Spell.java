package characterFiles;

public class Spell {
    private String spellName;
    private int spellLevel;
    private String spellSchool;
    private String castingTime;
    private String spellDescription;
    private boolean prepared;

    /**
     * The fields should be populated by the GUI form
     * @param spellName
     * @param spellLevel
     * @param spellSchool
     * @param castingTime
     * @param spellDescription
     */
    public Spell(String spellName, int spellLevel, String spellSchool, String castingTime, String spellDescription){
        this.spellName = spellName;
        this.spellLevel = spellLevel;
        this.spellSchool = spellSchool;
        this.castingTime = castingTime;
        this.spellDescription = spellDescription;
    }
  
    
    public void togglePrepared(){
        prepared = !prepared;
        //TODO: prepared should have an indicator in GUI
    }
    public String getSpellLevel(){
        if(spellLevel == 0){
            return "Cantrip";
        }
        return (String) spellLevel;
    }
    
    public String toString(){
        return String.format("%s%n", spellName, );
    }
}