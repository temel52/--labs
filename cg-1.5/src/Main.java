import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JComponent implements ActionListener{

    Graphics2D gr;


    public static void main(String[] args) {

        Main main = new Main();
        JFrame f = new JFrame("Draw");
        f.setSize(800, 800);
        f.add(main);
        f.setVisible(true);
    }

    public void paint(Graphics g) {
        Sky sky = new Sky();
        Road road = new Road();
        Fence fence = new Fence();
        Ground ground = new Ground();
        Sun sun = new Sun(0, 0);
        Police police = new Police();
        Truck truck = new Truck();
        Tree tree = new Tree();
        gr = (Graphics2D) g;
        sky.draw(gr);
        road.draw(gr);
        fence.draw(gr);
        ground.draw(gr);
        fence.draw(gr);
        sun.draw(gr);
        police.draw(gr);
        truck.draw(gr);
        tree.draw(gr,50,240);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
