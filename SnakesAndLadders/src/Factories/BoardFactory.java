package Factories;

import Interface.Board;
import Models.RectangularBoard;
import Models.ThreeDimensionalBoard;

public class BoardFactory {

    public static Board getRectangularBoardWithDimension(int length, int breadth){
        return new RectangularBoard(length,breadth);
    }

    public static Board getThreeDimensionalBoardWithDimension(int length, int width, int height){
        return new ThreeDimensionalBoard(length,width,height);
    }
}
