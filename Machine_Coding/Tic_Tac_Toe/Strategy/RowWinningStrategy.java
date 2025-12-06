package Machine_Coding.Tic_Tac_Toe.Strategy;

import java.util.HashMap;

import Machine_Coding.Tic_Tac_Toe.Models.Board;
import Machine_Coding.Tic_Tac_Toe.Models.Move;

public class RowWinningStrategy implements WinningStrategy{
    HashMap<Integer,HashMap<String,Integer>> rowMap = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int rowNo = move.getCell().getRowNo();
        String playerSymbol = move.getPlayer().getSymbol();
        HashMap<String,Integer> currMap;
        if(rowMap.containsKey(rowNo)){
            currMap = rowMap.get(rowNo);
            currMap.put(playerSymbol,currMap.getOrDefault(playerSymbol,0)+1);
            rowMap.put(rowNo,currMap);
        }
        else{
            currMap = new HashMap<>();
            currMap.put(playerSymbol,1);
            rowMap.put(rowNo,currMap);
        }
        int size = board.getSize();
        if(currMap.get(playerSymbol) == size) return true;
        return false;
    }
    @Override
    public void undo(Board board,Move lastMove) {
        int row = lastMove.getCell().getRowNo();
        String playerSymbol = lastMove.getPlayer().getSymbol();
        HashMap<String,Integer> currMap = rowMap.get(row);
        currMap.put(playerSymbol,currMap.get(playerSymbol)-1);
    }
}
