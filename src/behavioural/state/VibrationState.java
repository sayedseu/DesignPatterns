package behavioural.state;

public class VibrationState implements MobileAlertState{
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("vibration...");
    }
}
