package demo05_Singleton.demo03_triple;

import demo05_Singleton.demo03_triple.content.Triple;

public class Application {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i < 9; i++) {
            System.out.println(Triple.getInstance(i%3));
        }
        System.out.println("End");
    }
}
