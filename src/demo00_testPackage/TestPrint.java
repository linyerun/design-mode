package demo00_testPackage;

import java.nio.charset.StandardCharsets;

public class TestPrint {
    public static void main(String[] args) {
        String s = "HaHaHa";
        System.out.println(s);
        for (int i = 0; i < s.getBytes().length; i++) {
//            System.out.print("1");
//            System.out.print("/");
//            System.out.print("|");
            System.out.print("*");
        }
    }
}
