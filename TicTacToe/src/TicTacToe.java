import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TicTacToe {
    public Scanner scanner = new Scanner(System.in);
    private List<User> players = new ArrayList<>();
    private Board board;

    private Stack<Cell> cellStack = new Stack<>();

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
        cellStack.push(cell);
        board.fillCell(cell);
    }

    public boolean makeHumanMove(User user,int r, int c){
        boolean result;
        Cell cell =  new Cell(r,c,user.symbol);
        result =  board.fillCell(cell);
        if(result)
            cellStack.push(cell);
        return result;
    }

    public void undo(){
        if(cellStack.isEmpty()){
            System.out.println("Nothing to Undo.");
            return;
        }
        Cell cell = cellStack.pop();
        board.undo(cell);
        turns--;
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
