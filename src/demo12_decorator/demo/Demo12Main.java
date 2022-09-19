package demo12_decorator.demo;

public class Demo12Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello World.");
        Display b2 = new SideBorder(b1,'#');
        Display b3 = new FullBorder(b2);
        b1.show();
        System.out.println();
        b2.show();
        System.out.println();
        b3.show();
        System.out.println();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("你好，世界。")
                                                ),
                                                '*'
                                        )
                                )
                        ),
                        '/'
                );
        b4.show();
    }
}
