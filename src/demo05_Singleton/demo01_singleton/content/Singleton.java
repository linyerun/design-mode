package demo05_Singleton.demo01_singleton.content;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
