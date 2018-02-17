import java.util.*;

/**
 *
 * ACT CLASS UPDATE: 2/9/2018
 *
 * The act class contains all of the calculation methods that are used in "CatchingThe
 * Wind". It was originally created by Zachary Suzuki as an ongoing project in computer
 * science. The act class accesses the Var class for variables to use in computing its
 * various methods. 
 *
 * Methods in the act class include: 
 * fight - which runs the fight code in which the user spends energy to defeat an enemy 
 * and earn coins and exp. 
 * lookChance - which is run by the methods lookUniversity, lookBridge, and lookHall, 
 * and provides a random action. 
 * cost - which calculates the price of items and upgrades in the buy and sell methods. 
 * wait and rand - which allow access to Thread.sleep and randomGen commands respectively. 
 *
 * The act class is accessed by the gamingcode class, and contains most calculations 
 * being done by the Ggamingcode class. 
 *
 * To call methods from the act class, use "Act.methodName();"
 *
 **/
public class Act
{

static Scanner input = new Scanner(System.in);
static Random randomGen = new Random();

static int price;

    public static void fight()
    {
        Var.chance = 100;
        int j = 1;
        while (j == 1)
        {
            System.out.print("What would you like to do?(fight, run): ");
            Var.options = input.nextLine();
            if ("fight".equalsIgnoreCase(Var.options))
            {
                System.out.println("You fight another arcanist!");
                System.out.print("How much energy would you like to use?: ");
                Var.alEnergy = input.nextInt();
                Var.energy = Var.energy - Var.alEnergy;
                Var.enEnergy = (randomGen.nextInt(((Var.maxEnergy/3) + (Var.maxEnergy/10))) + 1);
                System.out.println("Your enemy decided to use: " + Var.enEnergy);
                if (Var.energy < 0)
                {
                    Var.lives = Var.lives - 1;
                    System.out.println("Your energy went below 0! You lose a life!");
                    Var.chance = 0;
                    j = 0;
                }
                else if (Var.alEnergy >= Var.enEnergy)
                {
                    System.out.println("You win the battle!");
                    System.out.println("Earned: ");
                    Var.value = (randomGen.nextInt((Var.maxEnergy/3)) + 1);
                    Var.exp = Var.exp + Var.value;
                    System.out.println("+" + Var.value + " exp");
                    Var.value = (randomGen.nextInt((Var.maxEnergy/5)) + 1);
                    System.out.println("+" + Var.value + " coins");
                    Var.coins = Var.coins + Var.value;
                    Var.chance = 0;
                    j = 0;
                }
                else if (Var.enEnergy > Var.alEnergy)
                {
                    Var.value = Act.rand(4);
                    Var.coins = Var.coins - Var.value;
                    System.out.println("You lost! Dropped " + Var.value + " coin(s) while fleeing!");
                    if (Var.coins <= 0)
                    {
                        Var.coins = 0;
                    }
                    Var.chance = 0;
                    j = 0;
                }
            }
            else if ("run".equalsIgnoreCase(Var.options))
            {
                Var.value = (randomGen.nextInt(2) + 1);
                Var.coins = Var.coins - Var.value;
                System.out.println("You dropped " + Var.value + " coin(s) while running away!");
                Var.chance = 0;
                j = 0;
            }
            else if (!"fight".equalsIgnoreCase(Var.options) && 
            !"run".equalsIgnoreCase(Var.options) &&
            !" ".equalsIgnoreCase(Var.options))
            {
                Gamingcode.refresh();
                Gamingcode.stats();
                System.out.println();
                System.out.println("Choices: Options, Info, lookUniversity, lookBridge, lookHall, ");
                System.out.println("Read, Jump, Duel, Work, Rest, Buy, Sell, listItems and Save.");
                System.out.println();
                System.out.println("What would you like to do?: " + Var.actions);
                System.out.println("You spend 1 coin to look around...(5 secs)");
                System.out.println("You bump into another arcanist!");
            }
        }
    }

