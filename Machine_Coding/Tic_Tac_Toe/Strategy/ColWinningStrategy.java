package Machine_Coding.Tic_Tac_Toe.Strategy;

import java.util.HashMap;

import Machine_Coding.Tic_Tac_Toe.Models.Board;
import Machine_Coding.Tic_Tac_Toe.Models.Move;

public class ColWinningStrategy implements WinningStrategy{
    HashMap<Integer,HashMap<String,Integer>> colMap = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int colNo = move.getCell().getColNo();
        String playerSymbol = move.getPlayer().getSymbol();
        HashMap<String,Integer> currMap;
        if(colMap.containsKey(colNo)){
            currMap = colMap.get(colNo);
            currMap.put(playerSymbol,currMap.getOrDefault(playerSymbol,0)+1);
            colMap.put(colNo,currMap);
        }
        else{
            currMap = new HashMap<>();
            currMap.put(playerSymbol,1);
            colMap.put(colNo,currMap);
        }
        int size = board.getSize();
        if(currMap.get(playerSymbol) == size) return true;
        return false;
    }
    
}
