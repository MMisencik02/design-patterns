package state;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * A music box that plays renditions of "Twinkle, Twinkle, Little Star"
 * and "If You're Happy and You Know It".
 * @author Mario Misencik
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * A music box that plays renditions of "Twinkle, Twinkle, Little Star"
     * and "If You're Happy and You Know It".
     * The current state is set to English by default.
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }

    /**
     * A method that makes the music box play a rendition of "Twinkle, Twinkle, Little Star".
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * A method that makes the music box play a rendition of "If You're Happy and You Know It".
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * A method that switches the music box's state to English. 
     * If the current state is already English, nothing happens.
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * A method that switches the music box's state to French. 
     * If the current state is already French, nothing happens.
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * A method that switches the music box's state to Spanish. 
     * If the current state is already Spanish, nothing happens.
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * A method that changes the state of the music box.
     * @param state The state that the box is to be set to.
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * A method that returns the English state.
     * @return The English state.
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * A method that returns the French state.
     * @return The French state.
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * A method that returns the Spanish state.
     * @return The Spanish state.
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * A method that prints the song to be played. 
     * The song's lyrics vary depending on the song as well as the state the music box is in. 
     * @param songName The name of the song.
     * @param lyrics The song's lyrics.
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("\nPlaying: " + songName);
        sleep(1);
        for (String lyric : lyrics) {
            System.out.println(lyric);
            sleep(1);
        }
        System.out.println();
    }

    /**
     * A helper method used to delay output to the console.
     * @param num The number of seconds that output is to be delayed.
     */
    private void sleep(int num) {
        try {
            TimeUnit.SECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
