
import java.awt.*;

public class Draw
{
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Backgrounds and Places
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * When called, it will draw the home graphics screen. 
     * Example: Draw.drawHome(g);
     **/
    public static void drawHome(Graphics g)
    {
        int x = 0;
        int y = 0;
        //Creating the Background
        Expo.setColor(g, Expo.lightBlue);
        Expo.fillRectangle(g, 0, 0, 1280, 360);
        Expo.setColor(g, Expo.green);
        Expo.fillRectangle(g, 0, 360, 1280, 720);

        //Drawing the Sun
        Expo.setColor(g, Expo.yellow);
        Expo.fillCircle(g, 1180, 100, 50);

        //Drawing the House
        Expo.setColor(g, Expo.darkTan);
        Expo.fillRectangle(g, 540, 300, 740, 420);
        Expo.setColor(g, Expo.red);
        Expo.fillPolygon(g, 540, 300, 640, 225, 740, 300);

        //Drawing the Windows
        Expo.setColor(g, Expo.white);
        Expo.fillRectangle(g, 560, 310, 610, 360);
        Expo.fillRectangle(g, 720, 310, 670, 360);

        //Drawing the Door
        Expo.setColor(g, Expo.blue);
        Expo.fillRectangle(g, 625, 370, 655, 420);
    }

    /**
     * When called, it will draw a grid on the screen. 
     * Example: Draw.drawGrid(g);
     **/
    public static void drawGrid(Graphics g)
    {
        Expo.setColor(g, Expo.black);

        //Drawing the vertical lines
        for (int x = 0; x < 1280; x+=20)
        {
            Expo.drawLine(g, x, 0, x, 720);
            Gact.setText(g, 8);
            String s = Integer.toString(x);
            Expo.drawString(g, s, x, 20);
        }

        //Drawing the horizontal lines
        for (int y = 0; y <760; y+=20)
        {
            Expo.drawLine(g, 0, y, 1280, y);
            Gact.setText(g, 8);
            String s = Integer.toString(y);
            Expo.drawString(g, s, 20, y);
        }
    }

    /**
     * When called, it will draw the loading screen. 
     * Example: Draw.drawLoad(g);
     **/
    public static void drawLoad(Graphics g)
    {
    int re = 0;
    int gr = 0;
    int bl = 0;
    int x = 0;

        //fading to red
        for (int j = 1; j <= 213; j++)
        {
            Expo.setColor(g, re, gr, bl);
            re++;
            Expo.drawLine(g, x, 0, x, 720);
            x++;
        }

        //fading to yellow
        for (int j = 1; j <= 213; j++)
        {
            Expo.setColor(g, re, gr, bl);
            gr++;
            Expo.drawLine(g, x, 0, x, 720);
            x++;
        }

        //fading to green
        for (int j = 1; j <= 213; j++)
        {
            Expo.setColor(g, re, gr, bl);
            re--;
            Expo.drawLine(g, x, 0, x, 720);
            x++;
        }

        //fading to turquoise
        for (int j = 1; j <= 213; j++)
        {
            Expo.setColor(g, re, gr, bl);
            bl++;
            Expo.drawLine(g, x, 0, x, 720);
            x++;
        }

        //fading to blue
        for (int j = 1; j <= 213; j++)
        {
            Expo.setColor(g, re, gr, bl);
            gr--;
            Expo.drawLine(g, x, 0, x, 720);
            x++;
        }

        //fading to purple
        for (int j = 1; j <= 213; j++)
        {
            Expo.setColor(g, re, gr, bl);
            re++;
            Expo.drawLine(g, x, 0, x, 720);
            x++;
        }
    }
}