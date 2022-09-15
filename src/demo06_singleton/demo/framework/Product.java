package demo06_singleton.demo.framework;

//成为Manager和其他类的沟通桥梁
public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
}
