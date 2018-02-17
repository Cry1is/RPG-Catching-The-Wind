
import java.awt.*;
import java.applet.*;

public class Gtest extends Applet
{
    public void paint(Graphics g)
    {
        Ggamingcode.refresh(g);
        Draw.drawHome(g);
        Gact.setText(g, 20);
        Expo.drawString(g, "This is the drawHome method", 20, 20);
        Gact.wait(5000);
        Ggamingcode.refresh(g);
        Draw.drawGrid(g);
        Gact.setText(g, 20);
        Expo.drawString(g, "This is the drawGrid method", 20, 20);
        Gact.wait(5000);
        Ggamingcode.refresh(g);
        Draw.drawLoad(g);
        Gact.setText(g, 20);
        Expo.drawString(g, "This is the drawLoad method", 20, 20);
        Gact.wait(5000);
    }
}