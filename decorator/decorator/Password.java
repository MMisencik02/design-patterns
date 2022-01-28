package decorator;

/**
 * A password
 * @author Mario Misencik
 */
public abstract class Password {
    protected String password;

    /**
     * Generates and returns a password based on the class it is called in
     * @return A generated password
     */
    public abstract String getPassword();
}