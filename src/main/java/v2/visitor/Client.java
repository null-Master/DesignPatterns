package v2.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wangym on 2017/3/14.
 */
public class Client {
    public static void main(String[] args) {
        List<Element> list = new LinkedList<>();
        list.add(new P1ElementImpl());
        list.add(new P2ElementImpl());

        IVisitor visitor = new A1VisitorImpl();

        for (Element e : list) {
            System.out.println(e.getClass());
            System.out.println(e instanceof Element);
            System.out.println(e instanceof P1ElementImpl);
            System.out.println(e instanceof P2ElementImpl);
            e.accept(visitor);
        }


    }
}
