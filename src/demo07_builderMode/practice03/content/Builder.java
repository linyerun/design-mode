package demo07_builderMode.practice03.content;

//需求，先调用makeTitle才能调用下面的东西
//使用的设计模式：template method
public abstract class Builder {

    private boolean initialized = false;

    public void makeTitle(String title) {
        //这样保证只会初始化一次
        if (!initialized) {
            buildTitle(title);
            initialized = true;
        }
    }

    public void makeString(String str) {
        if (initialized) {
            buildString(str);
        }
    }

    public void makeItems(String[] items) {
        if (initialized) {
            buildItems(items);
        }
    }

    public void close() {
        if (initialized) {
            buildDone();
        }
    }

    protected abstract void buildTitle(String title);
    protected abstract void buildString(String str);
    protected abstract void buildItems(String[] items);
    protected abstract void buildDone();
}
