/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author MIT
 */
public class coxsHotel extends JFrame {
    
    coxsHotel(){
         this.setBounds(450,300,560,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getResource("design\\aboutPlaces\\coxs4.jpg"));
        JLabel label = new JLabel(img);
        JScrollPane scroll = new JScrollPane(label);
        scroll.setBorder(new LineBorder(Color.black));
        scroll.setBounds(0,0,570,420);
        add(scroll);
    }
    public static void main(String[] args) {
         coxsHotel frame = new coxsHotel();
         frame.setVisible(true);
    }
}
