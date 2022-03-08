package behavioural.strategy;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSorting(){
        sortingStrategy.sort();
    }
}
