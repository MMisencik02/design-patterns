package decorator;

import java.util.Random;

/**
 * A password generator in which there is a 50% chance of changing a character's case
 * @author Mario Misencik
 */
public class RandomCasing extends PasswordDecorator {

    /**
     * Initializes a password to generate another one by occasionally changing the cases of characters
     * @param passwordBeginning The password to be initialized
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    public String getPassword() {
        char[] arr = passwordBeginning.getPassword().toCharArray();
        Random rand = new Random();
        int randInt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i]) || Character.isLowerCase(arr[i])) {
                randInt = rand.nextInt(2);
                if (Character.isUpperCase(arr[i]) && randInt == 1) {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
                else if (Character.isLowerCase(arr[i]) && randInt == 1) {
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            }
        }
        return String.valueOf(arr);
    }

}