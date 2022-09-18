package demo11_composite.demo;

//糅合了内容与容器 => 从add方法看出这个特点
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    protected abstract void printList(String prefix);

    public Entry add(Entry entry) throws FileTreatmentException {   // 加入目录条目
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";//Template Method
    }
}
