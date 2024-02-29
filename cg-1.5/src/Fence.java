import javax.swing.*;
import java.awt.*;

public class Fence extends JComponent {
    public Fence() {
        super.setSize(800, 800);
    }

    public void draw(Graphics2D gr) {
        int x=10;
        int x1 = 10;
        gr.setColor(Color.BLACK);

        gr.fillRect(0, getHeight()-50, getWidth(), 10);
        gr.fillRect(0, getHeight()-150, getWidth(), 10);
        for (int i = 0; i < 8; i++) {
            gr.fillRect(x, getHeight()-150, 10, 100);
            x+=100;
        }
        gr.fillRect(0, getHeight()-410, getWidth(), 10);
        gr.fillRect(0, getHeight()-310, getWidth(), 10);
        for (int i = 0; i < 10; i++) {
            gr.fillRect(x1, getHeight()-410, 10, 110);
            x1+=100;
        }
    }
}
