package demo14_chainOfResponsibility.practice_4;

public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name,int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
