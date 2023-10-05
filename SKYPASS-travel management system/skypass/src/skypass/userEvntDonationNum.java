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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author The CY83RN4UT
 */
public class userEvntDonationNum extends JFrame {
    
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5,backbtn;
    
    userEvntDonationNum(){
        
          this.setBounds(750,350,690,480);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.black);  
         
         JLabel titlel= new JLabel("   Donation List");
         titlel.setBounds(265,15,120,40);
         titlel.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
         titlel.setBackground(Color.yellow);
         titlel.setForeground(Color.white);
         
         titlel.setBorder( new LineBorder(Color.WHITE,3));
         c.add(titlel);
         
         JLabel p1= new JLabel();
         p1.setBounds(80,102,100,30);
         p1.setBorder(new LineBorder(Color.white,4));
         c.add(p1);
         
         
         btn1 = new JButton("Details");
         btn1.setBounds(180,100,80,35);
         btn1.setBackground(Color.black);
         btn1.setForeground(Color.white);
         btn1.setBorder( new LineBorder(Color.WHITE,3));
         c.add(btn1);
         btn1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              dispose();
              new  userEvntDonationInfo().setVisible(true);
          }
         });
         
         
         JLabel p2= new JLabel();
         p2.setBounds(80,152,100,30);
         p2.setBorder(new LineBorder(Color.white,4));
         c.add(p2);
         
         btn2 = new JButton("Details");
         btn2.setBounds(180,150,80,35);
         btn2.setBackground(Color.black);
         btn2.setForeground(Color.white);
         btn2.setBorder( new LineBorder(Color.WHITE,3));
        
         c.add(btn2);
         btn2.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              dispose();
              new  userEvntDonationInfo().setVisible(true);
          }
         });
         
         
         
         
         JLabel p3= new JLabel();
         p3.setBounds(80,202,100,30);
         p3.setBorder(new LineBorder(Color.white,4));
         c.add(p3);
         
         
         btn3 = new JButton("Details");
         btn3.setBounds(180,200,80,35);
         btn3.setBackground(Color.black);
         btn3.setForeground(Color.white);
         btn3.setBorder( new LineBorder(Color.WHITE,3));
         c.add(btn3);
         btn3.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              dispose();
              new  userEvntDonationInfo().setVisible(true);
          }
         });
         
         
         JLabel p4= new JLabel();
         p4.setBounds(80,252,100,30);
         p4.setBorder(new LineBorder(Color.white,4));
         c.add(p4);
         
         btn4 = new JButton("Details");
         btn4.setBounds(180,250,80,35);
         btn4.setBackground(Color.black);
         btn4.setForeground(Color.white);
          btn4.setBorder( new LineBorder(Color.WHITE,3));
         c.add(btn4);
         btn4.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 dispose();
                 new AboutKaptai().setVisible(true);
             }
         });
         
        
         JLabel p5= new JLabel();
         p5.setBounds(80,302,100,30);
         p5.setBorder(new LineBorder(Color.white,4));
         c.add(p5);
         
         
         btn5 = new JButton("Details");
         btn5.setBounds(180,300,80,35);
         btn5.setBackground(Color.black);
         btn5.setForeground(Color.white);
         btn5.setBorder(new LineBorder(Color.WHITE,3));
         c.add(btn5);
         btn5.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 dispose();
                 new AboutSajek().setVisible(true);
             }
         });
         
         
         
        
        
    }
    
    
    
    public static void main(String [] args){
        
        userEvntDonationNum frame = new userEvntDonationNum();
        frame.setVisible(true);
        
    }
    
}
