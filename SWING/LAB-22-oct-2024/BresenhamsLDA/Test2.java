import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class Test2{
    class Canvas extends JPanel{
        int w;
        int h;
        Canvas(int h, int w){
            this.h=h;
            this.w=w;
        }
        void plotPixel(Graphics g, int x, int y){
            g.fillRect(x + (w/2), (h/2) -y,1,1);
        }

        //Bresenhams Line Drawing Algo
        private void drawBresenhamLine(int x1, int y1, int x2, int y2, Graphics g) {
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);

            int sx = (x1 < x2) ? 1 : -1;  // Step in x direction
            int sy = (y1 < y2) ? 1 : -1;  // Step in y direction

            int err = dx - dy;
            int e2;

            while (true) {
                // Plot the current pixel
                plotPixel(g, x1, y1);

                if (x1 == x2 && y1 == y2)
                    break;

                e2 = 2 * err;

                if (e2 > -dy) {  
                    err -= dy;
                    x1 += sx;
                }

                if (e2 < dx) {   
                    err += dx;
                    y1 += sy;
                }
            }
        }



        protected void paintComponent(Graphics g){
            super.paintComponent(g);

          
            // Draw X-axis (from left to right)
            drawBresenhamLine(-w / 2, 0, w / 2, 0, g);
            
            // Draw Y-axis (from top to bottom)
            drawBresenhamLine(0, -h / 2, 0, h / 2, g);
            
             //call bresenham's line draing algo that i have created
            // Drawing a line using Bresenham from (-50, -50) to (100, 100)
            drawBresenhamLine(-50, -50, 100, 100, g);
        }

    }

    Test2(int h, int w){
        JFrame frame = new JFrame("Bresenhams Line Drawing Algorithm");
        frame.setSize(h,w);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Canvas c1 = new Canvas(h, w);
        frame.add(c1);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Test2(300, 300);
            }
        });
    }
}