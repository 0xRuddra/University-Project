
package journey;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Main_Place extends JFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        new Main_Place().setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new Main_Place().setVisible(true);
               
    }
    
}
