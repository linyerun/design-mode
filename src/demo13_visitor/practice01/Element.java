package demo13_visitor.practice01;

public interface Element {
    void accept(Visitor v);
}
