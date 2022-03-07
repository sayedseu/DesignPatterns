package behavioural.state;

public class SilentState implements MobileAlertState{
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("silent...");
    }
}
