import java.util.*;

/**
 * 
 * GAMINGCODE CLASS UPDATE: 2/13/2018
 * 
 * The gamingcode class contains all of the methods used by the CatchingTheWind_Text
 * class. It was originally created by Zachary Suzuki as an ongoing project in computer 
 * science. The gamingcode class accesses the act class for various calculations. 
 * 
 * Methods in the gamingcode class include: 
 * backstory - which contains a series of println statements that give some background 
 * on the game to the user. 
 * account - which contains 5 possible users, and accesses their information if a 
 * specific name is used. 
 * title - which prints the title of the game. 
 * stats - which prints the users stats in the game. 
 * tutorial - which has information on the game and how to play it. 
 * actions - which runs all of the code that allows the game to run. 
 * refresh - which clears the screen. 
 * win - which runs if the win requirements are met. 
 * lose - which runs if the lose requirements are met. 
 * 
 * The gamingcode class is accessed by the CatchingTheWind_Text class, and contains 
 * all of the code run by the CatchingTheWind_Text class. 
 * 
 * to call methods from the act class, use "Gamingcode.methodName();"
 * 
 **/
public class Gamingcode
{
    static Scanner input = new Scanner(System.in);

    static int prevlvl;

    /**
     * Prints out the beginning storyline for the game. It contains two groups of println 
     * statements, the first being the user's goals, the second being the actual beginning 
     * storyline. 
     * Example: Gamingcode.backstory();
     * prints all the statements within the backstory method. 
     **/
    public static void backstory()
    {
        //backstory
            System.out.println("As a child, you were always interested in the magics that went on at the ");
            System.out.println("University, a school for arcanists. Many arcanists only know how to use ");
            System.out.println("simple energy manipulation, but there are others who have real magic. There ");
            System.out.println("was one man who taught there as a master. His name was Elodin. Elodin ");
            System.out.println("knew the Names of many things, and so they were his to command. One Name ");
            System.out.println("particularly intrigued you: the Name of the wind. Now that you are older, ");
            System.out.println("you made it your goal to find the Name of the wind, so you can do real ");
            System.out.println("magic. ");
            input.nextLine();

        //Intro
            System.out.println("You: Hm, I'm finally 16 now, so I can go to the University to learn about ");
            System.out.println("magic.");
            input.nextLine();
            System.out.println("Narrator: you catch a ride on one of the carts going through your town that is ");
            System.out.println("heading in the direction of the University, leaving your home behind. When you ");
            System.out.println("arrive, you search for Elodin, who can teach you how to find the Name of the wind. ");
            input.nextLine();
            System.out.println("You find Elodin at the University and call out to him...");
            input.nextLine();
            System.out.println("Elodin: Ah, and what might you be here for?");
            input.nextLine();
            System.out.println("You: I want to learn the Name of the wind.");
            input.nextLine();
            System.out.println("Elodin: Well, you've come to the right place. Good luck!");
            input.nextLine();
    }

