package demo10_strategy.demo;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(long seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (won) return prevHand;
        prevHand = Hand.getHand(random.nextInt(3));
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
