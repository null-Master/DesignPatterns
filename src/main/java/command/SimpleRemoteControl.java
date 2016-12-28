package command;

/**
 * Created by wangym on 2016/12/28.
 */
public class SimpleRemoteControl {
    Command command;
    public SimpleRemoteControl() {

    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonPressed() {
        command.execute();
    }


    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommandImpl lightOn = new LightOnCommandImpl(light);

        GarageDoor door = new GarageDoor();
        DoorOpenCommandImpl doorOpen = new DoorOpenCommandImpl(door);
        DoorCloseCommandImpl doorClose = new DoorCloseCommandImpl(door);

        remote.setCommand(lightOn);
        remote.buttonPressed();


        remote.setCommand(doorOpen);
        remote.buttonPressed();

        remote.setCommand(doorClose);
        remote.buttonPressed();





    }
}
