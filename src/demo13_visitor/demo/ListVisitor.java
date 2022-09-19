package demo13_visitor.demo;

import java.util.Iterator;

public class ListVisitor extends Visitor{

    private String currDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currDir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currDir+"/"+directory);
        String saveDir = currDir;
        currDir = currDir + "/" + directory.getName();//理解成回溯那个(dfs)
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            it.next().accept(this);
        }
        currDir = saveDir;
    }
}
