package dmeo12_decorator.demo;

public abstract class Border extends Display{

    //表示被装饰物
    protected Display display;

    //在生成实例时通过参数指定被装饰物
    protected Border(Display display) {
        this.display = display;
    }
}
