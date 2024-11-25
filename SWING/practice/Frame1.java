import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.nio.file.attribute.GroupPrincipal;

public class Frame1 {

    Frame1() {
        JFrame frame = new JFrame("Form");

        //labels
        JLabel lb1 = new JLabel("Username :", JLabel.CENTER);
        JLabel lb2 = new JLabel("Password :", JLabel.CENTER);
        JLabel lb3 = new JLabel("Favorite Lang is :", JLabel.CENTER);

        //textfield
        JTextField username =  new JTextField(15);
        JPasswordField password = new JPasswordField(15);

        //buttons
        JButton btn1 = new JButton("Reset");
        JButton btn2 = new JButton("Login");

        // action listener for buttons
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                username.setText(null);
                password.setText(null);
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println(username.getText());
                System.out.println(password.getPassword());
            }
        });

        // radio buttons
        JRadioButton radiobtn1 = new JRadioButton("C++");
        JRadioButton radiobtn2 = new JRadioButton("Java",true);

        ButtonGroup grp = new ButtonGroup();
        grp.add(radiobtn1);
        grp.add(radiobtn2);

        // item listner
        ItemListener i1 = new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    JRadioButton selectedBtn = (JRadioButton) e.getItem();
                    lb3.setText("Favorite Lang is : " + selectedBtn.getText());

                }  
            }
        };
        radiobtn1.addItemListener(i1);
        radiobtn2.addItemListener(i1);


        frame.add(lb1);
        frame.add(username);
        frame.add(lb2);
        frame.add(password);
        frame.add(radiobtn1);
        frame.add(radiobtn2);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(lb3);

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(5,2,2,10));

    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Frame1();
            }
        });
    }
    
}
