package Machine_Coding.Tic_Tac_Toe.Strategy;

import Machine_Coding.Tic_Tac_Toe.Models.Board;
import Machine_Coding.Tic_Tac_Toe.Models.Move;
import Machine_Coding.Tic_Tac_Toe.Models.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board,Move move);

    void undo(Board board,Move lastMove);
}
