import java.util.*;

/**
 * 
 * CATCHINGTHEWIND_TEXT CLASS UPDATE: 2/13/2018
 * 
 * The CatchingTheWind_Text class is the main method that runs all other classes. 
 * It was originally created by Zachary Suzuki as an ongoing project in computer
 * science. 
 *
 * The CatchingTheWind_Text class accesses the Var class for variables and the
 * Gamingcode class for the bulk of the code that runs the game. 
 * 
 * To run the CatchingTheWind_Text class, select the class, and run "void main(String[] args)
 * 
 **/
public class CatchingTheWind_Text
{
    public static void main(String args[])
    {
        Gamingcode.refresh();
        Gamingcode.account();
        Gamingcode.refresh();
        Gamingcode.backstory();
        do 
        {
            Gamingcode.refresh();
            Gamingcode.stats();
            Gamingcode.actions();
        } 
        while (Var.lvl <= 10 && Var.lives > 0 && ("yes".equalsIgnoreCase(Var.play)));
        if (Var.lvl >= 20 && Var.lives > 0)
        {
            Gamingcode.win();
        }
        else if (Var.lives <= 0)
            Gamingcode.lose();
    }
}