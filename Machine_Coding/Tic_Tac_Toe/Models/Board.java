package Machine_Coding.Tic_Tac_Toe.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> cells;

    
    public Board(int size) {
        this.size = size;
        for(int i = 0;i<size;i++){
            List<Cell> innerCell = new ArrayList<>();
            for(int j = 0;j<size;j++){
                innerCell.add(new Cell(i,j,null,CellState.FREE));
            }
            cells.add(innerCell);
        }
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public List<List<Cell>> getCells() {
        return cells;
    }
    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    
}
