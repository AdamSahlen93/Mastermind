package mastermind.game;

public class GameplayLoop
{

    boolean runGamePlay = true;
    int roundCounter = 1;


    public void startGame()
    {
        Player player = new Player();
        while (runGamePlay)
        {
            System.out.println("Round " + roundCounter);
            player.makeGuess();
            player.playerContinueWithGuess();
            roundCounter++;

            }
        }
    }

