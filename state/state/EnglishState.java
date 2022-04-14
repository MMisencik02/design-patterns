package state;

import java.util.ArrayList;

/**
 * The English state.
 * @author Mario Misencik
 */
public class EnglishState implements State {
    private MusicBox box;

    /**
     * The English state. This makes the music box print song lyrics in English.
     * @param box The music box.
     */
    public EnglishState(MusicBox box) {
        this.box = box;
    }

    /**
     * A method that puts the lyrics of "Twinkle, Twinkle, Little Star" to an ArrayList
     * and calls the music box's playSong method.
     * The English version of the song is played. (Same title)
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Twinkle, twinkle, little star,");
        lyrics.add("How I wonder what you are.");
        lyrics.add("Up above the world so high,");
        lyrics.add("Like a diamond in the sky.");
        lyrics.add("Twinkle, twinkle, little star,");
        lyrics.add("How I wonder what you are.");
        box.playSong("Twinkle, Twinkle, Little Star", lyrics);
    }

    /**
     * A method that puts the lyrics of "If You're Happy and You Know It" to an ArrayList
     * and calls the music box's playSong method.
     * The English version of the song is played. (Same title)
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("If you're happy and you know it, clap your hands!");
        lyrics.add("If you're happy and you know it, clap your hands!");
        lyrics.add("If you're happy and you know it, and you really want to show it,");
        lyrics.add("If you're happy and you know it, clap your hands!");
        box.playSong("If You're Happy and You Know It", lyrics);
    }

    /**
     * A method that normally switches the music box's state to English,
     * but since it is already in the English state, nothing happens.
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("You are already in English mode.");
    }

    /**
     * A method that switches the music box's state to French.
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Setting box to French mode...");
        box.setState(box.getFrenchState());
    }

    /**
     * A method that switches the music box's state to Spanish.
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Setting box to Spanish mode...");
        box.setState(box.getSpanishState());
    }

}