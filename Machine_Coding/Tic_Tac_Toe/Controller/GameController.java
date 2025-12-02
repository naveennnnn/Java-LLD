package Machine_Coding.Tic_Tac_Toe.Controller;

import java.util.List;

import Machine_Coding.Tic_Tac_Toe.Models.Game;
import Machine_Coding.Tic_Tac_Toe.Models.Player;
import Machine_Coding.Tic_Tac_Toe.Strategy.WinningStrategy;

public class GameController {
    /*
        Will act as Entry point for the game.
        Anyone will interact with the game using this controller. THis is analogous to Waiter
    
        Methods:
            startgame()
            makeMove()
            showBoard()
            doUndo()
            getWinner()
    */
    
    
    public Game startGame(int size,List<Player> players,List<WinningStrategy> winningStrategy){
        return new Game(size,players,winningStrategy);
    }
    
}
