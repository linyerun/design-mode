package demo09_bridge.demo;

//Practice-2
public class TestTextDisplayMain {
    public static void main(String[] args) {
        Display display = new Display(new TextDisplayImpl("src/demo09_bridge/demo/resources/text.txt"));
        display.display();
    }
}
