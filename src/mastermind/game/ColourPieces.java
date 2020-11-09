package mastermind.game;
import java.util.HashMap;
import java.util.LinkedList;


abstract class ColourPieces
{
    //Hashmap which will hold the available colours (from Enum) and corresponding key
    HashMap<Integer, String> piecesPile = new HashMap<>();
    LinkedList <String> sortedPiecesList = new LinkedList<>();

    //Adding the colours to the Hashmap form Enum with a corresponding key - Adding sorted Key and Value to String in List
    public void addToPiecesPile()
    {
        piecesPile.put(1, EnumAvailableColours.BLUE.toString());
        sortedPiecesList.add("1." + EnumAvailableColours.BLUE);
        piecesPile.put(2, EnumAvailableColours.GREEN.toString());
        sortedPiecesList.add("2." + EnumAvailableColours.GREEN);
        piecesPile.put(3, EnumAvailableColours.ORANGE.toString());
        sortedPiecesList.add("3." + EnumAvailableColours.ORANGE);
        piecesPile.put(4, EnumAvailableColours.PINK.toString());
        sortedPiecesList.add("4." + EnumAvailableColours.PINK);
        piecesPile.put(5, EnumAvailableColours.PURPLE.toString());
        sortedPiecesList.add("5." + EnumAvailableColours.PURPLE);
        piecesPile.put(6, EnumAvailableColours.RED.toString());
        sortedPiecesList.add("6." + EnumAvailableColours.RED);
        piecesPile.put(7, EnumAvailableColours.WHITE.toString());
        sortedPiecesList.add("7." + EnumAvailableColours.WHITE);
        piecesPile.put(8, EnumAvailableColours.YELLOW.toString());
        sortedPiecesList.add("8." + EnumAvailableColours.YELLOW);
    }

    //Printing out the sorted list to show the colour options with corresponding key
    public void showSortedPiecesList()
    {

        System.out.print("|  ");
        for (String showSortedPiecesList : sortedPiecesList )
        {
            System.out.print(showSortedPiecesList + "  |  ");
        }
        System.out.println("\n");
    }
}
