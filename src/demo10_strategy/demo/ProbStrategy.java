package demo10_strategy.demo;

import java.util.Random;

public class ProbStrategy implements Strategy{

    private Random random;
    private int preHandValue = 0;
    private int curHandValue = 0;
    private int[][] history = {
            {1,1,1},
            {1,1,1},
            {1,1,1}
    };

    public ProbStrategy(long seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(curHandValue));
        int handvalue = 0;
        if (bet < history[curHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[curHandValue][0] + history[curHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        preHandValue = curHandValue;
        curHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[preHandValue][curHandValue]++;
        }else {
            history[preHandValue][(curHandValue+1)%3]++;
            history[preHandValue][(curHandValue+2)%3]++;
        }
    }

    private int getSum(int hv) {
        int sum = 0;
        //上一局出hv，这一局出{0,1,2}
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }
}
