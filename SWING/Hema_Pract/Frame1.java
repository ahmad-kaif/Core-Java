
import javax.swing.SwingUtilities;



public class Frame1 {

    Frame1(){
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Frame1();
            }
        });
    }
}
