package demo06_singleton.demo;

import demo06_singleton.demo.content.MessageBox;
import demo06_singleton.demo.content.UnderlinePen;
import demo06_singleton.demo.framework.Manager;
import demo06_singleton.demo.framework.Product;

public class Application {
    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderlinePen pen = new UnderlinePen('~');
        MessageBox box01 = new MessageBox('*');
        MessageBox box02 = new MessageBox('/');
        //注册
        manager.register("strong message",pen);
        manager.register("warning box",box01);
        manager.register("slash box",box02);
        //生成
        Product p1 = manager.create("strong message");
        p1.use("Hello world");
        Product p2 = manager.create("warning box");
        p2.use("Hello world");
        Product p3 = manager.create("slash box");
        p3.use("Hello world");
    }
}
