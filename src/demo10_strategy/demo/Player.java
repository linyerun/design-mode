package demo10_strategy.demo;

public class Player {

    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {         // 赋予姓名和策略
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {                                // 策略决定下一局要出的手势
        return strategy.nextHand();
    }

    public void win() {                 // 胜
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {                // 负
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {                // 平
        gameCount++;
    }

    public String toString() {
        return "[" + name + ":" + gameCount + " games, " + winCount + " win, " + loseCount + " lose" + "]";
    }

}
