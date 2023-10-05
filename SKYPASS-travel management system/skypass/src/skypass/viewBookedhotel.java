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


public class viewBookedhotel extends JFrame {
    
    private Container contentPane;
    private JButton btn1;
    viewBookedhotel(){
        setBounds(580, 220, 850, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                this.setTitle("Details");
               
                
                ImageIcon i1  = new ImageIcon(getClass().getResource("design\\usrinfo.jpg"));               
                JLabel la1 = new JLabel(i1);
                la1.setBounds(450,50,350,350);
                add(la1);
		
		JLabel lblName = new JLabel("USER INFORMATION:");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(88, 11, 350, 53);
		contentPane.add(lblName);
                
                JLabel lb3 = new JLabel("Username :");
		lb3.setBounds(35, 70, 200, 14);
		contentPane.add(lb3);
                
                JLabel l1 = new JLabel();
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Name :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                JLabel lb2 = new JLabel("User Id :");
		lb2.setBounds(35, 150, 200, 14);
		contentPane.add(lb2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel lblName_1 = new JLabel("Phone :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		JLabel l4 = new JLabel();
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("Email :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                JLabel l5 = new JLabel();
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		JLabel lblCountry = new JLabel("Gender :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                JLabel l6 = new JLabel();
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                JLabel l7 = new JLabel();
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		JLabel lblCheckInStatus = new JLabel("Present Address :");
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
		contentPane.add(l10);
                
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
    }
    public static void main(String[] args) {
        viewBookedhotel frame = new viewBookedhotel();
        frame.setVisible(true);
        
    }
    
    
}
