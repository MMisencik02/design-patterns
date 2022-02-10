package iterator;

import java.util.ArrayList;

/**
 * A physical therapist
 * @author Mario Misencik
 */
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises = new Exercise[2];
    private int numExercises = 2;

    /**
     * A physical therapist (PT)
     * @param firstName The PT's first name
     * @param lastName The PT's last name
     * @param bio The PT's bio
     */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }
    
    /**
     * Adds a new exercise to the PT's list of exercises
     * @param title The title of the exercise
     * @param muscleGroups The muscles involved in the exercise
     * @param directions The directions of the exercise
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        for (int i = 0; i < exercises.length; i++) {
            if (exercises[i] == null) {
                exercises[i] = new Exercise(title, muscleGroups, directions);
                return;
            }
        }
        exercises = growArray(exercises);
        addExercise(title, muscleGroups, directions);
    }

    /**
     * Returns the PT's first name
     * @return The PT's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns the PT's last name
     * @return The PT's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns the PT's bio
     * @return The PT's bio
     */
    public String getBio() {
        return this.bio;
    }
    
    /**
     * Doubles the PT's list of exercises when it becomes too small to fit any more
     * @param exercises The initial array of exercises
     * @return A new doubled array of exercises, also containing the initial exercises
     */
    private Exercise[] growArray(Exercise[] exercises) {
        numExercises *= 2;
        Exercise[] grownArray = new Exercise[numExercises];
        for (int i = 0; i < exercises.length; i++) {
            grownArray[i] = exercises[i];
        }
        return grownArray;
    }

    /**
     * Creates an instance of an exercise iterator
     * @return An exercise iterator
     */
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(exercises);
    }

    public String toString() {
        return this.firstName + " " + this.lastName + "\n" + this.bio + "\n";
    }
}
