package observer;

import java.util.HashMap;

public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;

    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        this.votes = new HashMap<String, Integer>();
    }

    @Override
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        /** Cycle through the HashMap and add the votes together **/
        for (HashMap.Entry<String, Integer> element : votes.entrySet()) {
            numVotes += element.getValue();
        }
        display();
    }

    private void display() {
        System.out.println("Current Percent of Votes:");
        /**
         * Cycle though every entry in the HashMap and print it;
         * implemented with the help of:
         * https://www.geeksforgeeks.org/traverse-through-a-hashmap-in-java/
         */
        for (HashMap.Entry<String, Integer> element : votes.entrySet()) {
            String key = element.getKey();
            double value = (double)element.getValue() / numVotes * 100;
            System.out.println(key + ": " + Math.round(value*10.0)/10.0 + "%");
        }
        System.out.println();
    }
    
}