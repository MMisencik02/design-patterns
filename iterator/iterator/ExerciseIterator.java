package iterator;

/**
 * An exercise iterator
 * @author Mario Misencik
 */
public class ExerciseIterator implements Iterator {
    private Exercise[] exercises;
    private int position = 0;

    /**
     * An exercise iterator
     * @param exercises An array of exercises
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }

    /**
     * Checks to see whether there is an element of the exercise array after the current one
     * @return The T/F answer to "There is an element after the current one."
     */
    public boolean hasNext() {
        return (position < exercises.length && exercises[position] != null);
    }

    /**
     * Shifts to the next element in the exercise array
     * @return The next element of the exercise array
     */
    public Exercise next() {
        position++;
        return exercises[position-1];
    }
}
