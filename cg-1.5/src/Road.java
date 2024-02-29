import javax.swing.*;
import java.awt.*;

public class Road extends JComponent {
    public Road(){
super.setSize(800,800);
    }
    public void draw(Graphics2D gr){
        gr.setColor(Color.darkGray);
        gr.fillRect(0,getHeight()-300,getWidth(),310);
    }
}
