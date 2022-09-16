package demo08_abstractFactory.demo.factory;

public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);//这样代码必须放在首行
        this.url = url;
    }
}
