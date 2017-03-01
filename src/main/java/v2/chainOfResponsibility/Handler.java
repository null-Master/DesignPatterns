package v2.chainOfResponsibility;

/**
 * Created by wangym on 2017/3/1.
 */
public abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler (Handler handler) {
        this.nextHandler = handler;
    }
    //获得当前处理者的处理级别（即能够处理的问题的范围）
    protected abstract Level getHandlerLevel ();

    //当前处理者对可以处理的问题的实现
    protected abstract Response echo (Request request);

    public final Response handleMessage (Request request) {
        Response response = null;
        //检查是否应该自己处理 还是传给下一个处理者
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else if (this.nextHandler != null) {
            response = nextHandler.handleMessage(request);
        } else {
            //没有合适的处理者  适当处理即可
        }

        return response;
    }
}
