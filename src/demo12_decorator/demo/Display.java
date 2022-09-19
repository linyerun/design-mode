package demo12_decorator.demo;

public abstract class Display {

    //获取横向字符数 -> 一行有多少个字符
    public abstract int getColumns();

    //获取纵向行数   -> 一列有多少个字符
    public abstract int getRows();

    //获取第row行的字符串
    public abstract String getRowText(int row);

    //Template Method(全部显示)
    public void show() {
        int rows = getRows();
        for (int i = 0; i < rows; i++)
            System.out.println(getRowText(i));
    }
}
