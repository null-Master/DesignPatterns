package v2.decorator;

/**
 * Created by wangym on 2017/3/1.
 */
public class OriginalComponentImpl extends Component {
    @Override
    public void operate() {
        System.out.println("original component is doing something.");
    }
}
