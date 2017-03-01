package v2.decorator.eg;

/**
 * Created by wangym on 2017/3/1.
 */
public class HighScoreDecoratorImpl extends DecoratorSchoolReport {
    public HighScoreDecoratorImpl(SchoolReport sr) {
        super(sr);
    }
    private void reportHighScore() {
        System.out.println("最高分数如下：。。。。。。");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
