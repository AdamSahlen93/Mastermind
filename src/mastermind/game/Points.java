package mastermind.game;
import java.util.LinkedList;

public abstract class Points
{

    //Point system rules
    //From the user input, a point system is used (Correct Colour or Correct Placement)
    private String correctPlacement = "I";
    private String correctColour = "II";
    private String[] pointsSheet = {"", "", "", ""};

    //Gives the player points based on the user input (their guess)
    public void addPointsForGuess()
    {

    }

    //Scrambles the points in the pointsSheet and shows it to the player
    public void showPointsForGuess()
    {

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
    public String[] getPointsSheet()
    {

        return pointsSheet;
    }

    public void setPointsSheet(String[] pointsSheet)
    {

        this.pointsSheet = pointsSheet;
    }
}

