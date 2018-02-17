
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;

public class Ggamingcode
{
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Game Strings
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Draws storyline <count> on the graphics screen beginning at coordinates x, y.
     * Example: Ggamingcode.storyline(g, 1, 20, 20);
     * Draws the series of strings within the "if (count == 1)" statement starting at coordinates 20, 20. 
     **/
    public static void storyline(Graphics g, int count, int x, int y)
    {
        Gact.setText(g, 14);
        if (count == 1)
        {
            Expo.drawString(g, "As a child, you were always interested in the magics that went on at the University, a school for arcanists. Many arcanists only know how to use ", x, y);
            Gact.wait(2500);
            Expo.drawString(g, "simple energy manipulation, but there are others who have real magic. There was one man who taught there as a master. His name was Elodin. Elodin ", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "knew the Names of many things, and so they were his to command. One Name particularly intrigued you: the Name of the wind. Now that you are older, ", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "you made it your goal to find the Name of the wind, so you can do real magic. ", x, (y += 20));
        }
        if (count == 2)
        {
            Expo.drawString(g, "You: Hm, I'm finally 16 now, so I can go to the University to learn about magic.", x, y);
            Gact.wait(2500);
            Expo.drawString(g, "Narrator: you catch a ride on one of the carts going through your town that is heading in the direction of the University, leaving your home ", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "behind. When you arrive, you search for Elodin, who can teach you how to find the Name of the Wind. ", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "You find Elodin at the University and call out to him...", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "Elodin: Ah, and what might you be here for?", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "You: I want to learn the Name of the wind.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "Elodin: Well, you've come to the right place. Good luck!", x, (y += 20));
        }
        if (count == 3)
        {
            Expo.drawString(g, "You meet Ambrose...", x, y);
            Gact.wait(2500);
            Expo.drawString(g, "Ambrose: Ah hello, do you have a message for me?", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "You: ...no.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "Ambrose: Oh, I thought you were a messenger boy. I was expecting something. You look young, what are you doing around the University?", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "You: Well, I applied for the University and got accepted by Elodin, one of the masters here. I want to study Naming.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "Ambrose: You, Name? You look barely big enough to fit those clothes of yours. Leave while you can, we don't need babies at the University.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "You: Well how old are you then? I'm 16, that's old enough to attend the University.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "I'm 20 fool, and next time you question me, it'll before than a simple telling off.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "Ambrose stalks away, leaving you wondering just what you got yourself into...", x, (y += 20));
        }
        if (count == 4)
        {
            Expo.drawString(g, "You bump into Elodin...", x, y);
            Gact.wait(2500);
            Expo.drawString(g, "You: Hi Master Elodin! I looked in the Hall, but I didn't find your class on the sign in sheet. Where can I sign up for your class?", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "Elodin: Ah yes, you're the one who wanted to study Naming, the 16 year old.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "You: Yes sir. So, when can I start?", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "Elodin: Come back to me in two years when you're 18. I don't teach kids things that could get them killed if they aren't careful.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "You: 2 years! Master Elodin, please reconsider, I've come all this way to study Naming.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "Elodin: 2 years boy, no exceptions.", x, (y += 20));
            Gact.wait(2500);
            Expo.drawString(g, "You decide it isn't worth arguing about, and walk away, determined to learn naming by yourself, with or without Master Elodin's help.", x, (y += 20));
        }
        if (count == 5)
        {
            
        }
        if (count == 6)
        {
            
        }
        if (count == 7)
        {
            
        }
        Gact.wait(8000);
        refresh(g);
    }

    public void tips(Graphics g, int count, int x, int y)
    {
        Gact.setText(g, 14);
        if (count == 1)
            Expo.drawString(g, "To recharge your energy, go to the inn and rest.", x, y);
        if (count == 2)
            Expo.drawString(g, "You can earn increasing amounts of money from the inn by upgrading its level at the Artificery.", x, y);
        if (count == 3)
            Expo.drawString(g, "When looking around, you have a small chance to find items, fight other arcanists, or progress the storyline.", x, y);
        if (count == 4)
            Expo.drawString(g, "Increasing your max energy increases the potential amount of exp and coins you can get from fighting.", x, y);
        if (count == 5)
            Expo.drawString(g, "You can sell items that you find at the Artificery for coins.", x, y);
        if (count == 6)
            Expo.drawString(g, "If your energy goes below 0, you lose a life.", x, y);
        if (count == 7)
            Expo.drawString(g, "Get to level 10 to beat the game.", x, y);
        if (count == 8)
            Expo.drawString(g, "If you run away from a fight, you will drop some coins.", x, y);
        if (count == 9)
            Expo.drawString(g, "Jumping and reading both give you a small amount of exp.", x, y);
        if (count == 10)
            Expo.drawString(g, "If you're having a hard time finding other arcanists, you can always duel at the Hall.", x, y);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////




    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Formatting Methods
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Prints the game title. 
     * Example: Ggamingcode.title(g);
     * Prints title in top left of screen. 
     **/
    public static void title(Graphics g)
    {
        Gact.setText(g, 20);
        Expo.drawString(g, "Catching The Wind", 550, 20);
    }

    /**
     * Prints the user's stats. 
     * Precondition: user is selected
     * Example: Ggamingcode.stats();
     * Will print the current user's stats. 
     **/
    public static void stats(Graphics g)
    {
        
    }

    /**
     * Clears the applet screen. 
     * Example: 
     * Screen shows drawHome();
     * Ggamingcode.refresh();
     * Screen clears back to white. 
     **/
    public static void refresh(Graphics g)
    {
        Expo.setColor(g, Expo.white);
        Expo.fillRectangle(g, 0, 0, 1280, 720);
        Expo.setColor(g, Expo.black);
    }
}