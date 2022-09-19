package demo13_visitor.practice01;

public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
