package demo07_builderMode.practice03.content;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早到午");
        builder.makeItems(new String[]{
                "早上好。",
                "下午好",
        });
        builder.makeString(" 晚上 ");
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();
    }
}
