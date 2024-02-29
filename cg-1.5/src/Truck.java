import java.awt.*;

public class Truck {
    public Truck(){

    }
    public void draw(Graphics2D gr){
        Polygon polygon = new Polygon();
        Polygon pol = new Polygon();
        Polygon pol1 = new Polygon();
        gr.setColor(Color.red);
        //cabin
        polygon.addPoint(480-70,360);
        polygon.addPoint(410-70,530);
        polygon.addPoint(425-70,570);
        polygon.addPoint(570-70,570);
        polygon.addPoint(570-70,360);
        pol.addPoint(430,380);
        pol.addPoint(390,480);
        pol.addPoint(480,480);
        pol.addPoint(480,380);
        pol1.addPoint(487-20,352-30);
        pol1.addPoint(535-20,377-30);
        pol1.addPoint(535-20,552-30);
        pol1.addPoint(761-20,551-30);
        pol1.addPoint(761-20,473-30);
        pol1.addPoint(673-20,458-30);
        pol1.addPoint(608-20,405-30);
        pol1.addPoint(586-20,353-30);
        gr.fillPolygon(polygon);
        //wheels
        gr.setColor(Color.BLACK);
        gr.fillOval(500-70,550,60,60);
        gr.fillOval(700-30,550,60,60);
        //headlights
        gr.setColor(Color.ORANGE);
        gr.fillOval(350,510,30,50);
        gr.setColor(Color.cyan);
        gr.fillPolygon(pol);
        //body
        gr.setColor(Color.BLACK);
        gr.fillRect(500,520,240,50);
        gr.setColor(new Color(153,153,0));
        gr.fillPolygon(pol1);
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 24);
        gr.setFont(font);
        gr.setColor(Color.black);
        gr.drawString("Кока-кола", 560, 470);
    }
}
