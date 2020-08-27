import characterFiles.*;

class dndBuilderMain {
    public static void main(String[] args) {
        PlayerCharacter test = new PlayerCharacter();

        test.addLevel(new CharacterClass("Fighter"));
        test.setCharacterName("Steve");

        System.out.println(test.toString());

    }
}