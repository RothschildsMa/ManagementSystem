package com.itheima.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginJFrame extends JFrame implements MouseListener {
    JFrame loginJFrame;
    String str;
    JButton jb;
    JTextField userJTextField;
    JTextField passJTextField;
    public LoginJFrame(){

        initFrame();

        initButton();

        initText();

        initImage();

        loginJFrame.setVisible(true);
    }

    private void initFrame() {
        //
        loginJFrame = new JFrame("ログイン画面");
        loginJFrame.setSize(488, 430);
        loginJFrame.setAlwaysOnTop(true);
        loginJFrame.setLocationRelativeTo(null);
        loginJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginJFrame.setLayout(null);


    }

    private void initButton(){
        jb = new JButton("ログイン");
        jb.setBounds(200,200,70,30);
        jb.addMouseListener(this);
        loginJFrame.getContentPane().add(jb);
    }

    private void initText() {
        userJTextField = new JTextField("");
        userJTextField.setBounds(144,100,200,30);
        loginJFrame.getContentPane().add(userJTextField);

        passJTextField = new JTextField("");
        passJTextField.setBounds(144,150,200,30);
        loginJFrame.getContentPane().add(passJTextField);
    }

    private void initImage() {
        JLabel user = new JLabel("アカウント");
        user.setBounds(100, 100, 50, 30);
        loginJFrame.getContentPane().add(user);
        JLabel pass = new JLabel("パスワード");
        pass.setBounds(100, 150, 50, 30);
        loginJFrame.getContentPane().add(pass);

        //
        //JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\loginImages\\loginBackGround.jpg"));
        //jLabel.setBounds(0, 0, 488, 430);
        //loginJFrame.getContentPane().add(jLabel);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //str = userJTextField.getText();
        //System.out.println(str);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}