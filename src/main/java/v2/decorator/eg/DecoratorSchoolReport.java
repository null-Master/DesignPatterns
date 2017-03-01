package v2.decorator.eg;

/**
 * Created by wangym on 2017/3/1.
 */
public abstract class DecoratorSchoolReport extends SchoolReport {
    private SchoolReport sr;

    public DecoratorSchoolReport(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        sr.report();
    }

    @Override
    public void sign() {
        sr.sign();
    }
}
