package v2.chainOfResponsibility;

/**
 * Created by wangym on 2017/3/1.
 */
public class P1HandlerImpl extends Handler {
    //查看自己能处理的问题的范围与限制
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    //定义自己对相关问题的处理逻辑
    @Override
    protected Response echo(Request request) {
        return null;
    }
}
