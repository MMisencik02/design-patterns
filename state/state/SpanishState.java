package state;

import java.util.ArrayList;

/**
 * The Spanish state.
 * @author Mario Misencik
 */
public class SpanishState implements State {
    private MusicBox box;

    /**
     * The Spanish state. This makes the music box print song lyrics in Spanish.
     * @param box The music box.
     */
    public SpanishState(MusicBox box) {
        this.box = box;
    }

    /**
     * A method that puts the lyrics of "Twinkle, Twinkle, Little Star" to an ArrayList
     * and calls the music box's playSong method.
     * The Spanish version of the song is played. ("Estrellita, ¿Dónde Estás?")
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Estrellita, ¿dónde estás?");
        lyrics.add("Me pregunto qué serás.");
        lyrics.add("Esta noche allí estarás,");
        lyrics.add("Cual diamante brillarás.");
        lyrics.add("Estrellita, ¿dónde estás?");
        lyrics.add("Me pregunto qué serás.");
        box.playSong("Estrellita, ¿Dónde Estás?", lyrics);
    }

    /**
     * A method that puts the lyrics of "If You're Happy and You Know It" to an ArrayList
     * and calls the music box's playSong method.
     * The Spanish version of the song is played. ("Si Eres Feliz y Lo Sabes")
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Si eres feliz y lo sabes, ¡bate las manos!");
        lyrics.add("Si eres feliz y lo sabes, ¡bate las manos!");
        lyrics.add("Si eres feliz y lo sabes, entonces pon las señales,");
        lyrics.add("Si eres feliz y lo sabes, ¡bate las manos!");
        box.playSong("Si Eres Feliz y Lo Sabes", lyrics);
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
     * A method that switches the music box's state to French.
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Setting box to French mode...");
        box.setState(box.getFrenchState());
    }

    /**
     * A method that normally switches the music box's state to Spanish,
     * but since it is already in the Spanish state, nothing happens.
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("You are already in Spanish mode.");
    }

}