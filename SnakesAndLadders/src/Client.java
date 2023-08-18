import Factories.GameFactory;
import Interface.Game;
import Models.Dice;
import Models.Player;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Gyan","sittuk46@gmail.com","7002614683"));
        playerList.add(new Player("Aman","sittuk46@gmail.com","1234567890"));
        playerList.add(new Player("Shomya","sittuk46@gmail.com","7991122544"));
        playerList.add(new Player("Abhieshke","abh@gmail.com","7991122330"));

        List<Dice> diceList = new ArrayList<>();
        diceList.add(new Dice(6));
        Game snakeAndLadderGame = GameFactory.createSnakeAndLadderGame(10,10,playerList,diceList);

        snakeAndLadderGame.play();

    }
}
