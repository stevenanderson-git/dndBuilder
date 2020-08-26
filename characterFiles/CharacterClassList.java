package characterFiles;

public class CharacterClassList {
    private CharacterClass[] ccl;

    public CharacterClassList() {
        // TODO: implement sorting, level ups, maximum of 20 levels
        ccl = new CharacterClass[20];
    }

    public boolean add(CharacterClass newClass) {
        // TODO: method should throw error if adding class and array is full
        try {
            // implement loop to add the class to the next location in the array
            for (int i = 0; i <= ccl.length; ++i) {
                if (ccl[i] == null) {
                    ccl[i] = newClass;
                    return true;
                }
            }
            // TODO: delete the next line
            System.out.println("Something is wrong");
            return false;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    public String toString(){
        StringBuilder output = new StringBuilder("\n");
        for (int i =0; i < ccl.length; ++i){
            if(ccl[i] != null){
                output.append(ccl[i].toString() + ", ");
            }
        }
        return output.toString();
    }
    public int getCharacterLevel(){
        int totalLevel=0;
        for(int i = 0; i < ccl.length; ++i){
            if(ccl[i] != null){
                ++totalLevel;
            }
        }
        return totalLevel;
    }


}