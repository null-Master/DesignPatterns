package v2.strategy;

/**
 * Created by wangym on 2017/3/7.
 */
public enum StrategyEnum implements Calculator{
    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private String value = "";
    StrategyEnum(String _value) {
        this.value = _value;
    }
    public String getValue() {
        return value;
    }
//    public abstract int exec (int a, int b);
}
