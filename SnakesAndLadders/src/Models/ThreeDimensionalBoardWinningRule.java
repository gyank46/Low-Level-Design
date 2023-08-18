package Models;

import Interface.WinnerRule;

public class ThreeDimensionalBoardWinningRule implements WinnerRule {
    public ThreeDimensionalBoardWinningRule(ThreeDimensionalBoard threeDimensionalBoard) {
    }

    @Override
    public boolean checkWinner(int pos) {
        return true;
    }
}
