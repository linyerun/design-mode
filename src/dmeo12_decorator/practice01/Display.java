package dmeo12_decorator.practice01;

public abstract class Display {

    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);

    public void show() {
        int rows = getRows();
        for (int i = 0; i < rows; i++) {
            System.out.println(getRowText(i));
        }
    }
}
