package v1.command;

/**
 * Created by wangym on 2016/12/28.
 */
public class DoorOpenCommandImpl implements Command {
    GarageDoor door;
    public DoorOpenCommandImpl(GarageDoor door) {
        this.door = door;
    }
    @Override
    public void execute() {
        door.up();
    }
}
