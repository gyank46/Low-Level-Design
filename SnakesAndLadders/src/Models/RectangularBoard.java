package Models;

import Enums.CellType;
import Interface.Board;
import Interface.BoardMoveRule;
import Interface.WinnerRule;

public class RectangularBoard implements Board {
    private RectangularBoardCell[][] cellsGrid;
    private final int boardHeight;
    private final int boardWidth;
    private BoardMoveRule boardMoveRule;
    private WinnerRule boardWinningRule;
    public RectangularBoard(int boardHeight, int boardWidth){
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        cellsGrid = new RectangularBoardCell[boardHeight][boardWidth];
        this.boardMoveRule = new RectangularBoardMoveRule(this);
        this.boardWinningRule = new RectangularBoardNormalWinningRule(this);
        initBoard();

    }
    public void initBoard(){
        for(int i=0;i<boardHeight;i++){
            for(int j=0;j<boardWidth;j++){
                cellsGrid[i][j]=new RectangularBoardCell(i,j, CellType.NORMAL);
            }
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
        return boardWinningRule.checkWinner(pos);
    }

    public int getBoardHeight() {
        return boardHeight;
    }
    public int getBoardWidth() {
        return boardWidth;
    }

}
