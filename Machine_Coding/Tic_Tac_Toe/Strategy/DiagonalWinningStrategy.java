package Machine_Coding.Tic_Tac_Toe.Strategy;

import java.util.HashMap;

import Machine_Coding.Tic_Tac_Toe.Models.Board;
import Machine_Coding.Tic_Tac_Toe.Models.Move;

public class DiagonalWinningStrategy implements WinningStrategy{
    HashMap<String,Integer> lDiag = new HashMap<>();
    HashMap<String,Integer> rDiag = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int rowNo = move.getCell().getRowNo();
        int colNo = move.getCell().getColNo();
        String playerSymbol = move.getPlayer().getSymbol();
        int size = board.getSize();
        if(rowNo == colNo){
            lDiag.put(playerSymbol,lDiag.getOrDefault(playerSymbol,0)+1);
            if(lDiag.get(playerSymbol) == size) return true;
        }
        else if(rowNo+colNo == size){
            rDiag.put(playerSymbol,rDiag.getOrDefault(playerSymbol,0)+1);
            if(rDiag.get(playerSymbol) == size) return true;
        }
        return false;
    }
    @Override
    public void undo(Board board,Move lastMove) {
        int row = lastMove.getCell().getRowNo();
        int col = lastMove.getCell().getColNo();
        String playerSymbol = lastMove.getPlayer().getSymbol();
        int size = board.getSize();
        if(row == col){
            lDiag.put(playerSymbol,lDiag.get(playerSymbol)-1);
        }
        else if(row+col == size){
            rDiag.put(playerSymbol,rDiag.get(playerSymbol)-1);
        }
    }
}
