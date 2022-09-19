package demo13_visitor.practice01;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
