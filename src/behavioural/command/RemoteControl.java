package behavioural.command;

public class RemoteControl{
    Command command;

    void setCommand(Command command){
        this.command = command;
    }

    void onButtonPress(){
        command.execute();
    }
}
