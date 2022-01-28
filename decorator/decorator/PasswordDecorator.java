package decorator;

/**
 * A password decorator
 * @author Mario Misencik
 */
public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * Initializes the initial password to be passed into the inherited password generator classes
     * @param passwordBeginning The password to be initialized
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    public abstract String getPassword();
}