package behavioural.observer;

public class CurrentScoreObserver implements Observer{
    @Override
    public void update(ScoreData scoreData) {
        System.out.println("------------------ Current Score ------------------");
        System.out.println(scoreData);
    }
}
