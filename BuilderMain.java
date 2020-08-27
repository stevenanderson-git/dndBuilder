import characterFiles.PlayerCharacter;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 * 
 * Main file of the program. Starts and ends the program.
 */
class BuilderMain {
    public static void main(String[] args) {
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

        System.out.println(test.toString());

        System.out.println(test.getSkillName(0));
        System.out.println(test.getSkillName(10));
        System.out.println(test.getSkillName(70));
        System.out.println(test.getSkillName(9));

    }
}