package demo09_bridge.demo;

//Practice-1
public class RandomDisplay extends Display{

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        int randomTimes = (int) (Math.random()*times);
        for (int i = 0; i < randomTimes; i++) {
            print();
        }
        close();
    }
}
