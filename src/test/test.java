package test;

import java.awt.Color;
import java.awt.Graphics2D;
import ward.console.Console;
import java.io.IOException;
import java.net.URISyntaxException;
import ward.draw.GUI;

/**
 *
 * @author dalen
 */
public class test {
    private static Graphics2D draw;
    public static GUI gui;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException {
        gui = new GUI();
        
        gui.bulid();
        draw = gui.getGraphics2D();
        
        drawPanel.drawPanel(draw);
        
    }
    
    public static void getGraphics() throws InterruptedException{
        draw = gui.getGraphics2D();
        Thread.sleep(50);
        drawPanel.drawPanel(draw);
    }
    
    public static void begin(){
        gui.begin();
    }
    
}
