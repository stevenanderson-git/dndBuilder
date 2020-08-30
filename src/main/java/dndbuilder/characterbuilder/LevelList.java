package characterbuilder;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 * 
 * The LevelList will hold all the classes and levels to a maximum of 20
 * 
 */
public class LevelList {
    private CharacterClass[] classList;

    public LevelList() {
        // TODO: implement sorting, level ups, maximum of 20 levels
        classList = new CharacterClass[20];
    }

    public boolean add(CharacterClass newClass) {
        // TODO: method should throw error if adding class and array is full
        try {
            // implement loop to add the class to the next location in the array
            for (int i = 0; i < classList.length; ++i) {
                if (classList[i] == null) {
                    classList[i] = newClass;
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

    @Override
    public String toString() {
        //TODO: have a better output to show how many levels of each class
        StringBuilder output = new StringBuilder("\n");
        for (int i = 0; i < classList.length; ++i) {
            if (classList[i] != null) {
                output.append(classList[i].toString() + ", ");
            }
        }
        return output.toString();
    }

    /**
     * Iterates the levelList
     * 
     * @return character level as an int
     */
    public int getCharacterLevel() {
        int totalLevel = 0;
        for (int i = 0; i < classList.length; ++i) {
            if (classList[i] != null) {
                ++totalLevel;
            }
        }
        return totalLevel;
    }

    /**
     * Proficiency bonus is based on character level.
     * 
     * @return int value of proficiency bonus
     */
    public int getProficiencyBonus() {
        switch (getCharacterLevel()) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 2;
            case 5:
            case 6:
            case 7:
            case 8:
                return 3;
            case 9:
            case 10:
            case 11:
            case 12:
                return 4;
            case 13:
            case 14:
            case 15:
            case 16:
                return 5;
            case 17:
            case 18:
            case 19:
            case 20:
                return 6;
            default:
                return 2;
        }
    }
}