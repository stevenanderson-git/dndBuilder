package characterFiles;

public class Spell {
    private String spellName;
    private int spellLevel;
    private String spellSchool;
    private String castingTime;
    private String spellDescription;
    private boolean prepared;
    public Spell(String spellName){
        this.spellName = spellName;
    }
    
    //TODO: add a prepared tag on the spell
    public void togglePrepared(){
        prepared = !prepared;
    }
}