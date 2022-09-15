package demo02_Adapter.demo01_Adapter_abstract;

import demo02_Adapter.demo01_Adapter_abstract.content.Print;
import demo02_Adapter.demo01_Adapter_abstract.content.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
