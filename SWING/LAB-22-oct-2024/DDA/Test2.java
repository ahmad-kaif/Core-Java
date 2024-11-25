import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Test2 {

    private class Canvas extends JPanel {
        int w, h;
        Canvas(int w, int h) {
            this.w = w;
            this.h = h;
        }
        private void plotPixel(Graphics g, int x, int y) {
            g.fillRect(x + (w / 2), (h / 2) - y, 1, 1);
        }

        // DDA Algorithm for line drawing
        private void drawDDALine(int x1, int y1, int x2, int y2, Graphics g) {
            int dx = x2 - x1;
            int dy = y2 - y1;

            int steps = Math.max(Math.abs(dx), Math.abs(dy));
            double xIncrement = dx / (double) steps;
            double yIncrement = dy / (double) steps;

            double x = x1;
            double y = y1;

            plotPixel(g, (int) Math.round(x), (int) Math.round(y));

            for (int i = 0; i < steps; i++) {
                x += xIncrement;
                y += yIncrement;
                plotPixel(g, (int) Math.round(x), (int) Math.round(y));
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // Draw X-axis 
            drawDDALine(-w / 2, 0, w / 2, 0, g);
            
            // Draw Y-axis 
            drawDDALine(0, -h / 2, 0, h / 2, g);
            
            // Drawing a line using DDA from (-50, -50) to (100, 100)
            drawDDALine(-50, -50, 100, 100, g);
        }
    }

    Test2(int h, int w) {
        JFrame frm = new JFrame("DDA");
        frm.setSize(w, h);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas(w, h);
        frm.add(canvas);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Test2(300, 300);
            }
        });
    }
}
