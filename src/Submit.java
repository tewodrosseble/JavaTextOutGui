import java.awt.event.*;
import javax.swing.JOptionPane;

public class Submit implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JOptionPane show = new JOptionPane();
        show.showMessageDialog(null, "Data Submitted");
    }

}
