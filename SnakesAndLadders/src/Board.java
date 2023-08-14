import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> cellList = new ArrayList<>();
    private int boardSize;
    public Board(int n){
        this.boardSize = n;
        for(int i=0;i<boardSize;i++){
            Cell cell = new Cell(i+1,i+1,CellType.NORMAL);
            cellList.add(cell);
        }
    }

    public int getBoardSize() {
        return boardSize;
    }

    public Cell getCell(int index){
        return cellList.get(index);
    }

}
