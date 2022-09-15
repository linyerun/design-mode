package demo04_FactoryMethod.framework;

public abstract class Factory {

    //定义了创建产品的模板
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    //我们可以在这里实现这两个方法，当子类不实现这两个方法的时候就让我们的实现抛出错误。
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

}
