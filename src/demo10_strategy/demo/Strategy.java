package demo10_strategy.demo;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
