
package journey;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Journey extends JFrame {
    
    Journey ()
    {
        setSize(1200,500);
        
        setLocation(300,300);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/main11.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1200,500);
        add(l1);
        
        JLabel l2=new JLabel("Journey");
                l2.setBounds(30,300,1000,70);
                l2.setFont(new Font("serif",Font.PLAIN,70));
                l2.setForeground(Color.WHITE);
                l1.add(l2);
                
        /*JButton b1 = new JButton("Where you want to travel");
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
                b1.setBounds(900,0,300,50);
                l1.add(b1);*/
                
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu m1 = new JMenu("Where You Want to travel");
        m1.setForeground(Color.RED);
	menuBar.add(m1);
        
        JMenuItem mi1 = new JMenuItem("DESTINATION");
	m1.add(mi1);
        
        JMenuItem mi2 = new JMenuItem("VIEW HOTELS");
	m1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("BOOK HOTELS");
	m1.add(mi3);
        
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Destination().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   new ViewHotels().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   new ViewHotels().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JMenu m2 = new JMenu("PACKAGES");
        m2.setForeground(Color.RED);
	menuBar.add(m2);
        JMenuItem mi4 = new JMenuItem("BOOK PACKAGE");
	m2.add(mi4);
        
        JMenuItem mi5 = new JMenuItem("VIEW PACKAGE");
	m2.add(mi5);
        
        mi4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookPackage().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewPackage().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JMenu m3 = new JMenu("UTILITY");
        m3.setForeground(Color.RED);
	menuBar.add(m3);
        
        JMenuItem mi6 = new JMenuItem("NOTEPAD");
	m3.add(mi6);
        
        JMenuItem mi7 = new JMenuItem("CALCULATOR");
	m3.add(mi7);
        
        mi6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
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
        
        
                
        setLayout(null);
        setVisible(true);
        
      
        
        
        
       
    }
    


   
    public static void main(String[] args) {
        new Journey();
               
    }
    
}
