
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JToggleButton;




public class Main {
    Main(){
        JFrame frame = new JFrame("haaaluu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 0));
        frame.setSize(400,400);

        JToggleButton btn = new JToggleButton("Off");
        JLabel lb = new JLabel("Toggle button is off");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.isSelected()) {
                    btn.setText("ON");
                    lb.setText("Button is ON");
                } else {
                    btn.setText("OFF");
                    lb.setText("Button is OFF");
                }
            }
        });
        frame.add(btn);
        frame.add(lb);




        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
