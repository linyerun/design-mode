package demo16_mediator.demo;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) { //保存Mediator
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) { //Mediator下达启用/禁止的指示
        setEnabled(enabled);
    }
}
