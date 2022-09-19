package demo13_visitor.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{

    private String name;
    private ArrayList<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = dir.iterator();
        while (it.hasNext()) size += it.next().getSize();
        return size;
    }

    @Override
    public Iterator iterator() throws FileTreatmentException {
        return dir.iterator();
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        dir.add(entry);
        return this;//链式调用添加
    }

    @Override
    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
