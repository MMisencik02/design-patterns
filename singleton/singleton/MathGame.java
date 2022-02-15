package singleton;

import java.util.*;

/**
 * A game involving basic mathematical operations
 * @author Mario Misencik
 */
public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner scanner;
    private String[] operands = {"+","-","*","/"};

    /**
     * A basic math operation game
     */
    private MathGame() {
        rand = new Random();
        scanner = new Scanner(System.in);
        System.out.println("Let's have fun with math!");
    }

    /**
     * Returns the instance of the math game to be played.
     * If no instance currently exists, one will be created.
     * @return An instance of math game
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * Brings the math game into action. The user will be prompted to choose to play the game.
     * If they wish to do so, a round will begin. If not, the application will quit.
     * This method repeats itself using a while-loop until the user chooses to quit.
     */
    public void play() {
        while (true) {
            System.out.println("(P)lay or (Q)uit: ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("P")) {
                mathGame.playRound();
            } else if (choice.equalsIgnoreCase("Q")) {
                System.out.println("You won " + score + " games!");
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Sorry, you must enter p or q");
            }
        }
    }

    /**
     * Plays a round of the math game. Users are given two random integers and 
     * a random operand in an equation and must provide the correct answer. 
     * A certain helper method will be called depending on the operand chosen.
     * @return Whether or not the user was correct, provided by the called helper method
     */
    private boolean playRound() {
        int int1 = rand.nextInt(100)+1;
        int int2 = rand.nextInt(100)+1;
        String operand = operands[rand.nextInt(4)];
        System.out.println("\nRound answer to 1 decimal place");
        String equation = int1 + " " + operand + " " + int2;
        System.out.print(equation + " = ");
        double answer = scanner.nextDouble();
        if (operand.equals("+")) {
            return addResult(int1, int2, answer);
        }
        if (operand.equals("-")) {
            return subResult(int1, int2, answer);
        }
        if (operand.equals("*")) {
            return multResult(int1, int2, answer);
        }
        if (operand.equals("/")) {
            return divResult(int1, int2, answer);
        }
        return false; //An error will be present otherwise
    }

    /**
     * A helper method that determines whether or not the user's answer was correct.
     * This method is called when the '+' operand is used.
     * @param int1 The first random integer
     * @param int2 The second random integer
     * @param answer The user's answer
     * @return Whether or not the user was correct
     */
    private boolean addResult(int int1, int int2, double answer) {
        if ((int1+int2) == answer) {
            System.out.println("You got it!");
            score++;
            return true;
        }
        System.out.println("The correct answer is: " + 
        ((double)Math.round((int1+int2)*10d)/10d));
        return false;
    }

    /**
     * A helper method that determines whether or not the user's answer was correct.
     * This method is called when the '-' operand is used.
     * @param int1 The first random integer
     * @param int2 The second random integer
     * @param answer The user's answer
     * @return Whether or not the user was correct
     */
    private boolean subResult(int int1, int int2, double answer) {
        if ((int1-int2) == answer) {
            System.out.println("You got it!");
            score++;
            return true;
        }
        System.out.println("The correct answer is: " + 
        ((double)Math.round((int1-int2)*10d)/10d));
        return false;
    }

    /**
     * A helper method that determines whether or not the user's answer was correct.
     * This method is called when the '*' operand is used.
     * @param int1 The first random integer
     * @param int2 The second random integer
     * @param answer The user's answer
     * @return Whether or not the user was correct
     */
    private boolean multResult(int int1, int int2, double answer) {
        if ((int1*int2) == answer) {
            System.out.println("You got it!");
            score++;
            return true;
        }
        System.out.println("The correct answer is: " + 
        ((double)Math.round((int1*int2)*10d)/10d));
        return false;
    }

    /**
     * A helper method that determines whether or not the user's answer was correct.
     * This method is called when the '/' operand is used.
     * @param int1 The first random integer
     * @param int2 The second random integer
     * @param answer The user's answer
     * @return Whether or not the user was correct
     */
    private boolean divResult(int int1, int int2, double answer) {
        if ((double)Math.round(((double)int1/(double)int2)*10d)/10d ==
            (double)Math.round(answer*10d)/10d) {
            System.out.println("You got it!");
            score++;
            return true;
        }
        System.out.println("The correct answer is: " + 
        ((double)Math.round(((double)int1/(double)int2)*10d)/10d));
        return false;
    }

}
