import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Multi-Panel Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Top Panel: Displays a label
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.BLUE);
        JLabel label = new JLabel("Welcome to the Multi-Panel Example!");
        label.setFont(new Font("sans-serif", Font.BOLD, 16));
        topPanel.add(label);

        // Middle Panel: Contains buttons
        JPanel middlePanel = new JPanel();
        middlePanel.setBackground(Color.BLACK);
        middlePanel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Button actions
        button1.addActionListener(e -> System.out.println("Button 1 Clicked!"));
        button2.addActionListener(e -> System.out.println("Button 2 Clicked!"));

        middlePanel.add(button1);
        middlePanel.add(button2);

        // Bottom Panel: Contains a text field and a button
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.PINK);
        bottomPanel.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        JButton updateButton = new JButton("Update Text");

        // Update button action
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Hello from the Bottom Panel!");
            }
        });

        bottomPanel.add(textField);
        bottomPanel.add(updateButton);

        // Add panels to the frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
