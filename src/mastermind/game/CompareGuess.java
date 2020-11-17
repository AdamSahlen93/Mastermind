package mastermind.game;
import java.util.LinkedList;

public class CompareGuess
{

    //Point system rules
    //From the user input, a point system is used (Correct Colour or Correct Placement)
    private int correctColour = 1;
    private int correctPlacement = 2;
    boolean runGameplay = true;
    private LinkedList<Integer> pointsSheet = new LinkedList<>();
    private LinkedList<Integer> opponentSheetCopy = new LinkedList<>();
    private LinkedList<Integer> playerSheetCopy = new LinkedList<>();




    public void addPointsForGuess()
    {
        for (int i = 0; i<opponentSheetCopy.size();i++)
        {
            if (playerSheetCopy.get(i).equals(opponentSheetCopy.get(i)))
            {
                pointsSheet.addFirst(getCorrectPlacement());
                playerSheetCopy.set(i,0);
                opponentSheetCopy.set(i,0);
            }

        }

        for (int i = 0; i<playerSheetCopy.size(); i++)
        {
          if (playerSheetCopy.get(i) != 0)
          {
              for (int j = 0; j<opponentSheetCopy.size(); j++)
              {
                  if (playerSheetCopy.get(i).equals(opponentSheetCopy.get(j)))
                  {
                      playerSheetCopy.set(i,0);
                      opponentSheetCopy.set(j,0);
                      pointsSheet.addFirst(getCorrectColour());
                  }

              }
          }

        }
    }

    //Scrambles the points in the pointsSheet and shows it to the player
    public void showPointsForGuess()
    {
        System.out.println("This gives you: " + pointsSheet.toString());
        System.out.println("\n");
        if (opponentSheetCopy.equals(playerSheetCopy))
        {
            runGameplay = false;
        }
    }

    //Getter
    public int getCorrectPlacement()
    {
        return correctPlacement;
    }

    //Getter
    public int getCorrectColour()
    {

        return correctColour;
    }

    //Getter & Setter
    public LinkedList<Integer> getPointsSheet()
    {

        return pointsSheet;
    }

    public void setPointsSheet(LinkedList<Integer> pointsSheet)
    {

        this.pointsSheet = pointsSheet;
    }

    public LinkedList<Integer> getPlayerSheetCopy()
    {

        return playerSheetCopy;
    }

    public void setPlayerSheetCopy(LinkedList<Integer> playerSheetCopy)
    {

        this.playerSheetCopy = playerSheetCopy;
    }

    public LinkedList<Integer> getOpponentSheetCopy()
    {

        return opponentSheetCopy;
    }

    public void setOpponentSheetCopy(LinkedList<Integer> opponentSheetCopy)
    {

        this.opponentSheetCopy = opponentSheetCopy;
    }
}

