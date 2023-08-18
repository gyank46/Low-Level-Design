package Interface;

public interface Board {

    public void initBoard();
    public void displayBoard();

    public int makeMove(int currPos, int rollDiceCount);

    public boolean checkWinner(int pos);

}
