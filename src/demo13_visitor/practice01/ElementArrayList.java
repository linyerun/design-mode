package demo13_visitor.practice01;

import java.util.ArrayList;
import java.util.Iterator;

//一开始我写的不够优雅，不太符合题目要求，这个答案就很nice
//这个accept和v.visit用谁是个值得思考的问题。
public class ElementArrayList extends ArrayList<Element> implements Element {
    @Override
    public void accept(Visitor v) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) it.next().accept(v);
    }
}
