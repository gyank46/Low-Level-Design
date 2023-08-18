package Models;

import Enums.CellType;

public class RectangularBoardCell {
    int x;
    int y;
    CellType cellType;

    public RectangularBoardCell(int x, int y, CellType cellType){
        this.x = x;
        this.y = y;
        this.cellType = cellType;
    }

    public int next(){
        return y;
    }

}
