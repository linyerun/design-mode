package demo05_Singleton.demo03_triple.content;

public class Triple {

    private static Triple[] triples = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };
    private int id;

    private Triple(int id) {
        System.out.println("The instance "+id+" is created.");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triples[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
