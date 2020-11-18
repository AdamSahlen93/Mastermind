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
        System.out.println("1. The Opponent will choose four colours from the pile and place them in their \"nest\"");
        System.out.println("2. The Opponent can choose the same colour more than once!");
        System.out.println("3. For every round, the Player will make a guess containing four colours in the order that the Player thinks the Opponent has put them in their nest");
        System.out.println("4. After making the guess, the Player will receive feedback based on colour and placement of their guess");
        System.out.println("5. The - symbol means that one of the pieces is of the right colour but placed in the wrong spot");
        System.out.println("   The = symbol means that one of the pieces is of the right colour and placed in the right spot");
        System.out.println("6. Based on  this information, the Player will make a new guess until the guess matches the Opponents nest");
        System.out.println("7. The game will end and the Player is given a score of how many rounds it took to complete the game");
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
