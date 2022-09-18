package demo11_composite.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{

    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) { //初看作者写以为垃圾,后来发现垃圾是我。
        System.out.println(prefix+"/"+this);
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            it.next().printList(prefix+"/"+name);
        }
    }

    //TODO 为什么要使用Entry做返回值并返回当前this呢？(大概是为了实现链式编程吧)
    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        directory.add(entry);
        return this;
    }
}
