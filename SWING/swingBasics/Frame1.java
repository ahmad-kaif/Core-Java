import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 {

    Frame1() {
        // Create the frame with a custom title
        JFrame frame = new JFrame("Simple Swing Application -- phle papa bol");
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label with a message
        JLabel lb1 = new JLabel("Most Basic Swing app", SwingConstants.CENTER);
        lb1.setFont(new Font("Arial", Font.BOLD, 24));
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        lb1.setVerticalAlignment(SwingConstants.CENTER);
        lb1.setForeground(Color.BLUE);
        lb1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create buttons
        JButton button1 = new JButton("Click Me");
        JButton button2 = new JButton("Reset");

        // Add ActionListeners to buttons
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lb1.setText("Button Clicked!"); // Change label text on click
                lb1.setForeground(Color.RED);   // Change label color on click
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lb1.setText("Most Basic Swing app"); // Reset label text
                lb1.setForeground(Color.BLUE);       // Reset label color
            }
        });

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Add components to the frame - we need layout
        frame.setLayout(new FlowLayout());
        frame.add(lb1, BorderLayout.CENTER);       // Add label to center
        frame.add(buttonPanel, BorderLayout.SOUTH); // Add buttons to the bottom (south)

        // Set the background color of the frame
        frame.getContentPane().setBackground(Color.BLACK);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the Swing application on the event-dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Frame1();
            }
        });
    }
}
