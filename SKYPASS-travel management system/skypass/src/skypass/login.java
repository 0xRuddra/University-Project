/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame {

    private JPanel panel1, panel2;
    private JLabel txtlb1, txtlb2, txtlb3,imgl,imgl2,imgl3;
    private JTextField textfld;
    private JPasswordField pass;
    private JButton button1, button2,button3;
    private Font fn;
    private ImageIcon img,img2,img3;
    private Container c;
    String name;

    login() {
        start();
    }

    void start() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        fn = new Font("Arial", Font.BOLD, 20);
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(129, 52, 175));
        panel1.setBounds(0, 0, 450, 440);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(33, 41, 48));
        panel2.setBounds(450, 10, 420, 365);
        c.add(panel2);

        txtlb1 = new JLabel("Welcome to the ZeroWaste");
        txtlb1.setBounds(40, 0, 400, 160);
        txtlb1.setFont(new Font("Arial",Font.BOLD,30));
        panel1.add(txtlb1);
        
        img = new ImageIcon(getClass().getResource("design\\login.png"));
        imgl= new JLabel(img);
        imgl.setBounds(105,130,200,225);
        panel1.add(imgl);
        
        txtlb2 = new JLabel("Username");
        txtlb2.setBounds(50,15,200,50);
        txtlb2.setFont(fn);
        txtlb2.setForeground(Color.white);
        panel2.add(txtlb2);
        
        textfld = new JTextField();
        textfld.setBounds(50,55,300,50);
        textfld.setBorder(BorderFactory.createEmptyBorder());
        textfld.setFont(new Font("SAN_SARIF",Font.PLAIN,25));
        panel2.add(textfld);
        
        img2 = new ImageIcon(getClass().getResource("design\\usericon.png"));
        imgl2= new JLabel(img2);
        imgl2.setBounds(340,55,70,50);
        panel2.add(imgl2);
        
        txtlb3 = new JLabel("Password");
        txtlb3.setBounds(50,115,200,50);
        txtlb3.setFont(fn);
        txtlb3.setForeground(Color.white);
        panel2.add(txtlb3);
        
        pass = new JPasswordField();
        pass.setBounds(50,158,302,50);
        pass.setFont(new Font("SAN_SARIF",Font.PLAIN,25));
        pass.setBorder(null);
        panel2.add(pass);
        
        img3 = new ImageIcon(getClass().getResource("design\\icon.png"));
        imgl3 = new JLabel(img3);
        imgl3.setBounds(350,148,50,70);
        panel2.add(imgl3);
        
        
        button1 = new JButton("Login");
        button1.setBounds(50,250,150,30);
        button1.setBackground(new Color(129,52,175));
        button1.setForeground(Color.white);
        
        button1.setBorder(null);
        panel2.add(button1);
        button1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
                name = textfld.getText();
               
               char[] password = pass.getPassword();
               if("one".equals(name)){
                   dispose();
                   new LoadoutPage().setVisible(true);
               }
           }
        });
        
        
        
          
        button2 = new JButton("SignUp");
        button2.setBounds(250,250,150,30);
        button2.setBackground(new Color(129,52,175));
        button2.setBorder(null);
        button2.setForeground(Color.white);
        
        panel2.add(button2);
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new signup().setVisible(true);
                dispose();
            }
        });
        
        button3 = new JButton("Forgot Password");
        button3.setBounds(152,300,150,30);
        button3.setBackground(new Color(129,52,175));
        button3.setBorder(null);
         
        button3.setForeground(Color.white);
        panel2.add(button3);
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new forgetPassword().setVisible(true);
            }
        });
        
        
        this.setBounds(500, 300, 900, 440);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 

    }

    public static void main(String[] args) {

        login frame = new login();
        frame.setBounds(500, 300, 900, 440);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
