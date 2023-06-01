
/*Write a java program to create and display a smiley using Java Applet */
import java.applet.*;
import java.awt.*;

public class Question88 extends Applet {
    public void paint(Graphics g) {

        g.drawOval(80, 70, 150, 150);

        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}
