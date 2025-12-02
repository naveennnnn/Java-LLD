package Machine_Coding.Tic_Tac_Toe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Machine_Coding.Tic_Tac_Toe.Controller.GameController;
import Machine_Coding.Tic_Tac_Toe.Models.Player;
import Machine_Coding.Tic_Tac_Toe.Models.PlayerType;
import Machine_Coding.Tic_Tac_Toe.Strategy.ColWinningStrategy;
import Machine_Coding.Tic_Tac_Toe.Strategy.DiagonalWinningStrategy;
import Machine_Coding.Tic_Tac_Toe.Strategy.RowWinningStrategy;
import Machine_Coding.Tic_Tac_Toe.Strategy.WinningStrategy;

public class Main {
    public static void main(String[] args){
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        List<Player> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions of board");
        int size = sc.nextInt();
        WinningStrategy colWinningStrategy = new ColWinningStrategy();
        WinningStrategy rowWinningStrategy = new RowWinningStrategy();
        WinningStrategy diagonalWinningStrategy = new DiagonalWinningStrategy();
        winningStrategies.add(colWinningStrategy);
        winningStrategies.add(rowWinningStrategy);
        winningStrategies.add(diagonalWinningStrategy);

        System.out.println("Enter the number of players");
        int noOfPlayers = sc.nextInt();

        for(int i = 0;i<noOfPlayers;i++){
            System.out.println("Enter the name of the player");
            String name = sc.next();
            System.out.println("Enter the symbol of the player");
            String symbol = sc.next();
            players.add(new Player(name,symbol,PlayerType.HUMAN));
        }
        GameController gameController = new GameController();

    }
}
