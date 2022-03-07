package behavioural.observer;

/*
Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified,
its depenedent objects are to be notified automatically.
Observer pattern falls under behavioral pattern category.
 */

public class ObserverDesignPattern {

    public static void main(String[] args) {
        ScoreData scoreData = new ScoreData();
        CricketData cricketData = new CricketData();
        Observer currentScoreObserver = new CurrentScoreObserver();
        Observer averageScoreObserver = new AverageScoreObserver();

        cricketData.registerObserver(currentScoreObserver);
        cricketData.registerObserver(averageScoreObserver);

        scoreData.setOvers(5.5);
        scoreData.setRuns(120);
        scoreData.setWicket(3);

        cricketData.updateScoreData(scoreData);
        cricketData.unregisterObserver(averageScoreObserver);
        scoreData.setWicket(4);
        cricketData.updateScoreData(scoreData);
    }
}
