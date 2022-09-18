package dmeo12_decorator.practice01;

//装饰器
public class UpDownBorder extends Display{

    private Display display;
    private char ch;

    public UpDownBorder(Display display,char ch) {
        this.display = display;
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows()+2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows()+1) return makeLine();
        return display.getRowText(row-1);
    }

    private String makeLine() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < display.getColumns(); i++) {
            s.append(ch);
        }
        return s.toString();
    }
}