    /**
     * returns a specific account if that account's name is called, and the password is 
     * entered. If a name is input that is not part of the 5 available accounts, it creates 
     * a new game with the default stats. 
     * Example: Gamingcode.account();
     * Displays "What would you like your name to be?: " to the user, asking for an input. 
     * if input is one of the 5 accounts - "You accessed account <name>!" "Your name is now
     * <name>!". 
     * if it is a new name - "You created a new user!" "Your name is now <name>!". 
     **/
    public static void account()
    {
        System.out.print("What would you like your name to be?: ");
        Var.name = input.nextLine();
        if ("Zachary".equalsIgnoreCase(Var.name))
        {
            int j;
            for (j = 1; j <= 5; j++)
            {
                System.out.print("What is your password?: ");
                String pass = input.nextLine();
                if (Pass.account1pass.equals(pass))
                {
                    Account.account1Set("Zachary");
                    System.out.println("You accessed account Zachary!");
                    System.out.println("Your name is now: " + Var.name);
                    j = 10;
                }
                else
                    System.out.println("You have the wrong password!");
            }
            if (j < 10)
            {
                System.out.print("What would you like your name to be?: ");
                Var.name = input.nextLine();
            }
        }
        else if ("Ryden".equalsIgnoreCase(Var.name))
        {
            int j;
            for (j = 1; j <= 5; j++)
            {
                System.out.print("What is your password?: ");
                String pass = input.nextLine();
                if (Pass.account2pass.equals(pass))
                {
                    Account.account2Set("Ryden");
                    System.out.println("You accessed account Ryden!");
                    System.out.println("Your name is now: " + Var.name);
                    j = 10;
                }
                else
                    System.out.println("You have the wrong password!");
            }
            if (j < 10)
            {
                System.out.print("What would you like your name to be?: ");
                Var.name = input.nextLine();
            }
        }
        else if ("null3".equalsIgnoreCase(Var.name))
        {
            int j;
            for (j = 1; j <= 5; j++)
            {
                System.out.print("What is your password?: ");
                String pass = input.nextLine();
                if (Pass.account3pass.equals(pass))
                {
                    Account.account3Set("null3");
                    System.out.println("You accessed account null3!");
                    System.out.println("Your name is now: " + Var.name);
                    j = 10;
                }
                else
                    System.out.println("You have the wrong password!");
            }
            if (j < 10)
            {
                System.out.print("What would you like your name to be?: ");
                Var.name = input.nextLine();
            }
        }
        else if ("null4".equalsIgnoreCase(Var.name))
        {
            int j;
            for (j = 1; j <= 5; j++)
            {
                System.out.print("What is your password?: ");
                String pass = input.nextLine();
                if (Pass.account4pass.equals(pass))
                {
                    Account.account4Set("null4");
                    System.out.println("You accessed account null4!");
                    System.out.println("Your name is now: " + Var.name);
                    j = 10;
                }
                else
                    System.out.println("You have the wrong password!");
            }
            if (j < 10)
            {
                System.out.print("What would you like your name to be?: ");
                Var.name = input.nextLine();
            }
        }
        else if ("null5".equalsIgnoreCase(Var.name))
        {
            int j;
            for (j = 1; j <= 5; j++)
            {
                System.out.print("What is your password?: ");
                String pass = input.nextLine();
                if (Pass.account5pass.equals(pass))
                {
                    Account.account5Set("null5");
                    System.out.println("You accessed account null5!");
                    System.out.println("Your name is now: " + Var.name);
                    j = 10;
                }
                else
                    System.out.println("You have the wrong password!");
            }
            if (j < 10)
            {
                System.out.print("What would you like your name to be?: ");
                Var.name = input.nextLine();
            }
        }
        else if (!"Zachary".equalsIgnoreCase(Var.name) &&
        !"Ryden".equalsIgnoreCase(Var.name) &&
        !"null3".equalsIgnoreCase(Var.name) &&
        !"null4".equalsIgnoreCase(Var.name) &&
        !"null5".equalsIgnoreCase(Var.name))
        {
            Var.coins = 20;
            Var.exp = 0;
            Var.lives = 3;
            Var.energy = 20;
            Var.maxEnergy = 20;
            Var.innLevel = 1;
            Var.commonItem = 0;
            Var.uncommonItem = 0;
            Var.rareItem = 0;
            Var.epicItem = 0;
            Var.legendaryItem = 0;
            System.out.println("You created a new user!");
            System.out.println("Your name is now: " + Var.name);
        }
        prevlvl = Var.lvl;
        input.nextLine();
    }

    /**
     * Prints out the title onto the screen, as well as calculating the user's current lvl. 
     * Example: Gamingcode.title();
     * Displays the println statements shown below. 
     **/
    public static void title()
    {
        //level calculator
            if ((Var.exp/2) >= Var.expCalc)
            {
                Var.lvl += 1;
                Var.expCalc *= 2;
            }
        //Title screen and stats
            System.out.println("*********************");
            System.out.println("* Catching the Wind *");
            System.out.println("*********************");
            System.out.println();
    }

    /**
     * Prints out the user's stats onto the screen. 
     * Precondition: Gamingcode.account(); has already been run. 
     * Example: Gamingcode.stats();
     * displays the current user's stats. 
     **/
    public static void stats()
    {
            System.out.println("Places:                        " + Var.name + "'s Stats:");
            System.out.println("University                     Lvl " + Var.lvl);
            System.out.println("Bridge                         Lives: " + Var.lives);
            System.out.println("Hall                           Energy: " + Var.energy + "/" + Var.maxEnergy);
            System.out.println("Inn                            Inn Lvl " + Var.innLevel);
            System.out.println("Artificery                     Exp: " + Var.exp);
            System.out.println("Options                        Coins: " + Var.coins);
    }

