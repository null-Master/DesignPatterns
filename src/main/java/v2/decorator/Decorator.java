package v2.decorator;



/**
 * Created by wangym on 2017/3/1.
 */
public abstract class Decorator extends Component {
    //保存需要被装饰的实例
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
