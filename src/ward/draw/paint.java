package ward.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class paint extends JPanel {
    
    //public static Graphics2D G2D;
    
    paint() {
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard((Graphics2D) g);
    }

    private void drawBoard(Graphics2D d) {
        //G2D = d;
        GUI g = new GUI();
        g.setGraphics2D(d);
        //d.drawRect(50, 50, 50, 50);
    }

}
