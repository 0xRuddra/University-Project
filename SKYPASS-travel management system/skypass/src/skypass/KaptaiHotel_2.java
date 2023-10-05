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
public class KaptaiHotel_2 extends JFrame {
    
    KaptaiHotel_2(){
         this.setBounds(450,300,560,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getResource("design\\aboutPlaces\\kap_resort 2.jpg"));
        JLabel label = new JLabel(img);
        JScrollPane scroll = new JScrollPane(label);
        scroll.setBorder(new LineBorder(Color.black));
        scroll.setBounds(0,0,570,420);
        add(scroll);
    }
    public static void main(String[] args) {
         KaptaiHotel_2 frame = new KaptaiHotel_2();
         frame.setVisible(true);
    }
}

