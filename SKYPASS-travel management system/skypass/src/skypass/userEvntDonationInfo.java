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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author The CY83RN4UT
 */
public class userEvntDonationInfo extends JFrame {
    
    private Container contentPane;
    private JButton btn1,btn2;
    
    userEvntDonationInfo(){
        
        
          setBounds(580, 220, 850, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                this.setTitle("User Event Donation Details");
               
                
                ImageIcon i1  = new ImageIcon(getClass().getResource("design\\usrinfo.jpg"));               
                JLabel la1 = new JLabel(i1);
                la1.setBounds(450,50,350,350);
                add(la1);
		
		JLabel lblName = new JLabel("Event ID:");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(50, 11, 100, 53);
                lblName.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(lblName);
                
                JLabel lblEvntName = new JLabel("Event Name:");
		lblEvntName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblEvntName.setBounds(230, 11, 200, 53);
                lblEvntName.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(lblEvntName);
                
                
                JLabel lb3 = new JLabel("Username :");
		lb3.setBounds(35, 100, 200, 14);
		contentPane.add(lb3);
                
                JLabel l1 = new JLabel();
		l1.setBounds(130, 100, 100, 20);
                l1.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Phone :");
		lblId.setBounds(35, 140, 200, 14);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
		l2.setBounds(130, 140, 100, 20);
                l2.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(l2);
                
                JLabel lb2 = new JLabel("Date :");
		lb2.setBounds(35, 180, 200, 14);
		contentPane.add(lb2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(130, 180, 100, 20);
                l3.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(l3);
		
		JLabel lblName_1 = new JLabel("Location :");
		lblName_1.setBounds(35, 220, 200, 14);
		contentPane.add(lblName_1);
		
		JLabel l4 = new JLabel();
		l4.setBounds(130, 220, 220, 20);
                l4.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("Donate Category :");
		lblGender.setBounds(35, 260, 200, 14);
		contentPane.add(lblGender);
                
                JLabel l5 = new JLabel();
		l5.setBounds(140, 260, 100, 20);
                l5.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(l5);
                
		JLabel lblCountry = new JLabel("Donation For :");
		lblCountry.setBounds(35, 300, 200, 14);
		contentPane.add(lblCountry);
                
                JLabel l6 = new JLabel();
		l6.setBounds(130, 300, 100, 20);
                l6.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(l6);
		
		JLabel lblReserveRoomNumber = new JLabel("Quantity :");
		lblReserveRoomNumber.setBounds(35, 340, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                JLabel l7 = new JLabel();
		l7.setBounds(130, 340, 100, 20);
                l7.setBorder(new LineBorder(Color.BLACK,3));
		contentPane.add(l7);
           	
		/*JLabel lblCheckInStatus = new JLabel("Present Address :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		contentPane.add(lblCheckInStatus);
                
                JLabel l8 = new JLabel();
		l8.setBounds(271, 350, 200, 14);
		contentPane.add(l8);

		
		JLabel lblDeposite = new JLabel("Country :");
		lblDeposite.setBounds(35, 390, 200, 14);
		contentPane.add(lblDeposite);
		
		JLabel l9 = new JLabel();
		l9.setBounds(271, 390, 200, 14);
		contentPane.add(l9);
                
                JLabel la2 = new JLabel("Cost :");
		la2.setBounds(35, 430, 200, 14);
		//contentPane.add(la2);
		
		JLabel l10 = new JLabel();
		l10.setBounds(271, 430, 200, 14);
		contentPane.add(l10); */
                
                btn1 = new JButton("Back");
                btn1.setBounds(355,480,100,30);
                btn1.setBackground(Color.BLACK);
                btn1.setForeground(Color.white);
                btn1.setBorder(null);
                contentPane.add(btn1);
                btn1.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
               dispose();
               new dashBoard().setVisible(true);
            }
                });  
                
                
                 btn2 = new JButton("Show");
                btn2.setBounds(255,480,100,30);
                btn2.setBackground(Color.BLACK);
                btn2.setForeground(Color.white);
                btn2.setBorder(null);
                contentPane.add(btn2);
                btn2.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae) {
              
              
            }
                });
                
                
                
    }
    
  public static void main(String[] args) {
        userEvntDonationInfo frame = new userEvntDonationInfo();
        frame.setVisible(true);
        
    }
}
