package v2.decorator.eg;

/**
 * Created by wangym on 2017/3/1.
 */
public class FouthGradeSchoolReportImpl extends SchoolReport {
    @Override
    public void report() {
        System.out.println("分数如下：。。。。。。");
    }

    @Override
    public void sign() {
        System.out.println("签名如下：。。。。。。");
    }
}
