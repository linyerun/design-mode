package demo09_bridge.demo;

public class Demo09Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello,World!"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe!"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        //Practice-1
        System.out.println("===============隔离带================");
        RandomDisplay randomDisplay = new RandomDisplay(new StringDisplayImpl("LinYeRun,come on!"));
        randomDisplay.randomDisplay(10);
    }
}
