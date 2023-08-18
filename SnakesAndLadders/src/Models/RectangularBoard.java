package Models;

import Enums.CellType;
import Interface.Board;
import Interface.BoardMoveRule;
import Interface.WinnerRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RectangularBoard implements Board {
    private RectangularBoardCell[] cellsGrid;
    private final int boardHeight;
    private final int boardWidth;
    private BoardMoveRule boardMoveRule;
    private WinnerRule boardWinningRule;
    public RectangularBoard(int boardHeight, int boardWidth){
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        cellsGrid = new RectangularBoardCell[boardHeight*boardWidth+1];
        this.boardMoveRule = new RectangularBoardMoveRule(this);
        this.boardWinningRule = new RectangularBoardNormalWinningRule(this);
        initBoard();

    }
    public void initBoard(){
        for(int i=1;i<=boardHeight*boardWidth;i++){
            cellsGrid[i] = (new RectangularBoardCell(i,i,CellType.NORMAL));
        }
        generateSnake();
        generateLadders();
    }

    private void generateLadders() {
        for(int i=0;i<5;i++){
            int startPos = new Random().nextInt(1,boardHeight*boardWidth);
            int endPos = new Random().nextInt(startPos,boardHeight*boardWidth);
            System.out.println("Generating Ladder from Position "+startPos + " to "+endPos);
            RectangularBoardCell cell = cellsGrid[startPos];
            cell.y = endPos;
            cell.cellType = CellType.LADDER;
        }
    }

    private void generateSnake() {
        for(int i=0;i<5;i++){
            int startPos = new Random().nextInt(1,boardHeight*boardWidth);
            int endPos = new Random().nextInt(1,startPos);
            System.out.println("Generating Snake from Position "+startPos + " to "+endPos);
            RectangularBoardCell cell = cellsGrid[startPos];
            cell.y = endPos;
            cell.cellType = CellType.SNAKE;
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

    public RectangularBoardCell getCell(int index){
        return cellsGrid[index];
    }

    public int getBoardHeight() {
        return boardHeight;
    }
    public int getBoardWidth() {
        return boardWidth;
    }

}
