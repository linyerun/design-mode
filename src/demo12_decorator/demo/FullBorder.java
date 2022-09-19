package demo12_decorator.demo;

public class FullBorder extends Border{

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns()+2;
    }

    @Override
    public int getRows() {
        return display.getRows()+2;
    }

    @Override
    public String getRowText(int row) {
        //范围：[0,getRows()+1]
        if (row == 0 || row == display.getRows()+1) return "+" + makeLine('-', display.getColumns()) + "+";
        return display.getRowText(row-1);
    }

    private String makeLine(char ch, int count) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < count; i++) {
            s.append(ch);
        }
        return s.toString();
    }

}
