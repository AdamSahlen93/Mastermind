package mastermind.game;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


class ColourPieces
{
    HashMap<Integer,String> piecesPile = new HashMap<>();
    HashMap<Integer,String> boardPiecesPile = new HashMap<>();

    public void addToPiecesPile()
    {
        for (int i= 0; i<8; i++)
        {
            piecesPile.put((i+1), EnumAvailableColours.values()[i].toString());
        }
    }

    public void fixCleanBoardList()
    {
        boardPiecesPile.put(1,"  RED  ");
        boardPiecesPile.put(2," GREEN ");
        boardPiecesPile.put(3,"  BLUE ");
        boardPiecesPile.put(4," WHITE ");
        boardPiecesPile.put(5," YELLOW");
        boardPiecesPile.put(6," ORANGE");
        boardPiecesPile.put(7," PURPLE");
        boardPiecesPile.put(8,"  PINK ");
    }


    public void showSortedPiecesList()
    {
        for (Map.Entry<Integer,String> entry : piecesPile.entrySet())
        {
            String key = entry.getKey().toString();
            String value = entry.getValue();
            System.out.print(key + "." + value + " ");
        }
        System.out.println("\n");
    }

}
