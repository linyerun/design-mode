package demo08_abstractFactory.demo;

import demo08_abstractFactory.demo.factory.Factory;
import demo08_abstractFactory.demo.factory.Link;
import demo08_abstractFactory.demo.factory.Page;
import demo08_abstractFactory.demo.factory.Tray;

public class Demo08Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main list_factory.ListFactory");
            System.out.println("Example 2: java Main table_factory.TableFactory");
            System.exit(0);
        }
        //创建抽象工厂
        Factory factory = Factory.getFactory(args[0]);
        //生产URL
        Link peopleLink = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmLink = factory.createLink("光明日报", "https://www.gmw.cn/");
        Link us_yahoo = factory.createLink("Yahoo", "http://www.tahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.tahoo.co.jp");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");
        //生产容器
        Tray trayNews = factory.createTray("日报");
        trayNews.add(peopleLink);
        trayNews.add(gmLink);

        Tray trayYahoo = factory.createTray("Yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        //创建页面
//        Page page = factory.createPage("LinkedPage", "随风的叶子");//Link
        Page page = factory.createPage("TablePage", "随风的叶子");//Table
        page.add(trayNews);
        page.add(traySearch);
        page.output();//输出
        //practice-2
        factory.createYahooPage().output();
    }
}
