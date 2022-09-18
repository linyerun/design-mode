package demo10_strategy.demo;

public class Hand {

    public static final int HANDVALUE_GUU = 0;  // 表示石头的值
    public static final int HANDVALUE_CHO = 1;  // 表示剪刀的值
    public static final int HANDVALUE_PAA = 2;  // 表示布的值
    public static final Hand[] hand = {         // 表示猜拳中3种手势的实例
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {      // 表示猜拳中手势所对应的字符串
            "石头", "剪刀", "布",
    };
    private int handValue;                      // 表示猜拳中出的手势的值

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) { // 根据手势的值获取其对应的实例
        return hand[handValue];
    }


    private int fight(Hand h) {                 // 计分：平0, 胜1, 负-1
        if (h.handValue == handValue) return 0;
        else if ((handValue+1)%3 == h.handValue) return 1;
        return 0;
    }

    public boolean isStrongerThan(Hand h) {     // 如果this胜了h则返回true
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {       // 如果this输给了h则返回true
        return fight(h) == -1;
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
