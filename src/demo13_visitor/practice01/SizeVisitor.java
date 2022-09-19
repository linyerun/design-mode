package demo13_visitor.practice01;

import java.util.Iterator;

//P-2
public class SizeVisitor extends Visitor{

    private int dirSize;

    @Override
    public void visit(File file) {
        dirSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            it.next().accept(this);
        }
    }

    public int getSize() {
        return dirSize;
    }
}
