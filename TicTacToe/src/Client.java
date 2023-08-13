import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User player1 =  new Humanuser("Gyan","7002614683","sittuk46@gmail.com");
        player1.symbol = Symbols.X;

//        MoveMakingStrategy moveMakingStrategy = new RandomMoveStrategy();
//        User player2 = new BotUser(moveMakingStrategy);

        User player2 = new Humanuser("Aman","7991122344","amanbabu@gmail.com");
        player2.symbol = Symbols.O;

        int boardSize = 3;
        List<User> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);

        GameOverStrategy gameOverStrategy =  new NormalGameOverStrategy();

        TicTacToe ticTacToe = new TicTacToe(boardSize,playerList,gameOverStrategy);

        while (!ticTacToe.isGameOver){
            ticTacToe.play();
        }


    }

}
