/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author The CY83RN4UT
 */
public class createEvent extends JFrame {
    
    private JPanel contentpane;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    
    
    createEvent(){
        
        this.setBounds(580, 220, 850, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentpane= new JPanel();
        setContentPane(contentpane);
        contentpane.setLayout(null);
        this.setTitle("Create Event");
        
        
        
               ImageIcon i1  = new ImageIcon(getClass().getResource("design\\createE.jpg"));
                
                JLabel l1 = new JLabel(i1);
                l1.setBorder(new LineBorder(Color.BLACK,3));
                l1.setBounds(410,40,400,420);
                
                add(l1);
        
        
        JLabel lb1=new JLabel("     Event Details:");
        lb1.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
	lb1.setBounds(118, 11, 220, 53);
        lb1.setBorder(new LineBorder(Color.black,3));
        contentpane.add(lb1);
        
         JLabel lb2 = new JLabel("Name :");
	lb2.setBounds(35, 80, 200, 14);
	contentpane.add(lb2);
                
        t1 = new JTextField();
        t1.setBounds(150, 80, 150, 20);
        contentpane.add(t1);
	t1.setColumns(10);
        
        
        JLabel lblId = new JLabel("User Name :");
        lblId.setBounds(35, 110, 200, 14);
	contentpane.add(lblId);
       
        t2 = new JTextField();
	t2.setBounds(150, 110, 150, 20);
	contentpane.add(t2);
        
        JLabel lb3 = new JLabel("User ID :");
        lb3.setBounds(35, 140, 200, 14);
	contentpane.add(lb3);
        
        t3 = new JTextField();
	t3.setBounds(150, 140, 150, 20);
	contentpane.add(t3);
        
        
        JLabel lb4 = new JLabel("Email:");
        lb4.setBounds(35, 170, 200, 14);
	contentpane.add(lb4);
        
        t4 = new JTextField();
	t4.setBounds(150, 170, 150, 20);
	contentpane.add(t4);
        
        JLabel lb5 = new JLabel("Phone :");
        lb5.setBounds(35, 200, 200, 14);
	contentpane.add(lb5);
        
        t5 = new JTextField();
	t5.setBounds(150, 200, 150, 20);
	contentpane.add(t5);
        
        
        JLabel lb6 = new JLabel("Event Name :");
        lb6.setBounds(35, 230, 200, 14);
	contentpane.add(lb6);
        
        t6 = new JTextField();
	t6.setBounds(150, 230, 150, 20);
	contentpane.add(t6);
        
        JLabel lb7 = new JLabel("Event For :");
        lb7.setBounds(35, 260, 200, 14);
	contentpane.add(lb7);
        
        t7 = new JTextField();
	t7.setBounds(150, 260, 150, 20);
	contentpane.add(t7);
        
        
        JLabel lb8 = new JLabel("Food Type:");
        lb8.setBounds(35, 290, 200, 14);
	contentpane.add(lb8);
        
        t8 = new JTextField();
	t8.setBounds(150, 290, 150, 20);
	contentpane.add(t8);
        
        
        JLabel lb9 = new JLabel("Date and time :");
        lb9.setBounds(35, 320, 200, 14);
	contentpane.add(lb9);
        
        t9 = new JTextField();
	t9.setBounds(150, 320, 150, 20);
	contentpane.add(t9);
        
        
         JLabel lb10 = new JLabel("Location :");
        lb10.setBounds(35, 350, 200, 14);
	contentpane.add(lb10);
        
        t10 = new JTextField();
	t10.setBounds(150, 350, 150, 20);
	contentpane.add(t10);
        
         JLabel lb11 = new JLabel("Quantity :");
        lb11.setBounds(35, 380, 200, 14);
	contentpane.add(lb11);
        
        t11 = new JTextField();
	t11.setBounds(150, 380, 150, 20);
	contentpane.add(t11);
        
        
        
        
               JButton b1 = new JButton("Create ");
                b1.setBackground(Color.black);
                b1.setForeground(Color.white);
                b1.setBounds(80,440,100,25);
                add(b1);
                          b1.addActionListener(new ActionListener(){

                      @Override
                      public void actionPerformed(ActionEvent ae) {
                       //dispose();
                       int choice=JOptionPane.showConfirmDialog(null, "Do you want to create an event?", "confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
                       if(choice == JOptionPane.YES_OPTION){
                           // code with here
                           
                       }
                       else if(choice==JOptionPane.NO_OPTION){
                           // code will be here
                       }
                       else{
                        // code will be here   
                       }
                      }
                });
                
                
                
               JButton b2 = new JButton("Back");
                b2.setBackground(Color.black);
                b2.setForeground(Color.white);
                b2.setBounds(300,440,100,25);
                add(b2);
                b2.addActionListener(new ActionListener(){

                      @Override
                      public void actionPerformed(ActionEvent ae) {
                       dispose();
                       new dashBoard().setVisible(true);
                      }
                });
        
        
        
        
        
        
        
        
       
        
        
        
    }
    
    
    
    
    public static void main(String[]args){
        
        createEvent frame=new createEvent();
        frame.setVisible(true);
    }

  
    
}
