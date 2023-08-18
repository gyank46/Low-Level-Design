package Interface;

import Models.Player;

public interface Game {

    void initializeGame();
    void addPlayer(Player player);
    void removePlayer(Player player);
    void play();
    boolean isGameOver();

}
