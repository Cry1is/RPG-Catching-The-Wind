import java.util.*;

/**
 * 
 * ACCOUNT CLASS UPDATE: 2/14/2018
 * 
 * The acount class contains the methods that save data for up to 5 accounts. 
 * 
 * Methods in the account class include: 
 * account1Set - which saves data for account 1
 * account2Set - which saves data for account 2
 * account3Set - which saves data for account 3
 * account4Set - which saves data for account 4
 * account5Set - which saves data for account 5
 * 
 * The account class is accessed by the gamingcode class to decide which account is used. 
 * 
 * To call methods from the account class, use "Account.methodName();"
 * 
 **/

public class Account
{
    public static void account1Set(String name)
    {
        Var.name = name;
        Var.lvl = 7;
        Var.tips = "on";
        Var.coins = 74;
        Var.exp = 755;
        Var.expCalc = 640;
        Var.lives = 2;
        Var.energy = 65;
        Var.maxEnergy = 65;
        Var.innLevel = 33;
        Var.commonItem = 9;
        Var.uncommonItem = 0;
        Var.rareItem = 0;
        Var.epicItem = 0;
        Var.legendaryItem = 3;
    }

    public static void account2Set(String name)
    {
        Var.name = name;
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
    }

    public static void account3Set(String name)
    {
        Var.name = name;
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
    }

    public static void account4Set(String name)
    {
        Var.name = name;
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
    }

    public static void account5Set(String name)
    {
        Var.name = name;
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
    }
}