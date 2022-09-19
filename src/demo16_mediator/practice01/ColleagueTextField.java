package demo16_mediator.practice01;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {

    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled?Color.WHITE : Color.LIGHT_GRAY);//true: 白色, false: 浅灰色
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();//当文字发送变化时，通知Mediator
    }
}
