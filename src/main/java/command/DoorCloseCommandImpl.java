package command;

/**
 * Created by wangym on 2016/12/28.
 */
public class DoorCloseCommandImpl implements Command {
    GarageDoor door;
    public DoorCloseCommandImpl(GarageDoor door) {
        this.door = door;
    }
    @Override
    public void execute() {
        door.down();
    }
}
