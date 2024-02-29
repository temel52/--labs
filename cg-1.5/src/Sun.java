import java.awt.*;

public class Sun {
    private int x,y;
    public Sun(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void draw(Graphics2D g){
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, 90, 90);
    }
}
