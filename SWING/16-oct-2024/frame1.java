import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.nio.file.attribute.GroupPrincipal;

public class frame1 {
    frame1(){
        JFrame frm = new JFrame("Basic Form");
        frm.setSize(400, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.setLayout(new GridLayout(3,2,20,20));

        GridLayout layout = new GridLayout(3,2);
        frm.setLayout(layout);

        JLabel lb1 = new JLabel("Username");
        frm.add(lb1);
        JTextField txt = new JTextField();
        frm.add(txt);

        JLabel lb2 = new JLabel("Password");
        frm.add(lb2);
        JPasswordField txt1 = new JPasswordField();
        frm.add(txt1);

        JButton btn1 = new JButton("Cancel");
        frm.add(btn1);
        JButton btn2 = new JButton("Submit");
        frm.add(btn2);

        // frm.pack();

        btn1.addActionListener((ActionListener) (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txt.setText("");
                txt1.setText("");
            }
        }));
        btn2.addActionListener( (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(txt.getText());
                System.out.println(txt1.getPassword());
            }
        }));




        frm.setVisible(true);
       

    }
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new frame1();
            }
        });
        System.out.println("Returned immediately");
    }
    
}
