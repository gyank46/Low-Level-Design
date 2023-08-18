package Models;

import Interface.Board;
import Interface.BoardMoveRule;
import Interface.WinnerRule;

import java.util.List;

public class ThreeDimensionalBoard implements Board {
    int length;
    int width;
    int height;

    private List<ThreeDimensionalBoardCell> cellGrid;

    private BoardMoveRule boardMoveRule;
    private WinnerRule winnerRule;
    public ThreeDimensionalBoard(int length, int width, int height) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.boardMoveRule = new ThreeDimensionalBoardMoveRule(this);
        this.winnerRule = new ThreeDimensionalBoardWinningRule(this);
    }

    @Override
    public void initBoard() {
        for(int i=0;i<height*width*length;i++){
            cellGrid.add(new ThreeDimensionalBoardCell());
        }
    }

    @Override
    public void displayBoard() {

    }

    @Override
    public int makeMove(int currPos, int rollDiceCount) {
        return boardMoveRule.move(currPos,rollDiceCount);
    }

    @Override
    public boolean checkWinner(int pos) {
        return winnerRule.checkWinner(pos);
    }
}
