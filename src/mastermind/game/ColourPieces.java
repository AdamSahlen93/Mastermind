package mastermind.game;
import java.util.HashMap;

public class ColourPieces
{
    //Hashmap which will hold the available colours (from Enum) and corresponding key
    HashMap<String, Integer> piecesPile = new HashMap<>();

    //Adding the colours to the Hashmap form Enum with a corresponding key
    public void AddToPiecesPile()
    {
        piecesPile.put(EnumAvailableColours.BLUE.toString(),1);
        piecesPile.put(EnumAvailableColours.GREEN.toString(),2);
        piecesPile.put(EnumAvailableColours.ORANGE.toString(),3);
        piecesPile.put(EnumAvailableColours.PINK.toString(),4);
        piecesPile.put(EnumAvailableColours.PURPLE.toString(),5);
        piecesPile.put(EnumAvailableColours.RED.toString(),6);
        piecesPile.put(EnumAvailableColours.WHITE.toString(),7);
        piecesPile.put(EnumAvailableColours.YELLOW.toString(),8);
    }
}
