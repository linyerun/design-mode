package demo00_testPackage;

import java.util.ArrayList;
import java.util.List;

public class TestClone implements Cloneable{

    private List<Integer> list = new ArrayList<>();

    public void add(Integer age) {
        list.add(age);
    }

    public TestClone create() {
        TestClone t = null;
        try {
            t = (TestClone) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return t;
    }

    public void write() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TestClone testClone = new TestClone();
        TestClone t = testClone.create();
        testClone.add(1);
        t.add(2);
        testClone.write();
        t.write();
    }
}
