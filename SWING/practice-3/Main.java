
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class Main {
    Main(){
        JFrame frame = new JFrame("Scrollbar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        textArea.setText("This is a sample text to demonstrate scrolling functionality.\n" +
                         "Scrollbars hulululu");

        // Create a JScrollPane and add the JTextArea to it
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add the JScrollPane to the JFrame
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
