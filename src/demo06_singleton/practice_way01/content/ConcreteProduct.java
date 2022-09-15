package demo06_singleton.practice_way01.content;

import demo06_singleton.practice_way01.framework.Product;

public abstract class ConcreteProduct implements Product {

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
