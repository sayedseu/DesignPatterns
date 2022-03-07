package behavioural.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject{
    ArrayList<Observer> observers;
    ScoreData scoreData;

    public CricketData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.scoreData);
        }
    }

    public void updateScoreData(ScoreData scoreData){
        this.scoreData = scoreData;
        notifyObserver();
    }
}
