package Models;

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
            return 1;
        }
        int newPosition = currPos+diceRollCount;
        if(newPosition > rectangularBoard.getBoardHeight()* rectangularBoard.getBoardWidth()){
            System.out.println("Invalid Move! Move out of bound");
            return currPos;
        }
        return newPosition;
    }
}
