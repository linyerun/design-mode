package demo11_composite.practice;

//糅合了内容与容器 => 从add方法看出这个特点
public abstract class Entry {

    protected Entry parent;

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

    //Practice-2 (使用了getName => Template Method)
    public String getFullName() {
        StringBuffer sb = new StringBuffer();

        Entry entry = this;
        do {
           sb.insert(0,"/"+entry.getName());
           entry = entry.parent;
        }while (entry != null);

        return sb.toString();
    }
}
