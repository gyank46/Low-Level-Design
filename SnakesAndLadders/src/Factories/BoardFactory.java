package Factories;

import Interface.Board;
import Models.RectangularBoard;

public class BoardFactory {

    public static Board getRectangularBoardWithDimension(int length, int breadth){
        return new RectangularBoard(length,breadth);
    }
}
