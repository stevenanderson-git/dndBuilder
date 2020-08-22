import characterFiles.*;

class dndBuilderMain{
    public static void main(String[] args) {

        Attribute test2 = new Attribute("Test2", 9);
        System.out.println(test2.toString());

        PlayerCharacter steven = new PlayerCharacter();
        steven.setCharacterName("Steven");
        System.out.println(steven.toString());
    }
}