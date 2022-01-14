package strategy;

/** Necessary for ArrayList & swap method **/
import java.util.*;

public class InsertionSort implements SortBehavior {

    @Override
    public ArrayList<String> sort(ArrayList<String> data) {
        /**
         * Insertion sort implementation courtesy of:
         * https://en.wikipedia.org/wiki/Insertion_sort#Algorithm
         */
        for (int i = 0; i < data.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (data.get(j-1).compareTo(data.get(j)) > 0) {
                    Collections.swap(data,j,j-1);
                }
            }
        }
        return data;
    }

}