package demo02_Adapter.demo02_Adapter_aggregate;

import demo02_Adapter.demo02_Adapter_aggregate.content.Print;
import demo02_Adapter.demo02_Adapter_aggregate.content.PrintBanner;

//请求者
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printWeak();
        print.printStrong();
    }
}
