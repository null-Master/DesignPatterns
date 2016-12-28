package command;

/**
 * Created by wangym on 2016/12/28.
 */
public class DoorStopCommandImpl implements Command {
    GarageDoor door;
    public DoorStopCommandImpl(GarageDoor door) {
        this.door = door;
    }
    @Override

    public void execute() {
        door.stop();
    }
}
