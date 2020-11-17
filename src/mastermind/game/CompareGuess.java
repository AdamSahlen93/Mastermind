package mastermind.game;
import java.lang.reflect.Array;
import java.util.LinkedList;

public class CompareGuess
{

    //Point system rules
    //From the user input, a point system is used (Correct Colour or Correct Placement)
    private String correctPlacement = "I";
    private String correctColour = "II";
    private LinkedList<String> pointsSheet = new LinkedList<>();
    private LinkedList<Integer> opponentSheetCopy = new LinkedList<>();
    private LinkedList<Integer> playerSheetCopy = new LinkedList<>();

    //Gives the player points based on the user input (their guess)

    public void addPointsForGuess()
    {
        for (int i = 0; i<4; i++)
        {
            if (playerSheetCopy.get(i) == opponentSheetCopy.get(i))
            {
                pointsSheet.add(i,correctColour);
            }
        }
    }

    //Scrambles the points in the pointsSheet and shows it to the player
    public void showPointsForGuess()
    {
        System.out.print(pointsSheet.toString());
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

