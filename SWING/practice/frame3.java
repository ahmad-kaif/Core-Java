
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.nio.file.attribute.GroupPrincipal;
// java swing - java GUI-> awt / swing
// components - > labels , buttons -> JComponent
// container -> JContainer -> TLC/Non top
// TLC -> JFrame,Japplet etc // Non top -> JPanel

class frame3{
    public frame3(){
        JFrame frame = new JFrame("ye frame hai");
        frame.setSize(200,200);

        //lables
        JLabel lb1 = new JLabel("Username",JLabel.CENTER);
        JLabel lb2 = new JLabel("Password",JLabel.CENTER);
        frame.add(lb1);
        frame.add(lb2);

        //JTextField
        JTextField username =  new JTextField(15);
        frame.add(username);

       
        // frame.add(lb2);
        JPasswordField pass =  new JPasswordField(15);
        frame.add(pass);


        //Buttons
        JButton btn1 = new JButton("Reset");
        frame.add(btn1);
        btn1.addActionListener(new ActionListener() { // interface
            @Override
            public void actionPerformed(ActionEvent e){
                btn1.setText("C++");
            }
            
        });

        //radio buttion
        JRadioButton radiobtn1 = new JRadioButton("C++");
        frame.add(radiobtn1);
        JRadioButton radiobtn2 = new JRadioButton("Java",true);
        frame.add(radiobtn2);

        // ButtonGroup grp = new ButtonGroup();
        // grp.add`(radiobtn1);
        // grp.add(radiobtn2);
;

        JButton btn2 = new JButton("Login");
        btn2.addActionListener(new ActionListener() { // interface
            @Override
            public void actionPerformed(ActionEvent e){
                lb2.setText("C Sharp");
            }
            
        });
        frame.add(btn2);

        frame.setLayout(new GridLayout(4,2));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                new frame3();
            }
        });
    }

}
