/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Memories extends JFrame implements Runnable {
    private Container c;
    private ImageIcon treeicon,memoryimg,maintreeimg;
    private JLabel treeiconlbl,memoryimglbl,maintreeimglbl;
    private JPanel p1,p2;
    private   JLabel l1, l2, l3, l4, l5, l6, l21,l31,l41,l51,l61,l22,l32,l42,l52,l62;
    String path2;
    File f2;
    
    
    Thread th;
    
     public void run() {
        try {

            l2.setVisible(true);
          
            Thread.sleep(800);
            l2.setVisible(false);
            ;
            
            l3.setVisible(true);
           
            Thread.sleep(800);
            l3.setVisible(false);
           
            l4.setVisible(true);
            
            Thread.sleep(800);
            l4.setVisible(false);
           
            l5.setVisible(true);
           
            Thread.sleep(800);
            l5.setVisible(false);
          
            l6.setVisible(true);
            
            Thread.sleep(800);
            
            
            
          
        } catch (Exception e) {
            System.out.println(e);
        }


    }
    
    Memories(){
        this.setBounds(580, 220, 900, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c= this.getContentPane();
        this.setTitle("Memories");
        c.setLayout(null);
       // c.setBackground(new Color(220, 250, 250));//
        
        p1 = new JPanel();
        p1.setBounds(0,0,900,200);
        p1.setLayout(null);
        p1.setBackground(Color.black);
        c.add(p1);
         p2 = new JPanel();
        p2.setBounds(0,200,900,500);
        p2.setLayout(null);
        p2.setBackground(new Color(220, 250, 250));
        c.add(p2);
        
        treeicon = new ImageIcon(getClass().getResource("design\\tree.png"));
        treeiconlbl  = new JLabel(treeicon);
        treeiconlbl.setBounds(130,20,156,150);
        treeiconlbl.setBorder(new LineBorder(Color.yellow,5));
        p1.add(treeiconlbl);
        
         memoryimg = new ImageIcon(getClass().getResource("design\\memorylabel.jpg"));
        memoryimglbl  = new JLabel(memoryimg);
        memoryimglbl.setBounds(300,10,400,170);
        memoryimglbl.setBorder(new LineBorder(Color.yellow,5));
       p1.add(memoryimglbl);
       
       /*maintreeimg = new ImageIcon(getClass().getResource("design\\memorytree.png"));
       maintreeimglbl = new JLabel(maintreeimg);
       maintreeimglbl.setBounds(0,0,900,500);
       p2.add(maintreeimglbl);*/
       
       /*JButton btn1 = new JButton("1");
       btn1.setBorder(null);
       btn1.setBounds(250,0,80,30);
       btn1.setForeground(Color.white);
       btn1.setBackground(Color.black);
       p2.add(btn1);
       btn1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               JFileChooser chooser = new JFileChooser();
               f2 = chooser.getSelectedFile();
               chooser.showOpenDialog(null);
               path2 = f2.getAbsolutePath();
               System.out.println(path2);
           }
       });*/
       
        th = new Thread(this);
        
        
        ImageIcon i1 = new ImageIcon(getClass().getResource("design\\yellowMemory.jpg"));
        l2 = new JLabel(i1);
        l2.setBounds(0,0,880,490);
        p2.add(l2); 
        
         ImageIcon i4 = new ImageIcon(getClass().getResource("design\\blackMemory.jpg"));
        l3 = new JLabel(i4);
        l3.setBounds(0,0,880,490);
       p2.add(l3);
        l3.setVisible(false);
        
        ImageIcon i7 = new ImageIcon(getClass().getResource("design\\whiteMemory.jpg"));
        l4 = new JLabel(i7);
        l4.setBounds(0,0,880,490);
       p2.add(l4);
        l4.setVisible(false);
        
        
        ImageIcon i10 = new ImageIcon(getClass().getResource("design\\redMemory.jpg"));
        l5 = new JLabel(i10);
        l5.setBounds(0,0,880,490);
        p2.add(l5);
        l5.setVisible(false);
        
          ImageIcon i13 = new ImageIcon(getClass().getResource("design\\greenMemory.jpg"));
        l6 = new JLabel(i13);
        l6.setBounds(0,0,880,490);
        p2.add(l6);
        l6.setVisible(false);
        th.start();
         
        
       
        
        
    }
    
    public static void main(String[] args) {
        Memories frame = new Memories();
        frame.setVisible(true);
        
    }
    
}
