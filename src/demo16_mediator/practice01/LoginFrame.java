package demo16_mediator.practice01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUsername;
    private ColleagueTextField textPassword;
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        // 使用布局管理器生成4*2窗格
        setLayout(new GridLayout(4,2));
        //生成各个Colleague
        createColleagues();
        //配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("username: "));
        add(textUsername);
        add(new Label("password: "));
        add(textPassword);
        add(buttonOK);
        add(buttonCancel);
        //设置初始化的启动/禁止状态
        colleagueChanged();
        //显示
        pack();
        show();
    }

    @Override
    public void createColleagues() {    // 生成各个Colleague。
        // 生成
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        textUsername = new ColleagueTextField("", 10);
        textPassword = new ColleagueTextField("", 10);
        textPassword.setEchoChar('*');
        buttonOK = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        // 设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUsername.setMediator(this);
        textPassword.setMediator(this);
        buttonOK.setMediator(this);
        buttonCancel.setMediator(this);
        // 设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUsername.addTextListener(textUsername);
        textPassword.addTextListener(textPassword);
        buttonOK.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // 接收来自于Colleague的通知然后判断各Colleague的启用/禁用状态。
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) { // Guest mode
            textUsername.setColleagueEnabled(false);
            textPassword.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(true);
        } else { // Login mode
            textUsername.setColleagueEnabled(true);
            usernamePasswordChanged();
        }
    }

    // 当textUser或是textPass文本输入框中的文字发生变化时
    // 判断各Colleague的启用/禁用状态
    private void usernamePasswordChanged() {
        if (textUsername.getText().length() > 0) {
            textPassword.setColleagueEnabled(true);
            if (textPassword.getText().length() > 4 && textUsername.getText().length() > 4) {
                buttonOK.setColleagueEnabled(true);
            } else {
                buttonOK.setColleagueEnabled(false);
            }
        } else {
            textPassword.setColleagueEnabled(false);
            buttonOK.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        System.exit(0);
    }
}
