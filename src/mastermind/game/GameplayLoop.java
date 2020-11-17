package mastermind.game;
import java.util.Scanner;

public class GameplayLoop
{

    boolean runGamePlay = true;
    int roundCounter = 1;
    Scanner playerInputInGame = new Scanner(System.in);


    public void startGame()
    {
        Player player = new Player();
        while (runGamePlay)
        {
            System.out.println("Round " + roundCounter);
            player.makeGuess();
            player.ContinueWithGuess();
            boolean newRound = true;
            while (newRound)
            {
                int makeThisGuess = playerInputInGame.nextInt();
                if (makeThisGuess == 1)
                {
                    System.out.println("Result!");
                    newRound = false;
                } else if (makeThisGuess == 2)
                {
                    System.out.println("Ok, lets try again");
                    for (int i = 0; i < player.getCreatedPlayerGuess().length; i++)
                    {
                        player.getCreatedPlayerGuess()[i] = 0;
                    }
                    player.makeGuess();
                    player.ContinueWithGuess();
                }
                else
                {
                    System.out.println("Input error, try again!");
                    player.ContinueWithGuess();
                }
            }
                roundCounter++;
            }
        }
    }

