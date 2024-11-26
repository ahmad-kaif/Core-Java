
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
    private class Canvas extends JPanel {
        int w, h;
        Canvas(int w, int h) {
            this.w = w;
            this.h = h;
        }
        private void plotPixel(Graphics g, int x, int y) {
            g.fillRect(x + (w / 2), (h / 2) - y, 1, 1);
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
                // This is where your algorithm will appear, call as method
                // such as drawBresenhamCircle(int radius, Graphics g) that will
                // internally call the plotPixel to plot the pixel. The plotPixel is
                // already translating the origin of the canvas from top-left corner
                // to center of the panel, so that you can focus on implementing the
                // algorithms only. So, consider the center of the canvas as (0, 0)
                
        }
    }
    Main(int h, int w) {
        JFrame frm = new JFrame("Paint Demo");
        frm.setSize(w, h);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas(w, h);
        frm.add(canvas);
        frm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main(300, 300);
            }
        });
    }
}
