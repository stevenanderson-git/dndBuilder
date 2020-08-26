package characterFiles;

public class Race {
    //TODO: change race to use an interface
    private String raceName;
    private String raceDescription;

    public Race(String raceName){
        this.raceName = raceName;
        raceDescription = "";
    }
    //DEFAULT RACE
    public Race(){
        raceName = "Human";
        raceDescription = "Empty - Please add Details";
    }

    public String toString(){
        return String.format("Race: %s%nDescription:%n%s", raceName, raceDescription);
    }
    
}