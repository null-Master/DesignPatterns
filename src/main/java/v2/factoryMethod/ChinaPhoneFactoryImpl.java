package v2.factoryMethod;

/**
 * Created by wangym on 2017/2/27.
 */
public class ChinaPhoneFactoryImpl implements PhoneFactory {
    @Override
    public <T extends PhoneProduct> T getOnePhone(Class<T> c) {

        PhoneProduct phone = null;
        try {
//            phone = (T)Class.forName(c.getName()).newInstance();
            phone = (T)c.newInstance();
        } catch (Exception e) {
            System.out.println("生产手机错误");
        }
        return (T)phone;
    }
}
