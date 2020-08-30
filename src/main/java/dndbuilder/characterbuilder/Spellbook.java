package dndbuilder.characterbuilder;

import java.util.ArrayList;
import java.util.Collections;
import dndbuilder.spellbuilder.Spell;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson The Spellbook holds all the
 * spells a player will have. It is possible for a character to have multiple
 * spellbooks depending on classes. In the future, spellbooks will be created
 * based on class/heritage/feats.
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

    @Override
    public String toString() {
        sortSpellBook();
        StringBuilder spellString = new StringBuilder("");
        for (Spell s : spellList) {
            spellString.append(s.toString() + "%n");
        }
        return spellString.toString();
    }
}