/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;


public class transport extends JFrame {
    
    
    transport(){
        this.setBounds(450,300,560,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getResource("design\\aboutPlaces\\coxs3.jpg"));
        JLabel label = new JLabel(img);
        JScrollPane scroll = new JScrollPane(label);
        scroll.setBorder(new LineBorder(Color.black));
        scroll.setBounds(0,0,570,420);
        add(scroll);
        
        
        /*JButton btn = new JButton("Back");
        btn.setBounds(225,540,80,25);
        btn.setBorder(null);
        btn.setBackground(Color.black);
        btn.setForeground(Color.white);
        add(btn);*/
        
        
}
    public static void main(String[] args) {
        transport frame = new transport();
        frame.setVisible(true);
       
    }
}
