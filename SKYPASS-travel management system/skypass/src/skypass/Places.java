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


public class Places extends JFrame {
    private Container c;
    private ImageIcon img;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6;
    private JLabel lb1,lb2,lb3,lb4,lb5,lb6;
    
    Places(){
        this.setBounds(500,280,800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        img = new ImageIcon(getClass().getResource("design\\Beautiful Bangladesh.png"));
        lb1 = new JLabel(img);
        lb1.setBounds(0,0,800,600);
        c.add(lb1);
        btn1 = new JButton("Sundorban");
       btn1.setBounds(270,390,100,25);
       btn1.setBackground(Color.green);
       btn1.setBorder(new LineBorder(Color.black,2));
       //btn1.setForeground(Color.red);
       lb1.add(btn1);
        btn2 = new JButton("Cox's Bazar");
        btn2.setBounds(590,290,100,25);
       btn2.setBackground(Color.green);
        btn2.setBorder(new LineBorder(Color.black,2));
       //btn1.setForeground(Color.red);
       lb1.add(btn2);
       btn2.addActionListener(new ActionListener(){
           public void actionPerformed( ActionEvent ae){
               dispose();
               new AboutPlaces().setVisible(true);
           }
       });
       
        btn3 = new JButton("Lal Bag");
        btn3.setBounds(300,200,100,25);
       btn3.setBackground(Color.green);
        btn3.setBorder(new LineBorder(Color.black,2));
       //btn1.setForeground(Color.red);
       lb1.add(btn3);
       btn3.addActionListener(new ActionListener(){
           public void actionPerformed( ActionEvent ae){
               dispose();
               new aboutLalBag().setVisible(true);
           }
       });
       
       btn4 = new JButton("BicanaKandi");
        btn4.setBounds(420,160,100,25);
       btn4.setBackground(Color.green);
        btn4.setBorder(new LineBorder(Color.black,2));
       //btn1.setForeground(Color.red);
       lb1.add(btn4);
       btn4.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               dispose();
               new AboutBicanakandi().setVisible(true);
           }
       });
      
        
        
        
    }
    
    public static void main(String[] args) {
        Places frame = new Places();
        frame.setVisible(true);
    }
}
