package behavioural.command;

/*
Command pattern is a data driven design pattern and falls under behavioral pattern category.
A request is wrapped under an object as command and passed to invoker object.
Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.
 */

public class CommandDesignPattern {

    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.onButtonPress();
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.onButtonPress();
    }
}
