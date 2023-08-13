import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    private List<User> players = new ArrayList<>();
    private Board board;

    private GameOverStrategy gameOverStrategy;

    public TicTacToe(int boardSize, List<User> players, GameOverStrategy gameOverStrategy){
        this.board = new Board(boardSize);
        this.players = players;
        this.gameOverStrategy = gameOverStrategy;
    }


    public boolean checkIfGameOver(){
        return gameOverStrategy.checkIfGameOver(board);
    }

    public void makeBotMove(User user){
        Cell cell = user.makeMove(board);
        board.fillCell(cell);
    }

    public boolean makeHumanMove(User user,int r, int c){
        Cell cell =  new Cell(r,c,user.symbol);
        return board.fillCell(cell);
    }


}
