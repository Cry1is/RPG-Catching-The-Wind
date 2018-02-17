
import java.applet.*;
import java.awt.*;

public class Gact
{

    /**
     * Pauses the output for a specified number of milliseconds (1/1000ths of a second). 
     * Example: Gact.wait(1000);
     * Pauses for 1 second. 
     **/
    public static void wait(int delay)
    {
        try {Thread.sleep(delay);}
        catch(Exception e){}
    }
    public static void setText(Graphics g, int x)
    {
        Expo.setFont(g, "Arial", Font.BOLD, x);
        Expo.setColor(g, Expo.black);
    }
}