package demo05_Singleton.demo01_singleton;

import demo05_Singleton.demo01_singleton.content.Singleton;

public class Application {
    public static void main(String[] args) {
        System.out.println("Start!");
        Singleton obj01 = Singleton.getInstance();
        Singleton obj02 = Singleton.getInstance();
        if (obj01 == obj02) {
            System.out.println("obj01 == obj02");
        }else {
            System.out.println("obj01 != obj02");
        }
        System.out.println("End!");
    }
}
