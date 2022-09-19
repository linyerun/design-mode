package demo13_visitor.demo;

public interface Element {
    void accept(Visitor v);
}
