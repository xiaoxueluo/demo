package com.example.demo;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
@Component
public class Swingclient extends JFrame implements ActionListener {
//    @Autowired
//    private Client client;

    /**
     *
     */
    private static final long serialVersionUID = 2572235358190956651L;

    /**
     * 玩家信息
     */
    //private PlayerResponse playerResponse;

    /**
     * 用户名
     */
    private JTextField playerName;

    /**
     * 密码
     */
    private JTextField passward;

    /**
     * 登录按钮
     */
    private JButton loginButton;


    /**
     * 注册按钮
     */
    private JButton register;

    /**
     * 聊天内容
     */
    private JTextArea chatContext;

    /**
     * 发送内容
     */
    private JTextField message;

    /**
     * 目标用户
     */
    private JTextField targetPlayer;

    /**
     * 发送按钮
     */
    private JButton sendButton;

    /**
     * 操作提示
     */
    private JLabel tips;



    public Swingclient() {

        getContentPane().setLayout(null);

        //登录部分
        JLabel lblIp = new JLabel("角色名");
        lblIp.setFont(new Font("宋体", Font.PLAIN, 12));
        lblIp.setBounds(76, 40, 54, 15);
        getContentPane().add(lblIp);

        playerName = new JTextField();
        playerName.setBounds(139, 37, 154, 21);
        getContentPane().add(playerName);
        playerName.setColumns(10);

        JLabel label = new JLabel("密  码");
        label.setFont(new Font("宋体", Font.PLAIN, 12));
        label.setBounds(76, 71, 54, 15);
        getContentPane().add(label);

        passward = new JTextField();
        passward.setColumns(10);
        passward.setBounds(139, 68, 154, 21);
        getContentPane().add(passward);

        //登录
        loginButton = new JButton("登录");
        loginButton.setFont(new Font("宋体", Font.PLAIN, 12));
        //loginButton.setActionCommand(ButtonCommand.LOGIN);
        loginButton.addActionListener(this);
        loginButton.setBounds(315, 37, 93, 23);
        getContentPane().add(loginButton);

        //注册
        register = new JButton("注册");
        register.setFont(new Font("宋体", Font.PLAIN, 12));
        //register.setActionCommand(ButtonCommand.REGISTER);
        register.addActionListener(this);
        register.setBounds(315, 67, 93, 23);
        getContentPane().add(register);

        //聊天内容框
        chatContext = new JTextArea();
        chatContext.setLineWrap(true);

        JScrollPane scrollBar = new JScrollPane(chatContext);
        scrollBar.setBounds(76, 96, 93, 403);
        scrollBar.setSize(336, 300);
        getContentPane().add(scrollBar);


        //发送部分
        JLabel label_7 = new JLabel("消息");
        label_7.setFont(new Font("宋体", Font.PLAIN, 12));
        label_7.setBounds(76, 411, 54, 15);
        getContentPane().add(label_7);

        message = new JTextField();
        message.setBounds(139, 408, 222, 21);
        getContentPane().add(message);
        message.setColumns(10);

        JLabel lblid = new JLabel("角色");
        lblid.setFont(new Font("宋体", Font.PLAIN, 12));
        lblid.setBounds(76, 436, 43, 24);
        getContentPane().add(lblid);

        targetPlayer = new JTextField();
        targetPlayer.setBounds(139, 438, 133, 21);
        getContentPane().add(targetPlayer);
        targetPlayer.setColumns(10);

        sendButton = new JButton("发送");
        sendButton.setFont(new Font("宋体", Font.PLAIN, 12));
        sendButton.setBounds(382, 407, 67, 23);
        //sendButton.setActionCommand(ButtonCommand.SEND);
        sendButton.addActionListener(this);
        getContentPane().add(sendButton);

        //错误提示区域
        tips = new JLabel();
        tips.setForeground(Color.red);
        tips.setFont(new Font("宋体", Font.PLAIN, 14));
        tips.setBounds(76, 488, 200, 15);
        getContentPane().add(tips);


        int weigh = 500;
        int heigh = 600;
        int w = (Toolkit.getDefaultToolkit().getScreenSize().width - weigh) / 2;
        int h = (Toolkit.getDefaultToolkit().getScreenSize().height - heigh) / 2;
        this.setLocation(w, h);
        this.setTitle("聊天工具");
        this.setSize(weigh, heigh);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
