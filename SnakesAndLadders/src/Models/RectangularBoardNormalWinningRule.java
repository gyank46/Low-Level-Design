package Models;

import Interface.WinnerRule;

public class RectangularBoardNormalWinningRule implements WinnerRule {
    RectangularBoard rectangularBoard;
    public RectangularBoardNormalWinningRule(RectangularBoard rectangularBoard){
        this.rectangularBoard = rectangularBoard;
    }
    @Override
    public boolean checkWinner(int pos) {
        int length = rectangularBoard.getBoardHeight();
        int breadth = rectangularBoard.getBoardWidth();
        if(pos == length*breadth)
            return true;
        return false;
    }
}
