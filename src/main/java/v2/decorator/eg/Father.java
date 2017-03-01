package v2.decorator.eg;

/**
 * Created by wangym on 2017/3/1.
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new FouthGradeSchoolReportImpl();
        sr = new HighScoreDecoratorImpl(sr);
        sr = new SortDecoratorImpl(sr);
        sr.report();
        sr.sign();
    }
}
