import java.awt.*;

public class Police {
    public Police(){

    }
    public void draw(Graphics2D gr){
        gr.setColor(Color.blue);
        gr.fillRect(300,150,320,200);
        gr.setColor(Color.white);
        gr.fillRect(620,250,160,100);
        gr.fillRect(160,230,140,120);
        gr.setColor(Color.blue);
        gr.fillRect(205,260,55,50);
        gr.setColor(Color.black);
        gr.drawLine(230,260,230,309);
        gr.fillRect(160,230,140,25);

        gr.fillRect(340,120,5,30);
        gr.fillRect(570,120,5,30);

        gr.fillRect(620,250,160,25);
        gr.fillRect(300,150,320,25);
        gr.fillRect(300,150,25,200);
        gr.fillRect(595,150,25,200);
        gr.setColor(Color.white);
        gr.fillRect(370,250,180,100);
        gr.fillRect(300,40,320,100);
        gr.setColor(Color.black);
        gr.fillRect(455,250,10,100);
        gr.setColor(Color.blue);
        gr.fillRect(635,280,55,50);
        gr.fillRect(710,280,55,50);
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 64);
        gr.setFont(font);
        gr.setColor(Color.black);
        gr.drawString("Police", 360, 120);

    }
}
