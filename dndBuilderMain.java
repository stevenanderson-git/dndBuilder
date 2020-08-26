import characterFiles.*;

class dndBuilderMain{
    public static void main(String[] args) {
        PlayerCharacter test = new PlayerCharacter();
        
        test.addCharacterClass("Ranger");
        test.addCharacterClass("Fighter");
        test.addCharacterClass("Fighter");
        test.addCharacterClass("Cleric");
        test.addCharacterClass("Barbarian");
        test.addCharacterClass("Bard");
        test.addCharacterClass("Paladin");

        test.setCharacterName("Steve");

        System.out.println(test.toString());


    }
}