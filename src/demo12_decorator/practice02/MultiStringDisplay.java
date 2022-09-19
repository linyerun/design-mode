package demo12_decorator.practice02;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    List<String> content = new ArrayList<>();

    @Override
    public int getColumns() {
        int max = 0;
        for (String s : content)
            max = Math.max(s.getBytes().length,max);
        return max;
    }

    @Override
    public int getRows() {
        return content.size();
    }

    @Override
    public String getRowText(int row) {
        if (row < 0 || row >= content.size()) return null;
        int columns = getColumns();
        return content.get(row)+makeSpace(columns-content.get(row).getBytes().length);
    }

    private String makeSpace(int cnt) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < cnt; i++) {
            s.append(" ");
        }
        return s.toString();
    }

    public void add(String contentLine) {
        content.add(contentLine);
    }
}
