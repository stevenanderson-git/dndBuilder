package dndbuilder.characterbuilder;

/**
 * This will be further developed in the future allowing for backgrounds to be
 * objects instead of just strings. Custom backgrounds will be part of a seprate
 * creation program.
 */

public class CharacterBackground {
    private String backgroundDescription;

    public CharacterBackground(String backgroundDescription) {
        this.backgroundDescription = backgroundDescription;
    }

    public String toString() {
        return backgroundDescription;
    }

}
