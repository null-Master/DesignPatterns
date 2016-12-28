package command;

/**
 * Created by wangym on 2016/12/28.
 */
public class LightOffCommandImpl implements Command {
    Light light;
    public LightOffCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
