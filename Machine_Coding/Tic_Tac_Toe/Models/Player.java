package Machine_Coding.Tic_Tac_Toe.Models;

import java.util.Scanner;

public class Player {
    private String name;
    private String symbol;
    private PlayerType playerType;

    Scanner sc = new Scanner(System.in);
    public Player(String name, String symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public PlayerType getPlayerType() {
        return playerType;
    }
    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
    public Move makeMove(Board board) {
        System.out.println("Player: "+this.name+" has to make the move");
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int col = sc.nextInt();
        Cell currCell = board.getCell(row,col);
        currCell.setRowNo(row);
        currCell.setColNo(col);
        currCell.setPlayer(this);
        currCell.setCellState(CellState.OCCUPIED);

        return new Move(this,currCell);
    }
    
}
