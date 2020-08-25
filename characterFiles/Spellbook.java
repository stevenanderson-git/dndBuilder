package characterFiles;
import java.util.*;

public class Spellbook {
    private ArrayList<Spell> spellList;
    public Spellbook(){
        spellList = new ArrayList<>();
    }
    public void sortSpellBook(){
        //TODO: implement sorting by Spell Level
    }
    public boolean addSpell(Spell newSpell){
        //TODO: check that the Contains method properly compares spells based on name
        if(!spellList.contains(newSpell)){
            spellList.add(newSpell);
            return true;
        }
        return false;
    }
}