package demo13_visitor.practice01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));

            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrDir.add(yuki);
            usrDir.add(hanako);
            usrDir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            hanako.add(new File("index.html", 350));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));

            FileFindVisitor ffv = new FileFindVisitor(".html");
            rootDir.accept(ffv);

            System.out.println("HTML files are:");
            Iterator it = ffv.getFoundFiles();
            while (it.hasNext()) {
                File file = (File)it.next();
                System.out.println(file.toString());
            }

            //P2 Test
            SizeVisitor sizeVisitor = new SizeVisitor();
            rootDir.accept(sizeVisitor);
            System.out.println("P2 Test sizeVisitor-root: "+sizeVisitor.getSize());

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
