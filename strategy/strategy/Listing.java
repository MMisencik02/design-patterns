package strategy;

import java.util.ArrayList;

public class Listing {
    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;

    /** Default constructor **/
    public Listing(String title) {
        this.title = title;
        this.items = new ArrayList<String>();
        this.sortBehavior = new BubbleSort();
    }

    /** Calling ArrayList method **/
    public void add(String item) {
        this.items.add(item);
    }

    /** Calling ArrayList method **/
    public void remove(String item) {
        this.items.remove(item);
    }

    public String getTitle() {
        return this.title;
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    /** Calling interface method **/
    public ArrayList<String> getSortedList() {
        return this.sortBehavior.sort(items);
    }

    public ArrayList<String> getUnSortedList() {
        return this.items;
    }
}