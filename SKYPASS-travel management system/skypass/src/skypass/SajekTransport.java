/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;


public class SajekTransport extends JFrame{
    
    SajekTransport(){
    this.setBounds(450,300,560,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getResource("design\\aboutPlaces\\s_trans1.jpg"));
        JLabel label = new JLabel(img);
        JScrollPane scroll = new JScrollPane(label);
        scroll.setBorder(new LineBorder(Color.black));
        scroll.setBounds(0,0,570,420);
        add(scroll);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.black);
	setJMenuBar(menuBar);
		
       JMenu m1 = new JMenu("Pages");
        m1.setForeground(Color.white);
        m1.setBorder(new LineBorder(Color.white,2));
	menuBar.add(m1);
        
 
        JMenuItem mi1 = new JMenuItem("Page:2");
	m1.add(mi1);
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              new SajekTransport_2().setVisible(true);
            }
        });
        
        JMenuItem mi2 = new JMenuItem("page:3");
        m1.add(mi2);
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              new SajekTransport_3().setVisible(true);
            }
        });
        
        JMenuItem mi3 = new JMenuItem("page:4");
        m1.add(mi3);
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              new SajekTransport_4().setVisible(true);
            }
        });
        
        JMenuItem mi4 = new JMenuItem("page:5");
        m1.add(mi4);
        mi4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              new SajekTransport_5().setVisible(true);
            }
        });
        
        JMenu m2 = new JMenu("Back");
         m2.setForeground(Color.white);
        m2.setBorder(new LineBorder(Color.white,2));
	menuBar.add(m2);
        JMenuItem m21 = new JMenuItem("Dashboard");
        m2.add(m21);
         m21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                dispose();
                new dashBoard().setVisible(true);
            }
        });
       
        
        
        
        
}
    public static void main(String[]args){
    SajekTransport frm = new SajekTransport();
    frm.setVisible(true);
    }
}

