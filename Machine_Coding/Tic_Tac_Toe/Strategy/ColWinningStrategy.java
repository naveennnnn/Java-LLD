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
        
        return false;
    }
    
}
