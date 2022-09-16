package demo09_bridge.practice;

public class CtrlCountDisplay extends Display{

    public CtrlCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void ctrlCountDisplay(int times,int steps) {
        for (int i = 0; i < steps; i++) {
            open();
            for (int j = 0; j < i * times; j++) {
                print();
            }
            close();
        }
    }
}
