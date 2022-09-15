package demo05_Singleton.demo02_ticket;

import demo05_Singleton.demo02_ticket.content.TicketMaker;

public class Application {
    public static void main(String[] args) {
        System.out.println("Start!");
        for (int i = 0; i < 10; i++) {
            System.out.println(TicketMaker.getInstance().getTicketNumber());
        }
        System.out.println("End!");
    }
}
