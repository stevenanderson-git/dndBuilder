package characterFiles;

public class Heritage {
    //TODO: change race to use an interface
    private String raceName;
    private String raceDescription;

    public Heritage(String raceName){
        this.raceName = raceName;
        raceDescription = "";
    }
    //DEFAULT RACE
    public Heritage(){
        raceName = "Human";
        raceDescription = "Empty - Please add Details";
    }

    public String toString(){
        return String.format("Race: %s%nDescription:%n%s", raceName, raceDescription);
    }
    
}