/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skypass;

import javax.swing.JEditorPane;
import javax.swing.JFrame;


public class Gps extends JFrame {
    
    Gps(){
        this.setBounds(670,240,800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        try{
           j.setPage("https://www.google.com/");
        }catch(Exception e){
            j.setContentType("text/html");
            j.setText("Html page could not loaded");
            
        }
        add(j);
          
        
    }
    
    public static void main(String[] args) {
        Gps frame = new Gps();
        frame.setVisible(true);
    }
    
}
