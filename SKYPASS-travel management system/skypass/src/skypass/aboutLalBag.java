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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author MIT
 */
public class aboutLalBag extends JFrame {
    
    private Container c;
    private JLabel uperlbl,lowerlbl,piclbl,piclbl2,underlbl,detailslbl;
    private JPanel panel2,panel1;
    private ImageIcon img1,img2,img3,img4;
    JMenu m1,m2,m3,m4;
    JMenuBar menuBar;
    JScrollPane scroll;
    aboutLalBag(){
        this.setBounds(500,200,600,680);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         c =this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.black);
         
         uperlbl = new JLabel();
         uperlbl.setBounds(10,20,570,155);
         uperlbl.setBorder(new LineBorder(new Color(129, 52, 175),4));
         c.add(uperlbl);
         
         detailslbl = new JLabel("INFORMATION");
         detailslbl.setBounds(80,75,150,35);
         detailslbl.setForeground(Color.white);
         detailslbl.setFont(new Font("Arial",Font.BOLD,20));
         uperlbl.add(detailslbl);
         
        img1 = new ImageIcon(getClass().getResource("design\\d_picture\\lalbag.jpg"));
         piclbl = new JLabel(img1);
         piclbl.setBounds(280,-5,280,150);
         //piclbl.setBackground(Color.yellow);
         piclbl.setBorder(new LineBorder(Color.black));
         uperlbl.add(piclbl);
         
        underlbl = new JLabel("Lal Bag");
         underlbl.setBounds(390,175,100,25);
         underlbl.setForeground(Color.white);
         c.add(underlbl);
         
         img3 = new ImageIcon(getClass().getResource("design\\aboutPlaces\\lal2.jpg"));
         lowerlbl = new JLabel(img3);
         
         scroll = new JScrollPane(lowerlbl);
         scroll.setBounds(10,200,570,420);
         scroll.setBorder(new LineBorder(new Color(129, 52, 175),4));
         c.add(scroll);
         
         
         
         
         menuBar = new JMenuBar();
        menuBar.setBackground(Color.black);
	setJMenuBar(menuBar);
		
        m1 = new JMenu("HOTELS");
        m1.setForeground(Color.white);
        m1.setBorder(new LineBorder(Color.white,2));
	menuBar.add(m1);
        
 
        JMenuItem mi1 = new JMenuItem("VIEW HOTELS");
	m1.add(mi1);
        mi1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                dispose();
                new coxsHotel().setVisible(true);
            }
        });
       
       
         JMenuItem mi2 = new JMenuItem("PACKAGES");
	m1.add(mi2);
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                  dispose();
                 new ViewPackage().setVisible(true);
                }catch(Exception e){ }
            }
	});
        
        m2 = new JMenu("TRANSPORT");
        m2.setForeground(Color.white);
        m2.setBorder(new LineBorder(Color.white,2));
	menuBar.add(m2);
        JMenuItem mi8 = new JMenuItem("Info");
        m2.add(mi8);
        mi8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                  //dispose();
                 new LalTransport().setVisible(true);
                }catch(Exception e){ }
            }
	});
        
         m3 = new JMenu("UTILITY");
        m3.setForeground(Color.white);
        m3.setBorder(new LineBorder(Color.white,2));
	menuBar.add(m3);
        
        JMenuItem mi6 = new JMenuItem("NOTEPAD");
	m3.add(mi6);
        
        JMenuItem mi7 = new JMenuItem("CALCULATOR");
	m3.add(mi7);
        
        mi6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     new ViewPackage().setVisible(true);
                }catch(Exception e){ }
            }
	});
        
        mi7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }
	});
        
        
          m4 = new JMenu("Book Package");
        m4.setForeground(Color.white);
        m4.setBorder(new LineBorder(Color.white,2));
	menuBar.add(m4);
        
    }
    public static void main(String[] args) {
        
        aboutLalBag frm = new aboutLalBag();
        frm.setVisible(true);
    }
}
