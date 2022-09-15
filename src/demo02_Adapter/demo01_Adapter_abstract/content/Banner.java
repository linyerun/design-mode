package demo02_Adapter.demo01_Adapter_abstract.content;

//实际情况
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("("+string+")");
    }

    public void showWithAster() {
        System.out.println("*"+string+"*");
    }
}
