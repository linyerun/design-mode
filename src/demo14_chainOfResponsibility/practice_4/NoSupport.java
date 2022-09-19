package demo14_chainOfResponsibility.practice_4;

public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {//自己什么也不处理，也不解决
        return false;
    }
}
