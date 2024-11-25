
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {

    public Main() {
        JFrame frame = new JFrame("website");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);
        frame.setLayout(new BorderLayout());

       


        //header
        JPanel header = new JPanel();
        header.setBackground(Color.BLUE);
        header.setLayout(new FlowLayout());
        JLabel home = new JLabel("Home");
        JLabel about = new JLabel("About");
        JLabel contact = new JLabel("Contact");

        header.add(home);
        header.add(about);
        header.add(contact);

        

        //hero
        JPanel hero = new JPanel();
        hero.setBackground(Color.LIGHT_GRAY);

        JLabel lb = new JLabel("Hello This is my website!!");
        // lb.setFont('sans-serif');
        hero.add(lb);


        //footer 
        JPanel footer = new JPanel();
        footer.setBackground(Color.ORANGE);
        JLabel f1 = new JLabel("copyright@2024-ahmadKaif");
        footer.add(f1);



        frame.add(header,BorderLayout.NORTH);
        frame.add(hero,BorderLayout.CENTER);
        frame.add(footer,BorderLayout.SOUTH);



        frame.setVisible(true);
    }

    
    public static void main(String[] args) {
        new Main();
    }
    
}
