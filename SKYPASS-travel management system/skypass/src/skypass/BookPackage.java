
package skypass;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class BookPackage extends JFrame{
    
    BookPackage ( )
    {
        Choice c1;
        JLabel l11,l12,l13,l14,l15;
        JTextField t1;
        JButton b1,b2,b3;
        
        
        setBounds(420, 220, 1100, 450);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/Bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
                JLabel l16 = new JLabel(i3);
                l16.setBounds(450,50,700,300);
                add(l16);
        
        JLabel l1 = new JLabel("BOOK PACKAGE");
		l1.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		l1.setBounds(118, 11, 300, 53);
		add(l1);
                
        JLabel l2 = new JLabel("Username");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l2.setBounds(35, 70, 200, 14);
		add(l2);
                
        l11 = new JLabel();
		l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l11.setBounds(271, 70, 200, 14);
		add(l11); 
                
        JLabel l3 = new JLabel("Select Package");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l3.setBounds(35, 110, 200, 14);
		add(l3);
                
        
        c1 = new Choice();
                c1.add("Gold Package");
                c1.add("Silver Package");
                c1.add("Bronze Package");
                c1.setBounds(250, 110, 200, 30);
                add(c1);
                
        JLabel l4 = new JLabel("Total Persons");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l4.setBounds(35, 150, 200, 14);
		add(l4);
                
        t1 = new JTextField();
		t1.setBounds(271, 150, 150, 20);
		add(t1);
                
        JLabel l5 = new JLabel("ID :");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l5.setBounds(35, 190, 200, 14);
		add(l5);
                
        l12 = new JLabel();
		l12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l12.setBounds(271, 190, 200, 14);
		add(l12);
        
	JLabel l6 = new JLabel("Number :");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l6.setBounds(35, 230, 200, 14);
		add(l6);
                
        l13 = new JLabel();
		l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l13.setBounds(271, 230, 200, 14);
		add(l13);
                
        JLabel l7 = new JLabel("Phone :");
		l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l7.setBounds(35, 270, 200, 14);
		add(l7);
                
        l14 = new JLabel();
		l14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l14.setBounds(271, 310, 200, 14);
		add(l14); 
                
        JLabel l8 = new JLabel("Total Price :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l8.setBounds(35, 310, 200, 14);
		add(l8);
                
        l15 = new JLabel();
		l15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l15.setBounds(271, 310, 200, 14);
		add(l15);
                
        b1 = new JButton("Check Price");        
                b1.setBounds(50, 350, 120, 30);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
                add(b1);
                
        b2 = new JButton("Book Package");        
                b2.setBounds(200, 350, 120, 30);
                b2.setBackground(Color.BLACK);
                b2.setForeground(Color.WHITE);
                add(b2);
                
        b2 = new JButton("Back");        
                b2.setBounds(350, 350, 120, 30);
                b2.setBackground(Color.BLACK);
                b2.setForeground(Color.WHITE);
                add(b2);
    }
    
      public static void main(String[] args)
      {
          new BookPackage().setVisible(true);
      }
        
}
                
                
    