    public static void lookChance()
    {
        Var.coins = Var.coins - 1;
        System.out.println("You spend 1 coin to look around...(5 secs)");
        Act.wait(5000);
        Var.chance = (randomGen.nextInt(100) + 1);
        if (Var.chance >= 1 && Var.chance <= 25)
        {
            System.out.println("You bump into another arcanist!");
            fight();
        }
        else if (Var.chance >= 26 && Var.chance <= 60)
        {
            System.out.println("You found a common item!");
            System.out.println("put item in inventory...");
            Var.commonItem = Var.commonItem + 1;
        }
        else if (Var.chance >= 61 && Var.chance <= 80)
        {
            System.out.println("You found an uncommon item!");
            System.out.println("put item in inventory...");
            Var.uncommonItem = Var.uncommonItem  + 1;
        }
        else if (Var.chance >= 81 && Var.chance <= 90)
        {
            System.out.println("You found a rare item!");
            System.out.println("put item in inventory...");
            Var.rareItem = Var.rareItem  + 1;
        }
        else if (Var.chance >= 91 && Var.chance <= 95)
        {
            System.out.println("You found an epic item!");
            System.out.println("put item in inventory...");
            Var.epicItem = Var.epicItem  + 1;
        }
        else if (Var.chance >= 96 && Var.chance <= 97)
        {
            System.out.println("You found a legendary item!");
            System.out.println("put item in inventory...");
            Var.legendaryItem = Var.legendaryItem  + 1;
        }
        else if (Var.chance >= 98 && Var.chance <= 100)
        {
            Act.storyline();
            input.nextLine();
        }
    }

    public static int cost()
    {
        if ("Common Item".equalsIgnoreCase(Var.shop))
        {
            Var.item = Var.commonItem;
            if (Var.commonItem < Var.shopNumber)
                Var.shopNumber = Var.commonItem;
            if (Var.commonItem >= Var.shopNumber)
                Var.commonItem = Var.commonItem -  Var.shopNumber; 
            return Var.price = 1;
        }
        if ("Uncommon Item".equalsIgnoreCase(Var.shop))
        {
            Var.item = Var.uncommonItem; 
            if (Var.uncommonItem < Var.shopNumber)
                Var.shopNumber = Var.uncommonItem;
            if ( Var.uncommonItem >= Var.shopNumber)
                 Var.uncommonItem = Var.uncommonItem - Var.shopNumber; 
            return Var.price = 2;
        }
        if ("Rare Item".equalsIgnoreCase(Var.shop))
        {
            Var.item = Var.rareItem; 
            if (Var.rareItem < Var.shopNumber)
                Var.shopNumber = Var.rareItem;
            if (Var.rareItem >= Var.shopNumber)
                Var.rareItem = Var.rareItem - Var.shopNumber; 
            return Var.price = 5;
        }
        if ("Epic Item".equalsIgnoreCase(Var.shop))
        {
            Var.item = Var.epicItem;
            if (Var.epicItem < Var.shopNumber)
                Var.shopNumber = Var.epicItem;
            if (Var.epicItem >= Var.shopNumber)
                Var.epicItem = Var.epicItem - Var.shopNumber;
            return Var.price = 10;
        }
        if ("Legendary Item".equalsIgnoreCase(Var.shop))
        {
            Var.item = Var.legendaryItem;
            if (Var.legendaryItem < Var.shopNumber)
                Var.shopNumber = Var.legendaryItem;
            if (Var.legendaryItem >= Var.shopNumber)
                Var.legendaryItem = Var.legendaryItem - Var.shopNumber; 
            return Var.price = 20;
        }
        if ("Sell All".equalsIgnoreCase(Var.shop))
        {
            Var.price = ((Var.commonItem * 1) + (Var.uncommonItem * 2) + (Var.rareItem * 5) + (Var.epicItem * 10) + (Var.legendaryItem * 20));
            Var.commonItem = 0;
            Var.uncommonItem = 0;
            Var.rareItem = 0;
            Var.epicItem = 0;
            Var.legendaryItem = 0;
            return Var.price;
        }
        if ("Max Energy".equalsIgnoreCase(Var.shop))
        {
            Var.price = ((Var.maxEnergy - 20)/5 + 5);
            if (Var.coins >= Var.price)
                Var.maxEnergy = Var.maxEnergy + 1; 
            return Var.price;
        }
        if ("Inn Level".equalsIgnoreCase(Var.shop))
        {
            Var.price = ((Var.innLevel - 1) + 5);
            if (Var.coins >= Var.price)
                Var.innLevel = Var.innLevel + 1; 
            return Var.price;
        }
        if ("Life".equalsIgnoreCase(Var.shop))
        {
            Var.price = (5 * (Var.lives - 3) + 20);
            if (Var.coins >= Var.price)
                Var.lives = Var.lives + 1; 
            return Var.price;
        }
            return Var.price = 0;
    }

