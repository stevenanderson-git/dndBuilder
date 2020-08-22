package characterFiles;
public class CharacterClass {
    private String className;
    public CharacterClass(String className){
        this.className = className;
    }
    public String toString(){
        return String.format("%s", className);
    }
    
}