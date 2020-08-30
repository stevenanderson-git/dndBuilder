package dndbuilder;

import characterbuilder.PlayerCharacter;
import spellbuilder.SpellScribe;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 * 
 * Main file of the program. Starts and ends the program.
 */
class BuilderMain {
    public static void main(String[] args) {
        testPlayerCharacter();
    }

    private static void testSpellScribe() {
        // TODO: delete after program is complete
        SpellScribe lectern = new SpellScribe();

    }

    private static void testPlayerCharacter() {
        // TODO: Delete this after program is complete
        PlayerCharacter test = new PlayerCharacter();
        test.setCharacterName("Steve");
        test.setAttributeScore(0, 20);
        test.setAttributeScore(1, 12);
        test.setAttributeScore(2, 15);
        test.setAttributeScore(3, 9);
        test.setAttributeScore(4, 11);
        test.setAttributeScore(5, 16);
        test.addLevel("Walrus");
        test.addLevel("Ronin");
        test.addLevel("Fighter");
        test.addLevel("Ranger");
        test.toggleSkillExpertiese(10);
        test.toggleSkillProficiency(9);
        test.toggleSkillExpertiese(9);
        System.out.println(test.toString());
    }
}