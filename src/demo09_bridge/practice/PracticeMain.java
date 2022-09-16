package demo09_bridge.practice;

public class PracticeMain {
    public static void main(String[] args) {
        CharDisplayImpl c1 = new CharDisplayImpl('*', '<', '>');
        CharDisplayImpl c2 = new CharDisplayImpl('#', '|', '-');
        CtrlCountDisplay d1 = new CtrlCountDisplay(c1);
        CtrlCountDisplay d2 = new CtrlCountDisplay(c2);
        d1.ctrlCountDisplay(1,4);
        d2.ctrlCountDisplay(2,6);
    }
}
