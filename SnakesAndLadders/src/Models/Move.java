package Models;

public class Move {
    RectangularBoardCell from;
    RectangularBoardCell to;

    public Move(RectangularBoardCell from, RectangularBoardCell to) {
        this.from = from;
        this.to = to;
    }
}
