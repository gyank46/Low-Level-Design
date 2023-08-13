public class NormalGameOverStrategy implements GameOverStrategy{
    @Override
    public boolean checkIfGameOver(Board board) {
        int length = board.boardCells.length;
        if(board.boardCells[length-1][length-1]!=null){
            return true;
        }
        return false;
    }
}