    /**
     * Prints out information for the user. 
     * Example: Gamingcode.tutorial();
     * Displays the text shown below. 
     **/
    public static void tutorial()
    {
        System.out.println("Options will allow you to set your username.");
        System.out.println("At the University, you can look around or read. While looking around, you have a chance ");
        System.out.println("to find items, fight other arcanists, or progress the storyline. Reading grants you a small ");
        System.out.println("amount of exp.");
        System.out.println("At the bridge, you can look around or jump off. Jumping grants you a small amount of exp.");
        System.out.println("At the hall, you can look around or duel other arcanists. You spend energy to duel other ");
        System.out.println("arcanists, and if you win, you can gain exp and coins.");
        System.out.println("At the inn, you can rest or work. Resting replenishes your energy, and working will give ");
        System.out.println("you coins that you can spend at the Artificery. Increasing the level of your inn will allow ");
        System.out.println("you to earn more coins.");
        System.out.println("At the Artificery, you can buy or sell. You can buy things that increase your stats. Items ");
        System.out.println("found around the game can be sold for coins.");
        input.nextLine();
    }
 
    /**
     * Allows the user to choose which action to take in-game. This section includes the 
     * actions listed below. 
     * Precondition: user inputs one of the choices outlined in the println statement. 
     * Example: Gamingcode.actions();
     * User inputs "Read"
     * Code runs the if "Read" statement. 
     **/
    public static void actions()
    {
        System.out.println();
        System.out.println("Choices: Options, Info, lookUniversity, lookBridge, lookHall, ");
        System.out.println("Read, Jump, Duel, Work, Rest, Buy, Sell, listItems and Save.");
        System.out.println();
        if (prevlvl < Var.lvl)
        {
            System.out.print("You gained a level!");
            input.nextLine();
            prevlvl = Var.lvl;
        }
        System.out.println();
        System.out.print("What would you like to do?: ");
        Var.actions = input.nextLine();
        if ("Save".equalsIgnoreCase(Var.actions))
        {
            System.out.println("        Var.name = name;");
            System.out.println("        Var.lvl = " + Var.lvl + ";");
            System.out.println("        Var.tips = \"on\";");
            System.out.println("        Var.coins = " + Var.coins + ";");
            System.out.println("        Var.exp = " + Var.exp + ";");
            System.out.println("        Var.expCalc = " + Var.expCalc + ";");
            System.out.println("        Var.lives = " + Var.lives + ";");
            System.out.println("        Var.energy = " + Var.energy + ";");
            System.out.println("        Var.maxEnergy = " + Var.maxEnergy + ";");
            System.out.println("        Var.innLevel = " + Var.innLevel + ";");
            System.out.println("        Var.commonItem = " + Var.commonItem + ";");
            System.out.println("        Var.uncommonItem = " + Var.uncommonItem + ";");
            System.out.println("        Var.rareItem = " + Var.rareItem + ";");
            System.out.println("        Var.epicItem = " + Var.epicItem + ";");
            System.out.println("        Var.legendaryItem = " + Var.legendaryItem + ";");
            System.out.print("Would you like to continue playing?(yes/no): ");
            Var.play = input.nextLine();
        }
        if ("Options".equalsIgnoreCase(Var.actions))
        {
            System.out.println("Options: setName, Tips");
            System.out.print("What would you like to do?: ");
            Var.options = input.nextLine();
            if ("setName".equalsIgnoreCase(Var.options))
            {
                System.out.print("What would you like to change your name to?: ");
                Var.name = input.nextLine();
                System.out.println("Name changed to " + Var.name + "!");
            }
            if ("Tips".equalsIgnoreCase(Var.options))
            {
                System.out.println("Tips option has not been set up yet.");
            }
            input.nextLine();
        }
        if ("Info".equalsIgnoreCase(Var.actions))
        {
            System.out.println("At the University, you can look around or read. While looking around, you have a chance ");
            System.out.println("to find items, fight other arcanists, or progress the storyline. Reading grants you a small ");
            System.out.println("amount of exp.");
            System.out.println("At the bridge, you can look around or jump off. Jumping grants you a small amount of exp.");
            System.out.println("At the hall, you can look around or duel other arcanists. You spend energy to duel other ");
            System.out.println("arcanists, and if you win, you can gain exp and coins.");
            System.out.println("At the inn, you can rest or work. Resting replenishes your energy, and working will give ");
            System.out.println("you coins that you can spend at the Artificery. Increasing the level of your inn will allow ");
            System.out.println("you to earn more coins.");
            System.out.println("At the Artificery, you can buy or sell. You can buy things that increase your stats. Items ");
            System.out.println("found around the game can be sold for coins.");
            input.nextLine();
        }
        if ("lookUniversity".equalsIgnoreCase(Var.actions))
        {
            if (Var.coins >= 1)
            {
                Var.goPlace = "University";
                Act.lookChance();
                Var.leavePlace = "University";
            }
            else if (Var.coins < 1)
            {
                System.out.println("I'm sorry, but you don't have enough money for that.");
            }
            input.nextLine();
        }
        if ("lookBridge".equalsIgnoreCase(Var.actions))
        {
            if (Var.coins >= 1)
            {
                Var.goPlace = "  Bridge  ";
                Act.lookChance();
                Var.leavePlace = "  Bridge  ";
            }
            else if (Var.coins < 1)
            {
                System.out.println("I'm sorry, but you don't have enough money for that.");
            }
            input.nextLine();
        }
        if ("lookHall".equalsIgnoreCase(Var.actions))
        {
            if (Var.coins >= 1)
            {
                Var.goPlace = "   Hall   ";
                Act.lookChance();
                Var.leavePlace = "   Hall   ";
            }
            else if (Var.coins < 1)
            {
                System.out.println("I'm sorry, but you don't have enough money for that.");
            }
            input.nextLine();
        }
        if ("Read".equalsIgnoreCase(Var.actions))
        {
            Var.goPlace = "University";
            if (Var.goPlace != Var.leavePlace)
            {
                Graphic.move();
                refresh();
                stats();
                System.out.println("You go to the University...");
            }
            System.out.println("reading a book...(5 secs)");
            Act.wait(5000);
            Var.value = Act.rand(5);
            System.out.println("You read a book. Congragulations! You earned " + Var.value + " exp point(s)!");
            Var.exp = Var.exp + Var.value;
            input.nextLine();
            Var.leavePlace = "University";
        }
        if ("Jump".equalsIgnoreCase(Var.actions))
        {
            Var.goPlace = "  Bridge  ";
            if (Var.goPlace != Var.leavePlace)
            {
                Graphic.move();
                refresh();
                stats();
                System.out.println("You go to the Bridge...");
            }
            System.out.println("jumping off the bridge...(2 secs)");
            Act.wait(2000);
            Var.value = Act.rand(2);
            System.out.println("You jumped off the bridge and got some real-life experience. Congragulations! You ");
            System.out.println("earned " + Var.value + " exp point(s)!");
            Var.exp = Var.exp + Var.value;
            input.nextLine();
            Var.leavePlace = "  Bridge  ";
        }
        if ("Duel".equalsIgnoreCase(Var.actions))
        {
            Var.goPlace = "   Hall   ";
            if (Var.goPlace != Var.leavePlace)
            {
                Graphic.move();
                refresh();
                stats();
                System.out.println("You go to the hall...");
            }
            System.out.println("You choose to duel another arcanist!");
            Act.fight();
            input.nextLine();
            Var.leavePlace = "   Hall   ";
        }
        if ("Work".equalsIgnoreCase(Var.actions))
        {
            int min;
            Var.goPlace = "   Inn    ";
            if (Var.goPlace != Var.leavePlace)
            {
                Graphic.move();
                refresh();
                stats();
                System.out.println("You go to your inn...");
            }
            System.out.println("working the bar...(10 secs)");
            Act.wait(10000);
            Var.value = ((Act.rand((Var.innLevel - 10)) + 11)/2);
            System.out.println("You earned " + Var.value + " coins! good work!");
            Var.coins = Var.coins + Var.value;
            input.nextLine();
            Var.leavePlace = "   Inn    ";
        }
        if ("Rest".equalsIgnoreCase(Var.actions))
        {
            Var.goPlace = "   Inn    ";
            if (Var.goPlace != Var.leavePlace)
            {
                Graphic.move();
                System.out.println("You go to your inn...");
            }
            System.out.println("I can't wait to get into bed...");
            System.out.println("resting...(10 secs)");
            Act.wait(10000);
            System.out.println("Energy recharged!");
            Var.energy = Var.maxEnergy;
            input.nextLine();
            Var.leavePlace = "   Inn    ";
        }
        if ("Buy".equalsIgnoreCase(Var.actions))
        {
            Var.goPlace = "Artificery";
            if (Var.goPlace != Var.leavePlace)
            {
                Graphic.move();
                refresh();
                stats();
                System.out.println("You go to the Artificery...");
            }
            System.out.println("Options: ");
            System.out.println("+1 Max Energy: " + ((Var.maxEnergy - 20)/5 + 5) + " coins");
            System.out.println("+1 Inn Level: " + ((Var.innLevel - 1) + 5) + " coins");
            System.out.println("+1 Life: " + (5 * (Var.lives - 3) + 20) + " coins");
            System.out.println();
            System.out.print("What would you like to buy?: ");
            Var.shop = input.nextLine();
            Act.cost();
            if (Var.coins >= Var.price)
            {
                System.out.println("You bought + 1 " + Var.shop + "(s)!");
                Var.coins = Var.coins - Var.price;
            }
            else if (Var.coins < Var.price)
            {
                System.out.println("I'm sorry, but you don't have enough coins for that.");
            }
            input.nextLine();
            Var.leavePlace = "Artificery";
        }
        if ("Sell".equalsIgnoreCase(Var.actions))
        {
            Var.goPlace = "Artificery";
            if (Var.goPlace != Var.leavePlace)
            {
                Graphic.move();
                refresh();
                stats();
                System.out.println("You go to the Artificery...");
            }
            System.out.println("You have: ");
            System.out.println("Common Items: " + Var.commonItem);
            System.out.println("Uncommon Items: " + Var.uncommonItem);
            System.out.println("Rare Items: " + Var.rareItem);
            System.out.println("Epic Items: " + Var.epicItem);
            System.out.println("Legendary Items: " + Var.legendaryItem);
            System.out.println("Options: ");
            System.out.println("1 Common Item: 1 coin");
            System.out.println("1 Uncommon Item: 2 coins");
            System.out.println("1 Rare Item: 5 coins");
            System.out.println("1 Epic Item: 10 coins");
            System.out.println("1 Legendary Item: 20 coins");
            System.out.println("Sell All: " + ((Var.commonItem * 1) + (Var.uncommonItem * 2) + (Var.rareItem * 5) + (Var.epicItem * 10) + (Var.legendaryItem * 20)) + " coins");
            System.out.println();
            System.out.print("What would you like to sell?: ");
            Var.shop = input.nextLine();
            if (!"Sell All".equalsIgnoreCase(Var.shop))
            {
                System.out.print("How many would you like to sell?: ");
                Var.shopNumber = input.nextInt();
                input.nextLine();
                Act.cost();
            }
            if (Var.item >= (Var.shopNumber) && !"Sell All".equalsIgnoreCase(Var.shop))
            {
                System.out.println("You sold " + Var.shopNumber + " " + Var.shop + "(s)!");
                Var.coins = Var.coins + (Var.shopNumber * Var.price);
            }
            if ("Sell All".equalsIgnoreCase(Var.shop))
            {
                Act.cost();
                System.out.println("You sold all of your items!");
                Var.coins = Var.coins + Var.price;
            }
            input.nextLine();
            Var.leavePlace = "Artificery";
        }
        if ("listItems".equalsIgnoreCase(Var.actions))
        {
            System.out.println("Common Items: " + Var.commonItem);
            System.out.println("Uncommon Items: " + Var.uncommonItem);
            System.out.println("Rare Items: " + Var.rareItem);
            System.out.println("Epic Items: " + Var.epicItem);
            System.out.println("Legendary Items: " + Var.legendaryItem);
            input.nextLine();
        }
    }
    
    /**
     * Clears the screen and prints out the title at the top of the screen. 
     * Example: 
     * Screen shows - 
     * "Hello World"
     * "My name is Joe"
     * (Gamingcode.refresh())
     * Screen is cleared and title is printed out. 
     **/
    public static void refresh()
    {
        System.out.print('\u000c');
        title();
    }
    
    /**
     * Prints out either a win or lose statement depending on which conditions are met. 
     * Precondition: lives <= 0 or lvl >= 10, lives > 0
     * Example: lives <= 0
     * Displays - "You ran out of lives! game over!
     **/
    public static void win()
    {
        System.out.println("Congragulations, you beat the game!");
    }
    public static void lose()
    {
        System.out.println("You ran out of lives! game over!");
    }
}