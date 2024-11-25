import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame1 {

    Frame1() {
        JFrame frame = new JFrame("Simple swing app");
        JLabel lb1 = new JLabel("Most Basic Swing App", JLabel.CENTER);

         //buttons
         JButton btn1 = new JButton("Left");
         JButton btn2 = new JButton("Right");
         JButton btn3 = new JButton("Reset");

         //add Action Listner
         btn1.addActionListener(new ActionListener() { //ActionListener -> interface with a method actionPerformed()
            public void actionPerformed(ActionEvent e){
                lb1.setText("Left Button Pressed");
                lb1.setForeground(Color.MAGENTA);

            }
         });
         btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                lb1.setText("Right Button Pressed");
                lb1.setForeground(Color.RED);
            }
         });
         btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                lb1.setText("Most Basic Swing App");
                lb1.setForeground(Color.BLACK);
            }
         });



        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        frame.add(lb1);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Frame1();

            }
        });
    }
    
}
