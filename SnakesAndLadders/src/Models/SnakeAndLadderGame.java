package Models;

import Enums.GameState;
import Factories.BoardFactory;
import Interface.Board;
import Interface.Game;
import Interface.TurnTracker;
import Interface.WinnerRule;

import java.util.*;

public class SnakeAndLadderGame implements Game {
    private Board board;
    private List<Player> playerList = new ArrayList<>();
    private List<Dice> diceList = new ArrayList<>();
    private int totalDiceFaceCountSum;
    private GameState gameState;
    private Map<Player, Integer> playerPosition = new HashMap<>();
    private Map<Player,Integer> playerRankMapping = new HashMap<>();
    private TurnTracker turnTracker;
    private WinnerRule winningRule;
    private int rank=1;
    private SnakeAndLadderGame(){
    }

    private SnakeAndLadderGame(SnakeAndLadderGameBuilder snakeAndLadderGameBuilder){
        this.gameState = GameState.WAITING;
        this.board = snakeAndLadderGameBuilder.board;
        this.playerList = snakeAndLadderGameBuilder.playerList;
        this.diceList = snakeAndLadderGameBuilder.diceList;
        this.turnTracker = snakeAndLadderGameBuilder.turnTracker;
        initializeGame();
    }

    @Override
    public void initializeGame() {
        //set Models.Player position
        for(Player player: playerList){
            playerPosition.put(player,-1);
        }
        // get Total Models.Dice Face Count
        getTotalFaceCountSum();

    }
    private void getTotalFaceCountSum() {
        totalDiceFaceCountSum = diceList.stream().mapToInt(Dice::getFaceCount).sum();
    }

    public void play(){
        this.gameState = GameState.STARTED;
        while(!isGameOver()){
            Player player = playerList.get(turnTracker.getCurrentTurn());
            if(playerRankMapping.containsKey(player)){
                continue;
            }
            System.out.println(player.getUserName()+", Please roll the dice!");
            int playerPos = playerPosition.get(player);
            int rollDiceCount = this.rollDice();
            int newPosition = board.makeMove(playerPos,rollDiceCount);
            System.out.println(player.getUserName()+", moved from "+ playerPos+" to "+ newPosition+ " with roll dice of "+ rollDiceCount);
            playerPosition.put(player,newPosition);
            if(checkIfWinner(player)){
                playerRankMapping.put(player,rank);
                rank++;
            }
            updateGameStatus();
        }
        System.out.println("Game is Over with following result.");
        showResults();
    }

    private void showResults() {
        for (Player player : playerRankMapping.keySet()) {
            System.out.println(player.getUserName()+", got the rank "+playerRankMapping.get(player));
        }

    }

    private void updateGameStatus() {
        if(playerRankMapping.size()==playerList.size()-1)
            gameState = GameState.OVER;
    }

    private boolean checkIfWinner(Player player) {
        return board.checkWinner(playerPosition.get(player));
    }

    public int rollDice(){
        int total =0;
        for(Dice dice:diceList){
            total+=dice.roll();
        }
        return total;
    }
    public boolean isGameOver(){
        return gameState == GameState.OVER;
    }


    @Override
    public void addPlayer(Player player) {
        while (gameState == GameState.WAITING){
            playerList.add(player);
        }
    }

    @Override
    public void removePlayer(Player player) {
        while (gameState == GameState.WAITING){
            playerList.add(player);
        }
    }



    public static SnakeAndLadderGameBuilder getGameBuilder(){
        return new SnakeAndLadderGameBuilder();
    }

    public static class SnakeAndLadderGameBuilder {
        private Board board;
        private List<Player> playerList = new ArrayList<>();
        private List<Dice> diceList = new ArrayList<>();
        private TurnTracker turnTracker;

        public SnakeAndLadderGameBuilder setBoardDimension(int boardHeight, int boardWidth){
            this.board = BoardFactory.getRectangularBoardWithDimension(boardHeight,boardWidth);
            return this;
        }

        public SnakeAndLadderGame Build(){
            // do validation and throw error if no error create object.
            return new SnakeAndLadderGame(this);
        }

        public SnakeAndLadderGameBuilder addPlayers(List<Player> players) {
            this.playerList = players;
            return this;
        }

        public SnakeAndLadderGameBuilder addDices(List<Dice> dices) {
            this.diceList = dices;
            return this;
        }

        public SnakeAndLadderGameBuilder setTurnTracker(TurnTracker turnTracker){
            this.turnTracker = turnTracker;
            return this;
        }
    }

}
