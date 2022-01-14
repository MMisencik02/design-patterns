package strategy;

/** Necessary for ArrayList & swap method **/
import java.util.*;

public class BubbleSort implements SortBehavior {

    @Override
    public ArrayList<String> sort(ArrayList<String> data) {
        /**
         * Bubble sort implementation courtesy of:
         * https://en.wikipedia.org/wiki/Bubble_sort#Implementation
         */
        boolean swapped = true;
        while (swapped == true) {
            swapped = false;
            for (int i = 1; i <= data.size()-1; i++) {
                if (data.get(i-1).compareTo(data.get(i)) > 0) {
                    Collections.swap(data,i-1,i);
                    swapped = true;
                }
            }
        }
        return data;
    }

}
