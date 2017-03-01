package v2.decorator.eg;

/**
 * Created by wangym on 2017/3/1.
 */
public class SortDecoratorImpl extends DecoratorSchoolReport {
    public SortDecoratorImpl(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("分数排名如下：。。。。。。");
    }

    @Override
    public void report() {
        super.report();
        reportSort();
    }
}
