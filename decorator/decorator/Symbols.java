package decorator;

/**
 * A password generator utilizing symbols
 * @author Mario Misencik
 */
public class Symbols extends PasswordDecorator {

    /**
     * Initializes a password to generate another one by exchanging certain characters for others
     * @param passwordBeginning The password to be initialized
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    public String getPassword() {
        char[] arr = passwordBeginning.getPassword().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'A') {
                arr[i] = '@';
            }
            else if (arr[i] == 'b' || arr[i] == 'B') {
                arr[i] = '8';
            }
            else if (arr[i] == 'e' || arr[i] == 'E') {
                arr[i] = '3';
            }
            else if (arr[i] == 'g' || arr[i] == 'G') {
                arr[i] = '9';
            }
            else if (arr[i] == 'i' || arr[i] == 'I') {
                arr[i] = '!';
            }
            else if (arr[i] == 'o' || arr[i] == 'O') {
                arr[i] = '0';
            }
            else if (arr[i] == 's' || arr[i] == 'S') {
                arr[i] = '$';
            }
            else if (arr[i] == 't' || arr[i] == 'T') {
                arr[i] = '7';
            }
        }
        return String.valueOf(arr);
    }
    
}