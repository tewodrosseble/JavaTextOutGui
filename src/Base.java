import java.awt.*;
import javax.swing.*;
public class Base extends JFrame {
    private JFrame frame;
    private JPanel panel;
    private JButton button1, button2, button3;
    private JLabel label1, label2, label3;
    private JTextField text1, text2, text3;
    private String firstName;
    private JOptionPane LastName;
    private JComboBox gender;
    private String male = "MALE";
    private String fem = "FEMALE";
    private String non = "NONE";
    private String non1 = "  ";

    Base(){
        super("Graphical User Interface");
        Container contain = getContentPane();
        contain.setLayout(new BorderLayout());

        frame =  new JFrame("Graphical User interface");
        panel = new JPanel();
        gender = new JComboBox();
        gender.addItem(non1);
        gender.addItem(male);
        gender.addItem(fem);
        gender.addItem(non);

        button1 = new JButton("Submit");
        add(button1);
        frame.add(panel);
        Submit submit = new Submit();
        button1.addActionListener(submit);

        JTextField text1 = new JTextField( 20);
        text1.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text1);

        JTextField text2 = new JTextField(10);
        text2.setFont(new Font("Serif", Font.PLAIN, 18));

        label1 = new JLabel("Enter your name");
        add(label1);
        JLabel label3 = new JLabel("Enter your age : ");
        add(label3);
        JLabel label4 = new JLabel("Select Gender");
        add(label4);


        panel.add(label1);
        panel.add(text1);
        panel.add(label3);
        panel.add(text2);
        panel.add(label4);
        panel.add(gender);
        panel.add(button1, button2);

        panel.setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);


    }
    public static void main(String... args){
        new Base();

    }

}
