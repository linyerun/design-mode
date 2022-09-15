package demo04_FactoryMethod.id_card;

import demo04_FactoryMethod.framework.Factory;
import demo04_FactoryMethod.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {

    private HashMap owners = new HashMap();

    //添加synchronized避免多线程导致分配ID重复
    @Override
    protected synchronized Product createProduct(String owner) {
        IDCard idCard = new IDCard(owner,owners.size());
        return idCard;
    }

    @Override
    protected void registerProduct(Product product) {
        owners.put(owners.size()-1,product);
    }

    public HashMap getOwners() {
        return owners;
    }
}
