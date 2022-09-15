package demo04_FactoryMethod.id_card;

import demo04_FactoryMethod.framework.Product;

public class IDCard extends Product {

    private String owner;//拥有者
    private int ID;//卡的编号

    IDCard(String owner,int ID) {
        this.ID = ID;
        this.owner = owner;
        System.out.println("制作"+owner+"的ID卡。");
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡。");
    }

    public String getOwner() {
        return owner;
    }

    public int getID() {
        return ID;
    }
}
