public class Cell {
    int start;
    int end;

    CellType cellType;

    public Cell(int start, int end, CellType cellType) {
        this.start = start;
        this.end = end;
        this.cellType = cellType;
    }

    public int next(){
        return end;
    }
}
