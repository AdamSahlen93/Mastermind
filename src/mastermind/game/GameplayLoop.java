package mastermind.game;
import java.util.Scanner;

public class GameplayLoop
{
    Scanner playerGameInput = new Scanner(System.in);
    boolean runGamePlay = true;
    int roundCounter = 1;

    public void startGame()
    {
        while (runGamePlay)
        {
            System.out.println("Round " + roundCounter);
            roundCounter++;
            System.out.println("Round " + roundCounter);
            runGamePlay = false;

            }
        }
    }

