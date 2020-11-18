package mastermind.game;
import java.util.LinkedList;
import java.util.Scanner;

public class GameplayLoop
{
    int roundCounter = 1;
    LinkedList<String> previousGuess = new LinkedList<>();
    LinkedList<String> previousPoints = new LinkedList<>();
    Scanner playerInputInGame = new Scanner(System.in);
    CompareGuess compareGuess = new CompareGuess();

    public void startGame()
    {
        Player player = new Player();
        Opponent opponent = new Opponent();
        opponent.makeOpponentChoice();

        while (compareGuess.runGameplay)
        {
            System.out.println("----------------------------------------------------------------------------");
            if (roundCounter > 1)
            {
                System.out.println("\n                           Previous guesses");
                for (int i = 0; i<previousGuess.size(); i++)
                {
                    String result = String.format("%s\t|\t%s\t|\t\t%s","Result for round " + (i+1),previousGuess.get(i),previousPoints.get(i));
                    System.out.println(result);
                }
                System.out.println("\n");
            }
            else
            {
                System.out.println("No guesses yet - make your first guess!");
            }
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Round " + roundCounter);
            player.makeGuess();
            player.ContinueWithGuess();
            boolean thisRound = true;
            while (thisRound)
            {
                compareGuess.getOpponentSheetCopy().clear();
                compareGuess.getPlayerSheetCopy().clear();
                int makeThisGuess = playerInputInGame.nextInt();
                if (makeThisGuess == 1)
                {
                    for (int i = 0; i<player.getCreatedPlayerGuess().length; i++)
                    {
                        compareGuess.getOpponentSheetCopy().addLast(opponent.getOpponentChoice()[i]);
                        compareGuess.getPlayerSheetCopy().addLast(player.getCreatedPlayerGuess()[i]);
                    }
                    compareGuess.addPointsForGuess();
                    compareGuess.showPointsForGuess();
                    previousGuess.addLast(player.colourPieces.piecesPile.get(player.getCreatedPlayerGuess()[0]) + "," + player.colourPieces.piecesPile.get(player.getCreatedPlayerGuess()[1]) + "," + player.colourPieces.piecesPile.get(player.getCreatedPlayerGuess()[2]) + ","  + player.colourPieces.piecesPile.get(player.getCreatedPlayerGuess()[3]));
                    previousPoints.addLast(compareGuess.getPointsSheet().toString());
                    thisRound = false;

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
                for (int i = 0; i < player.getCreatedPlayerGuess().length; i++)
                {
                     player.getCreatedPlayerGuess()[i] = 0;
                }
                compareGuess.getPointsSheet().clear();
            }
                System.out.println("You won! It took you " + roundCounter + " rounds!");

        }

    }

