package decorator;

import java.util.Random;

/**
 * A password generator in which there is a 30% chance of a random symbol being added per character
 * @author Mario Misencik
 */
public class SpecialChars extends PasswordDecorator {

    /**
     * Initializes a password to generate another one by occasionally adding a random symbol per character
     * @param passwordBeginning The password to be initialized
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    public String getPassword() {
        char[] arr = passwordBeginning.getPassword().toCharArray();
        char[] chars = {'*','!','%','+','.',','};
        String ret = "";
        Random rand = new Random();
        int chance = 0;
        int randChar = 0;
        for (int i = 0; i < arr.length; i++) {
            chance = rand.nextInt(10) + 1;
            if (chance <= 3) {
                randChar = rand.nextInt(6);
                ret += arr[i];
                ret += chars[randChar];
            } else {
                ret += arr[i];
            }
        }
        return ret;
    }
    
}