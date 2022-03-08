package behavioural.strategy;

public class StrategyPattern {

    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext();
        sortingContext.setSortingStrategy(new BubbleSort());
        sortingContext.performSorting();
        sortingContext.setSortingStrategy(new MergeSort());
        sortingContext.performSorting();
    }
}
