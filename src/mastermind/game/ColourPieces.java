package mastermind.game;
import java.util.HashMap;
import java.util.Map;


class ColourPieces
{
    HashMap<Integer,String> piecesPile = new HashMap<>();

    public void addToPiecesPile()
    {
        for (int i= 0; i<8; i++)
        {
            piecesPile.put((i+1), EnumAvailableColours.values()[i].toString());
        }
    }


    public void showSortedPiecesList()
    {
        for (Map.Entry<Integer,String> entry : piecesPile.entrySet())
        {
            String key = entry.getKey().toString();
            String value = entry.getValue();
            System.out.println(key + ". " + value);
        }
    }
}
