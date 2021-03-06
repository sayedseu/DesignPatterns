package behavioural.state;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() {
        currentState = new VibrationState();
    }

    public void setState(MobileAlertState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert(this);
    }
}
