package state;

/**
 * A state, or mode, for an object to be in.
 * Different commands are called and outputs are printed
 * depending on the state the object is in.
 * @author Mario Misencik
 */
public interface State {
    public void pressStarButton();
    public void pressHappyButton();
    public void pressEnglishButton();
    public void pressFrenchButton();
    public void pressSpanishButton();
}