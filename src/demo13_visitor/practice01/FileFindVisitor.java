package demo13_visitor.practice01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//P-1
public class FileFindVisitor extends Visitor{

    List<Entry> entryList = new ArrayList<>();
    private String suffix;

    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix))
            entryList.add(file);
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            it.next().accept(this);
        }
    }

    public Iterator getFoundFiles() {
        return entryList.iterator();
    }
}
