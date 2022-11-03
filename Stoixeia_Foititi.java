import java.applet.Applet;
import java.awt.*;        
public class Stoixeia_Foititi extends Applet {
    Font textFont;
    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.black);
        g.setFont(textFont); 
        textFont = new Font("Serif",Font.BOLD,19);
        g.drawString("DOMES DEDOMENWN", 140, 25);
        g.drawString("3h Ergasia (ulopoihthke i domi tis stoivas)", 70, 50);
        g.setColor(Color.white);
        g.drawString("Ouzounis Miltiadis ", 165, 72);
        g.drawString("A.M. 9172", 195, 90);
        g.drawString("Ioannina, 06/01/2014", 320,150);
    }
}

