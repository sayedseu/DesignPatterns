package behavioural.state;

/*
In State pattern a class behavior changes based on its state. This type of design pattern comes under behavior pattern.
 */

public class StateDesignPattern {

    public static void main(String[] args) {
        AlertStateContext context = new AlertStateContext();
        context.alert();
        context.setState(new SilentState());
        context.alert();
    }
}
