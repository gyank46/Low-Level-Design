package Models;

import Enums.CellType;
import Interface.Board;
import Interface.BoardMoveRule;

import java.util.concurrent.RecursiveTask;

public class RectangularBoardMoveRule implements BoardMoveRule {
    RectangularBoard rectangularBoard;
    public RectangularBoardMoveRule(RectangularBoard rectangularBoard){
        this.rectangularBoard = rectangularBoard;
    }
    @Override
    public int move(int currPos, int diceRollCount) {
        if(currPos == -1){
            if((diceRollCount != 1) && diceRollCount !=6){
                System.out.println("OOPS! Please get 1 or 6 to start making move on board");
                return -1;
            }
            return rectangularBoard.getCell(1).next();
        }
        int newPosition = currPos+diceRollCount;
        if(newPosition > rectangularBoard.getBoardHeight()* rectangularBoard.getBoardWidth()){
            System.out.println("Invalid Move! Move out of bound");
            return currPos;
        }
        return getNewPosition(newPosition);
    }

    private int getNewPosition(int newPosition) {
        RectangularBoardCell cell = rectangularBoard.getCell(newPosition);
        while(cell.cellType !=CellType.NORMAL){
            if(cell.cellType == CellType.LADDER){
                System.out.println("Woah!! You found a ladder from "+ cell.x+ " to "+cell.next());
            }
            if(cell.cellType == CellType.SNAKE){
                System.out.println("OOPS!! You got bit by a snake at "+ cell.x);
            }
            cell = rectangularBoard.getCell(cell.next());
        }
        return cell.next();
    }


}
