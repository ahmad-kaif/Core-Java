
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Main {
    Main(){
        JFrame frame = new JFrame("haaaluuu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Text: ");
        JTextField area = new JTextField(20);
        JButton btn = new JButton("Reverse");
        JLabel text = new JLabel("");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String x = area.getText();
                text.setText(x);
            }
        });

        frame.add(label);
        frame.add(area);
        frame.add(btn);
        frame.add(text);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
    
}
