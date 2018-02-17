
import java.awt.*;
import java.applet.*;

public class CatchingTheWind_Graphics extends Applet
{
    public void paint(Graphics g)
    {
        int j = 0;
        String x = "1";
        Draw.drawHome(g);
        Expo.setColor(g, Expo.black);
        Ggamingcode.storyline(g, 1, 20, 20);
        Ggamingcode.title(g);
        Ggamingcode.refresh(g);
        for (j = 1; j <= 3; j++)
        {
            Draw.drawHome(g);
            Ggamingcode.title(g);
            Gact.wait(10000);
            Ggamingcode.refresh(g);
        }
    } 
}
