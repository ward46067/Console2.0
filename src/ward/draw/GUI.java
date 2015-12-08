package ward.draw;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class GUI {
    private String title;
    private int width, height;
    private JFrame g;
    private JPanel p;
    private static Graphics2D G2D;
    
    public GUI(String t, int w, int h){
        title = t;
        width = w;
        height = h;
    }
    
    public GUI(String t){
        this(t, 500, 500);
    }
    
    public GUI(int w, int h){
        this("GUI", w, h);
    }
    
    public GUI(){
        this("GUI", 500, 500);
    }
    
    public void setTitle(String t){
        title = t;
    }
    
    public void setWidth(int w){
        width = w;
    }
    
    public void setHeight(int h){
        height = h;
    }
    
    public void setWidthHeight(int w, int h){
        width = w;
        height = h;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void bulid(){
        g = new JFrame(title);
        g.setTitle(title);
        g.getContentPane().add(new paint());
        p = (JPanel) g.getContentPane();
        g.setSize(width, height);
        g.setVisible(true);
        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public Graphics2D getGraphics2D(){
        //G2D.fillRect(10, 10, 50, 50);
        return G2D;
        
    }
    
    public static void setGraphics2D(Graphics2D g2d){
        //System.out.println("Set the Graphics");
        G2D = g2d;
        
    }
    
    public void begin(){
        new Thread(){
            public void run(){
                while(true){
                    p.validate();
                    p.repaint();
                    
                    try {
                        Thread.sleep(16);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
}
