package v2.factoryMethod;

/**
 * Created by wangym on 2017/2/27.
 */
public class VivoPhoneProductImpl implements PhoneProduct {
    @Override
    public void getIntroduction() {
        System.out.println("Vivo phone");
    }
}
