
package skypass;

import java.awt.Choice;
import java.awt.Color;  
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class signup extends JFrame implements ActionListener {
    private Container c;
    private JPanel panel1;
    private JLabel txtl1,txtl2,txtl3,txtl4,txtlmail,txtlphn,txtl5,imgl1,uploadl;
    private JTextField txtfd1,txtfd2,txtfd3,txtfd4,uploadtxtfd,txtfdmail,txtfdphn;
    private JButton btn1,btn2,picbtn;
    private ImageIcon img;
    JFileChooser chooser;
    String filename ;
    
    signup(){
        sgGo();
    }
    void sgGo(){
        this.setBounds(600,300,900,460);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SIGN UP");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0,0,500,400);
        panel1.setBackground(new Color(129, 52, 175));
        c.add(panel1);
        
        txtl1 = new JLabel("Username");
        txtl1.setBounds(50,20,125,25);
        txtl1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(txtl1);
        
        txtfd1 = new JTextField();
        txtfd1.setBounds(190,20,180,25);
        txtfd1.setBorder(null);
        panel1.add(txtfd1);
        
         
        txtl2 = new JLabel("Name");
        txtl2.setBounds(50,60,125,25);
        txtl2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(txtl2);
        
        txtfd2 = new JTextField();
        txtfd2.setBounds(190,60,180,25);
        txtfd2.setBorder(null);
        panel1.add(txtfd2);
        
        
        txtlmail = new JLabel("Email");
        txtlmail.setBounds(50,100,125,25);
        txtlmail.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(txtlmail);
        
        txtfdmail = new JTextField();
        txtfdmail.setBounds(190,100,180,25);
        txtfdmail.setBorder(null);
        panel1.add(txtfdmail);
        
        
        
        txtlphn = new JLabel("Phone");
        txtlphn.setBounds(50,140,125,25);
        txtlphn.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(txtlphn);
        
        txtfdphn = new JTextField();
        txtfdphn.setBounds(190,140,180,25);
        txtfdphn.setBorder(null);
        panel1.add(txtfdphn);
        
        
        txtl3 = new JLabel("Passsword");
        txtl3.setBounds(50,180,125,25);
        txtl3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(txtl3);
        
        txtfd3 = new JTextField();
        txtfd3.setBounds(190,180,180,25);
        txtfd3.setBorder(null);
        panel1.add(txtfd3);
        
        txtl3 = new JLabel("Security Question");
        txtl3.setBounds(50,220,125,25);
        txtl3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(txtl3);
        
        Choice ch = new Choice();
        ch.add("Your Dream Place to Travel");
        ch.add("More exciting in Travelling");
        ch.add("Your best Memory");
        ch.setBounds(190,220,180,25);
        panel1.add(ch);
        
        txtl5 = new JLabel("Answer");
        txtl5.setBounds(50,260,125,25);
        txtl5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(txtl5);
        
        
        txtfd4 = new JTextField();
        txtfd4.setBounds(190,260,180,25);
        txtfd4.setBorder(null);
        panel1.add(txtfd4);
        
        /*uploadl = new JLabel("Upload profile");
        uploadl.setBounds(50,220,125,25);
        uploadl.setFont(new Font("Tahoma",Font.BOLD,14));
        panel1.add(uploadl);*/
         picbtn= new JButton("upload picture");
         picbtn.setBounds(50,300,125,25);
         picbtn.setBorder(null);
         picbtn.setFont(new Font("Tahoma",Font.BOLD,14));
        picbtn.setBackground(Color.black);
        picbtn.setForeground(Color.white);
         panel1.add(picbtn);
         picbtn.addActionListener(this);
         
        
        
        uploadtxtfd = new JTextField();
        uploadtxtfd.setBounds(190,300,180,25);
        uploadtxtfd.setBorder(null);
        panel1.add(uploadtxtfd);
        
        

        
        btn1 = new JButton("Done");
        btn1.setFont(new Font("Tahoma",Font.BOLD,14));
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        btn1.setBounds(80,340,100,30);
        panel1.add(btn1);
        btn1.addActionListener(this);
        
        btn2 = new JButton("Back");
        btn2.setFont(new Font("Tahoma",Font.BOLD,14));
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        btn2.setBounds(250,340,100,30);
        panel1.add(btn2);
        btn2.addActionListener(this);
        
        img = new ImageIcon(getClass().getResource("design\\regicon1.png"));
        
        imgl1 = new JLabel(img);
        imgl1.setBounds(500,0,400,360);
        this.add(imgl1);
        
        
        
                

        
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        signup sgFrame = new signup();
        sgFrame.setVisible(true);
        sgFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        if(ae.getSource()== btn1){
           
        }
        if(ae.getSource()== btn2){
            this.setVisible(false);
            new login().setVisible(true);
        }
        
        if(ae.getSource() ==picbtn){
            chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
             filename = f.getAbsolutePath();
            uploadtxtfd.setText(filename);
        }
       
            
            
            
        
    }
}
