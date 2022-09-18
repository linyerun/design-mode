package demo11_composite.demo;

public class Demo11Main {
    //并没用try catch那个自定义的RuntimeException
    public static void main(String[] args) {
        /*
            -root
                -bin
                    -vi(file)
                    -latex(file)
                -tmp
                -usr
        * */
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        //打印结果
        rootDir.printList();

        System.out.println();
        System.out.println("Making user entries...");

        /*
            -root
                -bin
                    -vi(file)
                    -latex(file)
                -tmp
                -usr
                    -yuki
                        -diary.html
                        -Composite.java
                    -hanako
                        -memo.tex
                    -tomura
                        -game.doc
                        -junk.mail
        * */
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");
        usrDir.add(yuki);
        usrDir.add(hanako);
        usrDir.add(tomura);
        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Composite.java", 200));
        hanako.add(new File("memo.tex", 300));
        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));
        rootDir.printList();
    }
}
