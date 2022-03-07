package behavioural.observer;

public class ScoreData {
    int runs;
    int wicket;
    double overs;

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public double getOvers() {
        return overs;
    }

    public void setOvers(double overs) {
        this.overs = overs;
    }

    @Override
    public String toString() {
        return "ScoreData{" +
                "runs=" + runs +
                ", wicket=" + wicket +
                ", overs=" + overs +
                '}';
    }
}
