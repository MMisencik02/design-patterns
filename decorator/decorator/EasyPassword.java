package decorator;

import java.util.Random;

/**
 * A simple password generator
 * @author Mario Misencik
 */
public class EasyPassword extends Password {

    /**
     * Generates a simple password based on the phrase passed in
     * @param phrase A phrase or sentence
     */
    public EasyPassword(String phrase) {
        char[] arr = phrase.toCharArray();
        Random rand = new Random();
        int randInt = rand.nextInt(101);
        String ret = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                ret = ret + arr[i];
            } 
        }
        this.password = ret + randInt;
    }

    public String getPassword() {
        return password;
    }

}