package demo08_abstractFactory.demo.table_factory;

import demo08_abstractFactory.demo.factory.Factory;
import demo08_abstractFactory.demo.factory.Link;
import demo08_abstractFactory.demo.factory.Page;
import demo08_abstractFactory.demo.factory.Tray;

public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
