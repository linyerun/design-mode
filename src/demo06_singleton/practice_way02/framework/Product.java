package demo06_singleton.practice_way02.framework;

//使用Template Method方式来改很nice
public abstract class Product implements Cloneable{

    public abstract void use(String s);

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
