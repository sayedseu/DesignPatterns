package behavioural.observer;

public class AverageScoreObserver implements Observer{
    @Override
    public void update(ScoreData scoreData) {
        //System.out.println("------------------ Average Score ------------------");
        System.out.println(scoreData);
    }
}
