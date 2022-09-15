package demo05_Singleton.demo02_ticket.content;

public class TicketMaker {

    private static TicketMaker singleton = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
        System.out.println("生成一个实例");
    }

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getTicketNumber() {
        return ticket++;
    }
}
