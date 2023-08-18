package Factories;

import Interface.Game;
import Models.Dice;
import Models.Player;
import Models.RoundRobinTurnTracker;
import Models.SnakeAndLadderGame;

import java.util.List;

public class GameFactory {

    public static Game createSnakeAndLadderGame(int boardHeight, int boardWidth, List<Player> players, List<Dice> dices){
        return SnakeAndLadderGame.getGameBuilder()
                .setBoardDimension(boardHeight,boardWidth)
                .addPlayers(players)
                .addDices(dices)
                .setTurnTracker(new RoundRobinTurnTracker(players.size()))
                .Build();
    }
}
