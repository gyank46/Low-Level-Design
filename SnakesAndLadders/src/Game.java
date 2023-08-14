import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {

    private int totalPlayerCount;
    private int totalDiceFaceCountSum;
    private Boolean isGameOver = false;
    private Board board;
    private Queue<Player> playerQueue = new LinkedList<>();
    private List<Dice> diceList = new ArrayList<>();

    private Game(){
    }

    private Game(GameBuilder gameBuilder){
        this.board = gameBuilder.board;
        this.playerQueue = gameBuilder.playerQueue;
        this.diceList = gameBuilder.diceList;
        this.totalDiceFaceCountSum = getTotalFaceCountSum();
    }

    private int getTotalFaceCountSum() {
        return diceList.stream().mapToInt(Dice::getFaceCount).sum();
    }

    public void play(){
        totalPlayerCount = playerQueue.size();
        while(!isGameOver){
            Player player = playerQueue.remove();
            this.makeMove(player);
            isGameOver = playerQueue.size()==1;
        }
    }

    public boolean isGameOver(){
        return this.isGameOver;
    }
    public void makeMove(Player player){
        int currPos = player.getCurrPos();
        System.out.println(player.getUserName()+", Please roll the dices.");
        int playerTotal = 0;
        for(Dice dice: diceList){
            playerTotal += dice.roll();
        }
        if(currPos==-1){
            if(playerTotal == totalDiceFaceCountSum || playerTotal == diceList.size()){
                player.setCurrPos(1);
            }else {
                System.out.println("User will start the game only if they get " + diceList.size() + " or "+ totalDiceFaceCountSum);
            }
        }else if(currPos+playerTotal > board.getBoardSize()){
            System.out.println("Invalid move! Cell out of bound.");
        }else{
            Cell cell = board.getCell(currPos+playerTotal-1);
            if(cell.cellType == CellType.SNAKE){
                System.out.println("OOPS! "+player.getUserName() +" ,you got bitten by snake!!!");
            }else if(cell.cellType == CellType.LADDER){
                System.out.println("Great news "+player.getUserName()+" ,you just found a ladder!!");
            }
            player.setCurrPos(cell.next());
        }
        if(player.getCurrPos()!= board.getBoardSize()){
            playerQueue.add(player);
        }else {
            System.out.println(player.getUserName() + " finished with rank "+ (totalPlayerCount-playerQueue.size()));
        }
    }


    public static GameBuilder getGameBuilder(){
        return new GameBuilder();
    }

    public static class GameBuilder{
        private int boardSize;
        private Board board;
        private Queue<Player> playerQueue = new LinkedList<>();
        private List<Dice> diceList = new ArrayList<>();

        public GameBuilder setBoardSize(int boardSize){
            this.boardSize = boardSize;
            this.board = new Board(this.boardSize);
            return this;
        }

        public GameBuilder addDiceWithFace(int faceCount){
            this.diceList.add(new Dice(faceCount));
            return this;
        }

        public GameBuilder addPlayer(String name, String emailId, String phoneNumber){
            this.playerQueue.add(new Player(name, emailId, phoneNumber));
            return this;
        }

        public Game Build(){
            // do validation and throw error if no error create object.

            return new Game(this);
        }

        public GameBuilder addSpecialCell(int startIndex, int endIndex, CellType cellType) {
            Cell cell = this.board.getCell(startIndex-1);
            cell.end = endIndex;
            cell.cellType = cellType;
            return this;
        }
    }

}
