package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

    public StudentGovPoll(String school) {
        this.observers = new ArrayList<Observer>();
        this.votes = new HashMap<String, Integer>();
        this.school = school;
        this.numUpdates = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.numUpdates++;
        /** Only notifies the observer every 4 times **/
        if (this.numUpdates % 4 == 0) {
            for (Observer observer : observers) {
                observer.update(votes);
            }
        }
    }

    public void addCandidate(String president) {
        this.votes.put(president, 0);
    }

    public void enterVotes(String president, int num) {
        /** Edits existing entry **/
        this.votes.put(president, votes.get(president) + num);
        notifyObservers();
    }

    public String getSchool() {
        return this.school;
    }
    
}