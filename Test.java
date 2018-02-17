import java.util.*;

public class Test
{
static Scanner input = new Scanner(System.in);
static Random randomGen = new Random();
    public static void randoTest()
    {
        for (int j = 1; j <= 50; j++)
        System.out.println(Act.rand(4));   //the 2 means that there are 2 options, 0 and 1. 
    }
    public static void incrementTest()
    {
        String s = "string";
        int num = 0;
        while(!"".equals(s))
        {
        System.out.print("Enter an increment value(+ or -): ");
        s = input.nextLine();
            if ("+".equals(s))
            {
                num += 1;
                System.out.println(num);
            }
            else if ("-".equals(s))
            {
                num -= 1;
                System.out.println(num);
            }
        Act.wait(1000);
        System.out.print('\u000c');
        }
    }
}