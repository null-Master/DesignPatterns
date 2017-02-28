package v2.factoryMethod;

/**
 * Created by wangym on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        PhoneFactory factory = new ChinaPhoneFactoryImpl();

        PhoneProduct vivoPhone = factory.getOnePhone(VivoPhoneProductImpl.class);
        PhoneProduct oppoPhone = factory.getOnePhone(OppoPhoneProductImpl.class);
        PhoneProduct applePhone = factory.getOnePhone(ApplePhoneProductImpl.class);
        vivoPhone.getIntroduction();
        oppoPhone.getIntroduction();
        applePhone.getIntroduction();
    }
}
