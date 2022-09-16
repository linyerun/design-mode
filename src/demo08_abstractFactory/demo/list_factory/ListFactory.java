package demo08_abstractFactory.demo.list_factory;

import demo08_abstractFactory.demo.factory.Factory;
import demo08_abstractFactory.demo.factory.Link;
import demo08_abstractFactory.demo.factory.Page;
import demo08_abstractFactory.demo.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
