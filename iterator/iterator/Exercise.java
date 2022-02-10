package iterator;

import java.util.ArrayList;

/**
 * An exercise
 * @author Mario Misencik
 */
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles = new ArrayList<String>();
    private ArrayList<String> directions = new ArrayList<String>();

    /**
     * An exercise
     * @param title The title of the exercise
     */
    public Exercise(String title) {
        this.title = title;
    }

    /**
     * An exercise
     * @param title The title of the exercise
     * @param muscleGroups The muscles involved in the exercise
     * @param directions The directions of the exercise
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    /**
     * Adds a target muscle to the exercise
     * @param muscle The muscle to be added
     */
    public void addTargetMuscle(String muscle) {
        targetMuscles.add(muscle);
    }

    /**
     * Removes a target muscle to the exercise
     * @param muscle The muscle to be removed
     */
    public void removeTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }

    public String toString() {
        String muscleList = "";
        String directionList = "";
        for (int i = 0; i < this.targetMuscles.size(); i++) {
            muscleList += this.targetMuscles.get(i);
            if (i < this.targetMuscles.size()-1) {
                muscleList += ", ";
            }
        }
        for (int i = 0; i < this.directions.size(); i++) {
            directionList += "- " + this.directions.get(i) + "\n";
        }
        return "\n... " + this.title + " ...\nMuscles: " + muscleList + "\nExercises:\n" + directionList;
    }
}
