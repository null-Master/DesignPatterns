package command;

/**
 * Created by wangym on 2016/12/28.
 */
public class LightOnCommandImpl implements Command {
    Light light;

    public LightOnCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
