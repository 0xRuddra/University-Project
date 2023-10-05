
package skypass;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class orgDonationForm extends JFrame {
    
    private Container c;
    public JLabel lbel1,lbel2,lbel3,info1,info2,info3,info4,ninfo1,ninfo2,ninfo3,ninfo4;
    private JPanel p1,p2,p3;
    private Font fn1,fn2;
     private JTextField f1,f2,f3,f4,f5,f6,f7,f8;
    JMenu m1,m2,m3,m4,m5,m6;
    JMenuBar menuBar;
    
    orgDonationForm(){
        
          this.setBounds(500,200,640,720);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         c =this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.white);
         fn1 = new Font("Arial", Font.BOLD, 30);
         fn2=new Font("Arial",Font.BOLD,20);
         
         
         
        menuBar = new JMenuBar();
        menuBar.setBackground(Color.black);
	setJMenuBar(menuBar);
		
        m1 = new JMenu("Organization's List");
        m1.setForeground(Color.white);
        m1.setBorder(new LineBorder(Color.white,2));
	menuBar.add(m1);
        JMenuItem mi1 = new JMenuItem("1.Basmah");
	m1.add(mi1);
        JMenuItem mi2 = new JMenuItem("2.Food Bank network Bangladesh");
	m1.add(mi2); 
        JMenuItem mi3 = new JMenuItem("3.onetakamealh");
	m1.add(mi3);
        JMenuItem mi4 = new JMenuItem("4.Apon foundation");
	m1.add(mi4);
        JMenuItem mi5 = new JMenuItem("5.bidyanondo");
	m1.add(mi5);
        
       
         
         
         p1=new JPanel();
         p1.setBounds(0,0,600,60);
         p1.setBackground(Color.white);
         p1.setLayout(null);
         p1.setBorder(new LineBorder(Color.black,4));
         c.add(p1);
         
         lbel1= new JLabel("Donation Form");
         lbel1.setBounds(30,10,300,40);
         lbel1.setFont(fn1);
       //  lbel1.setBorder(new LineBorder(Color.black,4));
         p1.add(lbel1);
         
         p2=new JPanel();
         p2.setBounds(0,75,600,250);
         p2.setBackground(Color.white);
         p2.setBorder(new LineBorder(Color.black,3));
         p2.setLayout(null);
         c.add(p2);
         
         lbel2=new JLabel("Personal Information Details");
         lbel2.setBounds(30,10,450,40);
         lbel2.setFont(fn1);
         lbel2.setBorder(new LineBorder(Color.black,4));
          p2.add(lbel2);
          

         
         info1= new JLabel("Username");
         info1.setBounds(30, 70, 100, 40);
         info1.setForeground(Color.black);
         info1.setFont(fn2);
         p2.add(info1);
         
                    f1=new JTextField();
                    f1.setBounds(250,60,180,40);
                    f1.setBorder(new LineBorder(Color.black,3));
                    f1.setBackground(Color.LIGHT_GRAY);
                    p2.add(f1);
         
         info2= new JLabel("Email");
         info2.setBounds(30, 110, 100, 40);
         info2.setForeground(Color.black);
         info2.setFont(fn2);
         p2.add(info2);
         
                    f2=new JTextField();
                    f2.setBounds(250,105,180,40);
                    f2.setBorder(new LineBorder(Color.black,3));
                    f2.setBackground(Color.LIGHT_GRAY);
                    p2.add(f2);
          info3= new JLabel("Phone");
         info3.setBounds(30, 150, 100, 40);
         info3.setForeground(Color.black);
         info3.setFont(fn2);
         p2.add(info3);
         
                     f3=new JTextField();
                    f3.setBounds(250,155,180,40);
                    f3.setBorder(new LineBorder(Color.black,3));
                    f3.setBackground(Color.LIGHT_GRAY);
                    p2.add(f3);        
                 
        info4= new JLabel("Location");
         info4.setBounds(30, 190, 100, 40);
         info4.setForeground(Color.black);
         info4.setFont(fn2);
         p2.add(info4); 
         
                     f4=new JTextField();
                    f4.setBounds(250,200,180,40);
                    f4.setBorder(new LineBorder(Color.black,3));
                    f4.setBackground(Color.LIGHT_GRAY);
                    p2.add(f4);        
         
         
         
          p3=new JPanel();
         p3.setBounds(0,340,600,250);
         p3.setBackground(Color.white);
         p3.setBorder(new LineBorder(Color.black,3));
         p3.setLayout(null);
         c.add(p3); 
         
         
         lbel3 = new JLabel("Donation Details");
        lbel3.setBounds(30,10,300,40);
         lbel3.setFont(fn1);
         lbel3.setBorder(new LineBorder(Color.black,4));
         p3.add(lbel3); 
         
         ninfo1= new JLabel("Ngo");
         ninfo1.setBounds(30, 70, 100, 40);
         ninfo1.setForeground(Color.black);
         ninfo1.setFont(fn2);
         p3.add(ninfo1);
                    f5=new JTextField();
                    f5.setBounds(250,65,180,40);
                    f5.setBorder(new LineBorder(Color.black,3));
                    f5.setBackground(Color.LIGHT_GRAY);
                    p3.add(f5);        
                  
         
         ninfo2= new JLabel("Type of food");
         ninfo2.setBounds(30, 110, 200, 40);
         ninfo2.setForeground(Color.black);
      
         ninfo2.setFont(fn2);
         p3.add(ninfo2);
         
                    f6=new JTextField();
                    f6.setBounds(250,110,180,40);
                    f6.setBorder(new LineBorder(Color.black,3));
                    f6.setBackground(Color.LIGHT_GRAY);
                    p3.add(f6);         
         
         
          ninfo3= new JLabel("Date of Cooking");
         ninfo3.setBounds(30, 150, 200, 40);
         ninfo3.setForeground(Color.black);
         ninfo3.setFont(fn2);
         p3.add(ninfo3);
                     f7=new JTextField();
                    f7.setBounds(250,155,180,40);
                    f7.setBorder(new LineBorder(Color.black,3));
                    f7.setBackground(Color.LIGHT_GRAY);
                    p3.add(f7);         
         
         ninfo4= new JLabel("qunatity");
         ninfo4.setBounds(30, 190, 100, 40);
         ninfo4.setForeground(Color.black);
         ninfo4.setFont(fn2);
         p3.add(ninfo4); 
                     f8=new JTextField();
                    f8.setBounds(250,200,180,40);
                    f8.setBorder(new LineBorder(Color.black,3));
                    f8.setBackground(Color.LIGHT_GRAY);
                    p3.add(f8);         
         
         
         JButton btn1 = new JButton("Donate");
         btn1.setBounds(80,600,100,40);
         btn1.setFont(fn2);
         btn1.setBorder(new LineBorder(Color.black));
         btn1.setBackground(Color.black);
         btn1.setForeground(Color.white);
         c.add(btn1);
         btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                dispose();
               // new KaptaiHotel().setVisible(true);
            }
        });
        
         
         
        JButton btn2 = new JButton("Cancel");
         btn2.setBounds(360,600,100,40);
         btn2.setFont(fn2);
         btn2.setBorder(new LineBorder(Color.black));
         btn2.setBackground(Color.black);
          btn2.setForeground(Color.white);
         c.add(btn2);
         btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                dispose();
               new dashBoard().setVisible(true);
            }
        });
        
         
         
         
         
         
         
 
         
  
         
         
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        orgDonationForm frame= new orgDonationForm();
        frame.setVisible(true);
        
    }
    
}
