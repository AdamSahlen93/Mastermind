package mastermind.game;
import java.util.Scanner;

public class Rules
{
    Scanner rulesScanner = new Scanner(System.in);
    boolean giveInfoToGameSystem = true;

    public void showTheRules()
    {
        System.out.println("\n");
        System.out.println("-----Rules-----");
        System.out.println("\n");
        System.out.println("To exit the Rules menu - type EXIT");
    }

    public void handleTheRules()
    {
        String rulesInput = rulesScanner.nextLine();
        if (rulesInput.equals("EXIT") || rulesInput.equals("exit") || rulesInput.equals("Exit"))
        {
            giveInfoToGameSystem = false;
        }
        else
        {
            System.out.println("Something went wrong, please try again!");
            handleTheRules();
        }
    }
}
