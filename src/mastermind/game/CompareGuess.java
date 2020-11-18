package mastermind.game;
import java.util.LinkedList;

public class CompareGuess
{

    //Point system rules
    //From the user input, a point system is used (Correct Colour or Correct Placement)
    private String correctColour = " - ";
    private String correctPlacement = " = ";
    boolean runGameplay = true;
    private LinkedList<String> pointsSheet = new LinkedList<>();
    private LinkedList<Integer> opponentSheetCopy = new LinkedList<>();
    private LinkedList<Integer> playerSheetCopy = new LinkedList<>();




    public void addPointsForGuess()
    {
        /*System.out.println("Opponent: " + opponentSheetCopy.toString());
        System.out.println("Player: " + playerSheetCopy.toString());
        System.out.println("Points: " + pointsSheet.toString());*/

        for (int i = 0; i<opponentSheetCopy.size();i++)
        {
            if (playerSheetCopy.get(i).equals(opponentSheetCopy.get(i)))
            {
                pointsSheet.addFirst(getCorrectPlacement());
                playerSheetCopy.set(i,0);
                opponentSheetCopy.set(i,0);
            }
        }

        /*
        System.out.println("Opponent: " + opponentSheetCopy.toString());
        System.out.println("Player: " + playerSheetCopy.toString());
        System.out.println("Points: " + pointsSheet.toString());*/


        for (int i = 0; i<opponentSheetCopy.size(); i++)
        {
            int compareForLowerPoint = playerSheetCopy.get(i);
            if (compareForLowerPoint > 0)
            {
                for (int j = 0; j<opponentSheetCopy.size(); j++)
                {
                    if (compareForLowerPoint == opponentSheetCopy.get(j))
                    {
                        pointsSheet.addFirst(getCorrectColour());
                        opponentSheetCopy.set(j,0);
                    }
                }
            }
        }
    }

    //Scrambles the points in the pointsSheet and shows it to the player
    public void showPointsForGuess()
    {
        /*
        System.out.println("Opponent: " + opponentSheetCopy.toString());
        System.out.println("Player: " + playerSheetCopy.toString());
        System.out.println("Points: " + pointsSheet.toString());*/
        System.out.println("This gives you following result: " + pointsSheet.toString());
        System.out.println("\n");
        if (opponentSheetCopy.equals(playerSheetCopy))
        {
            runGameplay = false;
        }
    }

    //Getter
    public String getCorrectPlacement()
    {
        return correctPlacement;
    }

    //Getter
    public String getCorrectColour()
    {

        return correctColour;
    }

    //Getter & Setter
    public LinkedList<String> getPointsSheet()
    {

        return pointsSheet;
    }

    public void setPointsSheet(LinkedList<String> pointsSheet)
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

