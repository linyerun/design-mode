package demo06_singleton.practice_way02.content;

import demo06_singleton.practice_way02.framework.Product;

public class UnderlinePen extends Product {

    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""+s+"\"");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }
}
