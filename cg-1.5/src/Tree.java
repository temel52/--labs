import java.awt.*;

public class Tree {
    public Tree(){

    }
    public void draw(Graphics g, int x, int y) {
        g.setColor(new Color(51, 25, 0));
        g.fillRect(x, y, 30, 40+100);
        g.setColor(new Color(0,51,0));
        g.fillOval(x-35, y-50, 100, 150);
    }
}