import java.awt.*;
import javax.swing.*;

public class ellipse extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawEllipse(100, 50, 200, 150, g);  // Example parameters
    }

    public void drawEllipse(int rx, int ry, int cx, int cy, Graphics g) {
        int x = 0;
        int y = ry;

        // Region 1 decision parameter
        int p1 = (int) (ry * ry - rx * rx * ry + 0.25 * rx * rx);
        int dx = 2 * ry * ry * x;
        int dy = 2 * rx * rx * y;

        // Plot points for Region 1
        while (dx < dy) {
            plotEllipsePoints(cx, cy, x, y, g);

            if (p1 < 0) {
                x++;
                dx += 2 * ry * ry;
                p1 += dx + ry * ry;
            } else {
                x++;
                y--;
                dx += 2 * ry * ry;
                dy -= 2 * rx * rx;
                p1 += dx - dy + ry * ry;
            }
        }

        // Region 2 decision parameter
        int p2 = (int) (ry * ry * (x + 0.5) * (x + 0.5) + rx * rx * (y - 1) * (y - 1) - rx * rx * ry * ry);

        // Plot points for Region 2
        while (y >= 0) {
            plotEllipsePoints(cx, cy, x, y, g);

            if (p2 > 0) {
                y--;
                dy -= 2 * rx * rx;
                p2 += rx * rx - dy;
            } else {
                x++;
                y--;
                dx += 2 * ry * ry;
                dy -= 2 * rx * rx;
                p2 += dx - dy + rx * rx;
            }
        }
    }

    private void plotEllipsePoints(int cx, int cy, int x, int y, Graphics g) {
        g.drawLine(cx + x, cy + y, cx + x, cy + y);  // Quadrant 1
        g.drawLine(cx - x, cy + y, cx - x, cy + y);  // Quadrant 2
        g.drawLine(cx + x, cy - y, cx + x, cy - y);  // Quadrant 3
        g.drawLine(cx - x, cy - y, cx - x, cy - y);  // Quadrant 4
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Midpoint Ellipse Drawing");
        ellipse ellipsePanel = new ellipse();
        frame.add(ellipsePanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
