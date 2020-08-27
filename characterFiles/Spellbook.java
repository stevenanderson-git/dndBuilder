package characterFiles;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 */
public class Spellbook {
    private ArrayList<Spell> spellList;

    public Spellbook() {
        spellList = new ArrayList<>();
    }

    public void sortSpellBook() {
        // TODO: implement sorting by Spell Level
        Collections.sort(spellList);
    }

    public boolean addSpell(Spell newSpell) {
        // TODO: check that the Contains method properly compares spells based on name
        if (!spellList.contains(newSpell)) {
            spellList.add(newSpell);
            sortSpellBook();
            return true;
        }
        return false;
    }
}