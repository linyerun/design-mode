package demo03_TemplateMethod.content;

public abstract class AbstractDisplay {

    //定义处理流程模板
    //添加final让子类无法重写这个模板
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    //子类实现
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();
}
