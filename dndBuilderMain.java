import characterFiles.*;

class dndBuilderMain {
    public static void main(String[] args) {
        PlayerCharacter test = new PlayerCharacter();

        test.addLevel(new CharacterClass("Fighter"));
        test.setCharacterName("Steve");
        test.setAttributeScore(0, 20);
        test.setAttributeScore(1, 12);
        test.setAttributeScore(2, 15);
        test.setAttributeScore(3, 9);
        test.setAttributeScore(4, 11);
        test.setAttributeScore(5, 16);

        System.out.println(test.toString());

    }
}