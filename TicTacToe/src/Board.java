import java.util.ArrayList;
import java.util.List;

public class Board {
    Cell[][] boardCells;
    public Board(int n){
        boardCells = new Cell[n][n];
    }

    public boolean fillCell(Cell cell){
        if(cell.r>=boardCells.length || cell.c >= boardCells.length){
            System.out.println("Not a valid cell. ");
        }
        if(this.boardCells[cell.r][cell.c].symbol!=null){
            System.out.println("Not a valid move. Space already occupied.");
            return false;
        }

        boardCells[cell.r][cell.c] = cell;
        return true;
    }

}
