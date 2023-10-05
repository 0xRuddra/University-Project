
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


public class SajekHotel extends JFrame {
    
    SajekHotel(){
         this.setBounds(450,300,560,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getResource("design\\aboutPlaces\\s_resort.jpg"));
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
              new SajekHotel_2().setVisible(true);
            }
        });
        
        JMenuItem mi2 = new JMenuItem("page:3");
        m1.add(mi2);
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              new SajekHotel_3().setVisible(true);
            }
        });
        
        JMenu m2 = new JMenu("Back");
         m2.setForeground(Color.white);
        m2.setBorder(new LineBorder(Color.white,2));
	menuBar.add(m2);
        JMenuItem mi3 = new JMenuItem("Dashboard");
        m2.add(mi3);
         mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                dispose();
                new dashBoard().setVisible(true);
            }
        });
       
      
         
    }
    public static void main(String[] args) {
         SajekHotel frame = new SajekHotel();
         frame.setVisible(true);
    }
}

