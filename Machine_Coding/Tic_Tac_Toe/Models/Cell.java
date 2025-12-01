package Machine_Coding.Tic_Tac_Toe.Models;

public class Cell {
    private int rowNo;
    private int colNo;
    private Player player;
    private CellState cellState;

    
    public Cell(int rowNo, int colNo, Player player, CellState cellState) {
        this.rowNo = rowNo;
        this.colNo = colNo;
        this.player = player;
        this.cellState = cellState;
    }

    public int getRowNo() {
        return rowNo;
    }
    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }
    public int getColNo() {
        return colNo;
    }
    public void setColNo(int colNo) {
        this.colNo = colNo;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

}
