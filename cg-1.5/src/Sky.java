import javax.swing.*;
import java.awt.*;

public class Sky extends JComponent {
    public Sky(){
        super.setSize(800,800);
    }
    public void draw(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight()-40);
    }
}
