package state;

import java.util.ArrayList;

/**
 * The French state.
 * @author Mario Misencik
 */
public class FrenchState implements State {
    private MusicBox box;

    /**
     * The French state. This makes the music box print song lyrics in French.
     * @param box The music box.
     */
    public FrenchState(MusicBox box) {
        this.box = box;
    }

    /**
     * A method that puts the lyrics of "Twinkle, Twinkle, Little Star" to an ArrayList
     * and calls the music box's playSong method.
     * The French version of the song is played. ("Brille, Brille, Petite Étoile")
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Brille, brille, petite étoile,");
        lyrics.add("Je me demande vraiment ce que tu es.");
        lyrics.add("Au-dessus du monde si haut,");
        lyrics.add("Comme un diamant dans le ciel.");
        lyrics.add("Brille, brille, petite étoile,");
        lyrics.add("Je me demande vraiment ce que tu es.");
        box.playSong("Brille, Brille, Petite Étoile", lyrics);
    }

    /**
     * A method that puts the lyrics of "If You're Happy and You Know It" to an ArrayList
     * and calls the music box's playSong method.
     * The French version of the song is played. ("Si Tu Aimes Le Soleil")
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Si tu aimes le soleil, frappe des mains!");
        lyrics.add("Si tu aimes le soleil, frappe des mains!");
        lyrics.add("Si tu aimes le soleil, le printemps qui se réveille,");
        lyrics.add("Si tu aimes le soleil, frappe des mains!");
        box.playSong("Si Tu Aimes Le Soleil", lyrics);
    }

    /**
     * A method that switches the music box's state to English.
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Setting box to English mode...");
        box.setState(box.getEnglishState());
    }

    /**
     * A method that normally switches the music box's state to French,
     * but since it is already in the French state, nothing happens.
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("You are already in French mode.");
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