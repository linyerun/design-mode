package demo04_FactoryMethod;

import demo04_FactoryMethod.framework.Factory;
import demo04_FactoryMethod.framework.Product;
import demo04_FactoryMethod.id_card.IDCardFactory;

public class Application {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        //生产
        Product c1 = factory.create("小米");
        Product c2 = factory.create("小麦");
        Product c3 = factory.create("高粱");
        //使用
        c1.use();
        c2.use();
        c3.use();
    }
}
