import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public Scanner scanner = new Scanner(System.in);
    private List<User> players = new ArrayList<>();
    private Board board;

    public boolean isGameOver = false;

    private int boardSize;
    public int turns =0;
    private GameOverStrategy gameOverStrategy;

    public TicTacToe(int boardSize, List<User> players, GameOverStrategy gameOverStrategy){
        this.boardSize= boardSize;
        this.board = new Board(this.boardSize);
        this.players = players;
        this.gameOverStrategy = gameOverStrategy;
    }


    public boolean checkIfGameOver(){
        this.isGameOver = gameOverStrategy.checkIfGameOver(board);
        return isGameOver;
    }

    public void makeBotMove(User user){
        Cell cell = user.makeMove(board);
        board.fillCell(cell);
    }

    public boolean makeHumanMove(User user,int r, int c){
        Cell cell =  new Cell(r,c,user.symbol);
        return board.fillCell(cell);
    }

    public void play(){
        while (turns<boardSize*boardSize){
            User user = players.get(turns % players.size());
            if(user instanceof Humanuser){
                boolean isValidMove = false;
                while (!isValidMove){
                    String name = ((Humanuser) user).name;
                    System.out.println( name+ ", Enter the row: ");
                    int row = scanner.nextInt();
                    System.out.println(name+", Enter the column: ");
                    int col = scanner.nextInt();
                    isValidMove = makeHumanMove(user,row,col);
                }
            }else if(user instanceof BotUser){
                makeBotMove(user);
            }
            if(checkIfGameOver()){
                System.out.println("User with symbol "+ user.symbol +" won!");
                this.isGameOver = true;
                return;
            }
            turns++;
        }
        this.isGameOver = true;
        System.out.println("Game Ended in draw.");
    }


}
