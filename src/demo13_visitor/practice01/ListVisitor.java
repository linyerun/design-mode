package demo13_visitor.practice01;

import java.util.Iterator;

//demo
public class ListVisitor extends Visitor {

    private String currentDir = "";                         // 当前访问的文件夹的名字

    public void visit(File file) {                  // 在访问文件时被调用
        System.out.println(currentDir + "/" + file);
    }

    public void visit(Directory directory) {   // 在访问文件夹时被调用
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