    public static void storyline()
    {
        if (Var.storyline == 1)
        {
            System.out.println();
            System.out.println("You meet Ambrose...");
            System.out.println();
            System.out.println("Ambrose: Ah hello, do you have a message for me?");
            System.out.println();
            System.out.println("You: ...no.");
            System.out.println();
            System.out.println("Ambrose: Oh, I thought you were a messenger boy. I was expecting something. You look ");
            System.out.println("young, what are you doing around the University?");
            System.out.println();
            System.out.println("You: Well, I applied for the University and got accepted by Elodin, one of the masters ");
            System.out.println("here. I want to study Naming.");
            System.out.println();
            System.out.println("Ambrose: You, Name? You look barely big enough to fit those clothes of yours. Leave while ");
            System.out.println("you can, we don't need babies at the University.");
            System.out.println();
            System.out.println("You: Well how old are you then? I'm 16, that's old enough to attend the University.");
            System.out.println();
            System.out.println("I'm 20 fool, and next time you question me, it'll before than a simple telling off.");
            System.out.println();
            System.out.println("Ambrose stalks away, leaving you wondering just what you got yourself into...");
        }
        if (Var.storyline == 2)
        {
            System.out.println();
            System.out.println("You bump into Elodin...");
            System.out.println();
            System.out.println("You: Hi Master Elodin! I looked in the Hall, but I didn't find your class on the sign in ");
            System.out.println("sheet. Where can I sign up for your class?");
            System.out.println();
            System.out.println("Elodin: ...Who are you?");
            System.out.println();
            System.out.println("...");
            System.out.println();
            System.out.println("Ah yes, you're the one who wanted to study Naming, the 16 year old.");
            System.out.println();
            System.out.println("You: Yes sir. So, when can I start?");
            System.out.println();
            System.out.println("Elodin: Come back to me in two years when you're 18. I don't teach kids things that could get ");
            System.out.println("them killed if they aren't careful.");
            System.out.println();
            System.out.println("You: 2 years! Master Elodin, please reconsider, I've come all this way to study Naming.");
            System.out.println();
            System.out.println("Elodin: 2 years boy, no exceptions.");
            System.out.println();
            System.out.println("You decide it isn't worth arguing about, and walk away, determined to learn naming by yourself, ");
            System.out.println("with or without Master Elodin's help.");
        }
        if (Var.storyline == 3 )
        {
            System.out.println("You bump into Ambrose...");
        }
        if (Var.storyline == 4)
        {   
            System.out.println("You bump into Ambrose...");
        }
        if (Var.storyline == 5)
        {
            System.out.println("You bump into Ambrose...");
        }
        if (Var.storyline >= 6)
        {
            System.out.println("There is no more storyline.");
        }
        Var.storyline++;
    }

    public static void wait(int delay)
    { 
        try {Thread.sleep(delay);} //input in seconds
        catch(Exception e){}
    }

    public static int rand(int rand)
    {
        int number = (randomGen.nextInt(rand) + 1);
        return number;
    }
}