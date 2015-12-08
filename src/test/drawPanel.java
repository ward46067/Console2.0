package test;

import java.awt.Graphics2D;

public class drawPanel {
    public static void drawPanel(Graphics2D d) throws InterruptedException{
        //gui.begin();
        
        if(d != null){
            System.out.println("Here");
            d.drawRect(10, 10, 10, 10);
            System.out.println("Her");
            test.begin();
        } else {
            test.getGraphics();
        }
    }
}
