package characterFiles;
public class CharacterClass {
    private String className;
    private String classDescription;
    //TODO: add class abilities and modifiers
    //TODO: add subclasses/specializations
    public CharacterClass(String className){
        this.className = className;
    }
    public String toString(){
        return String.format("%s", className);
    }
    
}