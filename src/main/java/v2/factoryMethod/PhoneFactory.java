package v2.factoryMethod;

/**
 * Created by wangym on 2017/2/27.
 */
public interface PhoneFactory {
    <T extends PhoneProduct> T getOnePhone (Class<T> c);
}
