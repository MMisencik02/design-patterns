package observer;

import java.util.HashMap;

public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;

    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        this.votes = new HashMap<String, Integer>();
    }

    @Override
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        display();
    }

    private void display() {
        System.out.println("Current Tallies:");
        /**
         * Cycle though every entry in the HashMap and print it;
         * implemented with the help of:
         * https://www.geeksforgeeks.org/traverse-through-a-hashmap-in-java/
         */
        for (HashMap.Entry<String, Integer> element : votes.entrySet()) {
            String key = element.getKey();
            int value = element.getValue();
            System.out.println(key + ": " + value);
        }
        System.out.println();
    }
}