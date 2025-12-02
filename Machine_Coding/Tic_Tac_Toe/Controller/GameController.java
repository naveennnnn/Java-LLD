package Machine_Coding.Tic_Tac_Toe.Controller;

import java.util.List;

import Machine_Coding.Tic_Tac_Toe.Models.Game;
import Machine_Coding.Tic_Tac_Toe.Models.Move;
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
    /**
     * There are two Ways to Build Business Logic
     * 
     * 1. To write the business logic in Models, Usually done in Interactive machine coding rounds
     * 2. To write the business logic in service package, usually done in WEB API machine 
     *    coding rounds, which uses Database.
     * 
     * For this round I will go with WAY-1
     */
    
    
    public Game startGame(int size,List<Player> players,List<WinningStrategy> winningStrategy){
        return new Game(size,players,winningStrategy);
    }

    public void makeMove(Game game){
        game.makeMove();
    }
    

    public void undo(Game game){
        game.undo();
    }

    public void displayBoard(Game game){
        game.printBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
