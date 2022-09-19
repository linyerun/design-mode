package demo15_facade.demo.page_maker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {

    private PageMaker() {   // 防止外部new出PageMaker的实例，所以声明为private方法
    }

    /**
     *
     * @param mailAddr 邮件地址
     * @param filename  欢迎页输出地址
     */
    public static void makeWelcomePage(String mailAddr, String filename) {
        try {
            Properties mailProp = Database.getProperties("src/demo15_facade/demo/maildata");

            String username = mailProp.getProperty(mailAddr);

            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailAddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //P2 -> 将用户邮件地址做成超链接
    public static void makeLinkPage(String filename) {
        try {
            Properties mailProp = Database.getProperties("src/demo15_facade/demo/maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link Page");
            Enumeration en = mailProp.propertyNames();
            while (en.hasMoreElements()) {
                String mailAddr = (String)en.nextElement();
                String username = mailProp.getProperty(mailAddr, "(unknown)");
                writer.mailto(mailAddr,username);
            }
            writer.close();
            System.out.println(filename+" is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
