/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


   

public class bestPlaces extends JFrame  {
    private Container c;
    private JLabel lab1,lab2,lab3;
    private JLabel p1,p2,p3,p4,p5;
    JLabel[] cngl =new JLabel[]{p1,p2,p3,p4,p5};
    private ImageIcon img1,img2,bpi1,bpi2,bpi3,bpi4,bpi5;
    private JButton btn1,btn2,btn3,btn4,btn5,backbtn;
     bestPlaces(){
         this.setBounds(750,350,690,480);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.black);
        
         
        /* img1 =  new ImageIcon(getClass().getResource("design\\prearw.png"));
         lab1 = new JLabel(img1);
         lab1.setBounds(20,120,80,80);
         lab1.setBorder(new LineBorder(Color.black));
         c.add(lab1);
         
         img2 = new ImageIcon(getClass().getResource("design\\nextarw.png"));
         lab2 = new JLabel(img2);
         lab2.setBounds(570,120,80,80);
         lab2.setBorder(new LineBorder(Color.black));
         c.add(lab2);
                */
         
         bpi1 = new ImageIcon(getClass().getResource("design\\bestplace\\btn_event.png"));
         bpi2= new ImageIcon(getClass().getResource("design\\bestplace\\btn_Evnt.png"));
         bpi3= new ImageIcon(getClass().getResource("design\\bestplace\\btn_event.png"));
         bpi4= new ImageIcon(getClass().getResource("design\\bestplace\\btn_Evnt.png"));
         bpi5= new ImageIcon(getClass().getResource("design\\bestplace\\btn_noevnt.jpg"));
         
         p1= new JLabel(bpi1);
         p2=new JLabel(bpi2);
         p3=new JLabel(bpi3);
         p4=new JLabel(bpi4);
         p5=new JLabel(bpi5);
         
        
         p1.setBounds(40,20,100,100);
         p1.setBorder(new LineBorder(Color.white,4));
         c.add(p1);
         p2.setBounds(40,150,100,100);
         p2.setBorder(new LineBorder(Color.white,4));
         c.add(p2);
         p3.setBounds(40,280,100,100);
         p3.setBorder(new LineBorder(Color.white,4));
         c.add(p3);
         
         p4.setBounds(320,20,100,100);
         p4.setBorder(new LineBorder(Color.white,4));
         c.add(p4);
         p5.setBounds(320,150,100,100);
         p5.setBorder(new LineBorder(Color.white,4));
         c.add(p5);
         
         
        
         btn1 = new JButton("Details");
         btn1.setBounds(180,40,80,35);
         btn1.setBackground(Color.white);
         btn1.setForeground(Color.black);
          btn1.setBorder(null);
         c.add(btn1);
         btn1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              dispose();
              new  AboutPlaces().setVisible(true);
          }
         });
         
         btn2 = new JButton("Details");
         btn2.setBounds(180,170,80,35);
         btn2.setBackground(Color.white);
         btn2.setForeground(Color.black);
         btn2.setBorder(null);
         c.add(btn2);
         btn2.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              dispose();
              new  AboutBicanakandi().setVisible(true);
          }
         });
         
         
         btn3 = new JButton("Details");
         btn3.setBounds(180,310,80,35);
        btn3.setBackground(Color.white);
         btn3.setForeground(Color.black);
         btn3.setBorder(null);
         c.add(btn3);
         btn3.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              dispose();
              new  AboutPlaces().setVisible(true);
          }
         });
         
         btn4 = new JButton("Details");
         btn4.setBounds(470,40,80,35);
         btn4.setBackground(Color.white);
         btn4.setForeground(Color.black);
          btn4.setBorder(null);
         c.add(btn4);
         btn4.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 dispose();
                 new AboutKaptai().setVisible(true);
             }
         });
         
          
         btn5 = new JButton("Details");
         btn5.setBounds(470,170,80,35);
         btn5.setBackground(Color.white);
         btn5.setForeground(Color.black);
         btn5.setBorder(null);
         c.add(btn5);
         btn5.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 dispose();
                 new AboutSajek().setVisible(true);
             }
         });
         
        /*
         lab3= new JLabel(bpi1);
         lab3.setBounds(100,30,470,350);
         lab3.setBackground(Color.yellow);
         lab3.setBorder(new LineBorder(Color.BLUE));
         c.add(lab3);*/
         
         backbtn = new JButton("Back");
                backbtn.setBounds(290,380,100,30);
                backbtn.setBackground(Color.white);
                backbtn.setForeground(Color.black);
                backbtn.setBorder(null);
                c.add(backbtn);
               
                backbtn.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
               dispose();
               new dashBoard().setVisible(true);
            }
                });
}

    public static void main(String[] args) {
        bestPlaces frame = new bestPlaces();
        frame.setVisible(true);
        
    }
}
