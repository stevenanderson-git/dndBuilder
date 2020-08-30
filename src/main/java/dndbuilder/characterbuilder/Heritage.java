package dndbuilder.characterbuilder;

/**
 * Version: 0.1.Alpha 2020/08/27 Steven Anderson
 * 
 * Heritage was known as Race in previous versions of D&D
 */
public class Heritage {
    // TODO: change race to use an interface
    private String heritageName;
    private String heritageDescription;

    public Heritage(String heritageName) {
        this.heritageName = heritageName;
        heritageDescription = "Empty - Please add Details";
    }

    public String getHeritageName() {
        return heritageName;
    }

    public void setHeritageName(String heritageName) {
        this.heritageName = heritageName;
    }

    public String getHeritageDescription() {
        return heritageDescription;
    }

    public void setHeritageDescription(String heritageDescription) {
        this.heritageDescription = heritageDescription;
    }

    public String toString() {
        return String.format("Heritage: %s%nDescription:%n%s", heritageName, heritageDescription);
    }

}