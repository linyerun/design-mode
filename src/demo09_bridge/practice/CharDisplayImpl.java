package demo09_bridge.practice;

public class CharDisplayImpl extends DisplayImpl {

    private char ch;
    private char start;
    private char end;

    public CharDisplayImpl(char ch, char start, char end) {
        this.ch = ch;
        this.start = start;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(ch);
    }

    @Override
    public void rawClose() {
        System.out.print(end);
        System.out.println();//换行
    }
}
